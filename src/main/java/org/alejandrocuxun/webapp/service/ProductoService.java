/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.alejandrocuxun.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.alejandrocuxun.webapp.model.Producto;
import org.alejandrocuxun.webapp.util.JpaUtil;

/**
 *
 * @author informatica
 */
public class ProductoService implements IProductoService {
    private EntityManager em;
    
    public ProductoService(){
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Producto> listarProductos() {
        return em.createQuery("SELECT p FROM Producto p" , Producto.class).getResultList();
    }

    
    public void agregarProducto(Producto producto) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(producto);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarProducto(int productoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto buscarProductoPorId(int productoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
