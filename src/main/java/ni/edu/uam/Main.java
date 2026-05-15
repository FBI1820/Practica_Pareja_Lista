package ni.edu.uam;

import ni.edu.uam.modelos.AgregarNumeros;
import ni.edu.uam.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayList de números enteros y agregar 5 números");
        AgregarNumeros agregarN = new AgregarNumeros();
        agregarN.agregarNumero(10);
        agregarN.agregarNumero(20);
        agregarN.agregarNumero(30);
        agregarN.agregarNumero(40);
        agregarN.agregarNumero(50);
        agregarN.imprimirNumeros();


        System.out.println("\nArrayList de productos y agregar productos");
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 999.99));
        productos.add(new Producto("Smartphone", 499.99));
        productos.add(new Producto("Tablet", 299.99));

        for (Producto producto : productos) {
            System.out.println(producto);

        }



    }
}