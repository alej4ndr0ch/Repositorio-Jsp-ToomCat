/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.alejandrocuxun.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Producto;

/**
 *
 * @author informatica
 */
public interface IProductoService {
    public List<Producto> listarProductos();
    
    public void agregarProducto();
    
    public void eliminarProducto(int productoId);
    
    public Producto buscarProductoPorId(int productoId);
    
    public void editarProducto(Producto producto);
}
