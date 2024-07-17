
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.alejandrocuxun.webapp.model.Producto;
import org.alejandrocuxun.webapp.util.JpaUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */
public class Main {
    private static EntityManager em = JpaUtil.getEntityManager();
    
    public static void main (String [] args) {
        
        TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p", Producto.class);
        List<Producto> productos = query.getResultList();
        
        productos.forEach(producto -> System.out.println(producto));
        for(Producto producto:productos) {
            System.out.println(producto);
        }
    }
}
