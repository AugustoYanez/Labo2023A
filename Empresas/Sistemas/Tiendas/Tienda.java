package Empresas.Sistemas.Tiendas;

import Productos.Cargadores;
import Productos.Multimedia;
import Productos.Producto;

import java.util.ArrayList;

public class Tienda {
    ArrayList<Producto> productos;

    public Tienda(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    public void AgregarProducto( Producto producto1){

        productos.add(producto1);
        System.out.println("PRODUCTO " + producto1.getNombre() + " AGREGADO. ");

    }
    public void ModificarProducto( Producto producto1){

        for ( Producto x : productos){

            if ( (x.getNombre().equals(producto1.getNombre()) && (x.getPrecio() == producto1.getPrecio()) && (x.getStock() == producto1.getStock())) ){

                System.out.println("PRODUCTO " + x.getNombre() + "  MODIFICADO. ");

                x.setNombre("Nombre Modificado");
                x.setPrecio(100);
                x.setStock(10);
                System.out.println("NUEVOS CAMBIOS: ");
                System.out.println(x.getNombre());
                System.out.println(x.getPrecio());
                System.out.println(x.getStock());

            }
        }

    }
    public void EliminarProducto( Producto producto1         ){

        for ( Producto x : productos){
            if ( (x.getNombre().equals(producto1.getNombre()) && (x.getPrecio() == producto1.getPrecio()) && (x.getStock() == producto1.getStock())) ){
                productos.remove(x);
                System.out.println("PRODUCTO " + x.getNombre() + " ELIMNADO. " );
            }
        }


    }

    public Producto obtenerProductoMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto productoMayorStock = productos.get(0);

        for (int i = 1; i < productos.size(); i++) {
            Producto productoActual = productos.get(i);
            if (productoActual.getStock() > productoMayorStock.getStock()) {
                productoMayorStock = productoActual;
            }
        }
        return productoMayorStock;
    }

}
