/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.alejandrocuxun.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.alejandrocuxun.webapp.model.Producto;
import org.alejandrocuxun.webapp.service.ProductoService;

/**
 *
 * @author informatica
 */

@WebServlet("/producto-servlet/")
@MultipartConfig
public class ProductoServlet extends HttpServlet{
     private ProductoService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new ProductoService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Producto> productos = ps.listarProductos();
        req.setAttribute("productos", productos);
        req.getRequestDispatcher("/lista-productos/lista-productos.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarProducto(req, resp);
        }else{
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
    public void agregarProducto(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String nombre = req.getParameter("nombreProducto");
        String descripcion = req.getParameter("descripcionProducto");
        String marca = req.getParameter("marcaProducto");
        Double precio = Double.parseDouble(req.getParameter("precioProducto"));
        
        ps.agregarProducto(new Producto(nombre, marca, descripcion, precio));
        
        //resp.sendRedirect("/SGBDProductosIN5CM/index.jsp");
        resp.sendRedirect(req.getContextPath() +  "/");
    }
}
