package ni.edu.uam;

import ni.edu.uam.arrayList.AgregarNumeros;
import ni.edu.uam.arrayList.Producto;
import ni.edu.uam.linkedList.NumerosEnteros;

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

        System.out.println("\nLinkedList de números enteros y agregar 5 números");
        NumerosEnteros numerosEnteros = new NumerosEnteros();
        numerosEnteros.agregarNumero(5);
        numerosEnteros.agregarNumero(15);
        numerosEnteros.agregarNumero(25);
        numerosEnteros.agregarNumero(35);
        numerosEnteros.agregarNumero(45);
        numerosEnteros.imprimirNumeros();



    }
}