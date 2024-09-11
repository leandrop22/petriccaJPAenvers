
package org.example;
import Entidades.*;
import audit.Revision;
import config.CustomRevisionListener;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceApp");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            /*Factura factura1 = new Factura();

            factura1.setNumero(16);
            factura1.setFecha("08/09/2024");


            Domicilio dom = new Domicilio("Arenales", 290);
            Cliente cliente = new Cliente("Rodriguez", 33454786, "Juan");
            cliente.setDomicilio(dom);
            dom.setCliente(cliente);

            factura1.setCliente(cliente);

            Categoria perecederos = new Categoria("perecederos");
            Categoria lacteos = new Categoria("lacteos");
            Categoria limpieza = new Categoria("limpieza");

            Articulo articulo1 = new Articulo(100, "yogurt frutilla", 500);
            Articulo articulo2 = new Articulo(400, "detergente industrial", 1500);

            articulo1.getCategoria().add(perecederos);
            articulo1.getCategoria().add(lacteos);
            lacteos.getArticulo().add(articulo1);
            perecederos.getArticulo().add(articulo1);

            articulo2.getCategoria().add(limpieza);
            limpieza.getArticulo().add(articulo2);

            DetalleFactura detalle1 = new DetalleFactura();
                detalle1.setArticulo(articulo1);
                detalle1.setCantidad(2);
                detalle1.setSubtotal(1000);

                articulo1.getDetalle().add(detalle1);
                factura1.getDetalles().add(detalle1);
                detalle1.setFactura(factura1);

            DetalleFactura detalle2 = new DetalleFactura();
                detalle2.setArticulo(articulo2);
                detalle2.setCantidad(1);
                detalle2.setSubtotal(1500);

                articulo2.getDetalle().add(detalle2);
                factura1.getDetalles().add(detalle2);
                detalle2.setFactura(factura1);

            factura1.setTotal(2500);*/

            //em.persist(factura1);


            Factura factura1 =em.find(Factura.class, 1L);
            //factura1.setNumero(85);

            //em.merge(factura1);

            em.remove(factura1);

            em.flush();

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();

        }
        em.close();
        emf.close();
    }

}