package ni.edu.uam;

import ni.edu.uam.Ordenamiento.ListanombresAlfabeto;
import ni.edu.uam.Ordenamiento.Numerodesc;
import ni.edu.uam.Ordenamiento.numerosmenormayor;
import ni.edu.uam.arrayList.AgregarNumeros;
import ni.edu.uam.arrayList.NombreEstudiante;
import ni.edu.uam.arrayList.Producto;
import ni.edu.uam.linkedList.LinkelistNombres;
import ni.edu.uam.linkedList.NumerosEnteros;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

    // ejer de lista de nombres de estudiantes:

        NombreEstudiante lista = new NombreEstudiante();

        System.out.println("Lista original:");
        lista.mostrar();

        lista.ordenar();

        System.out.println("Lista ordenada:");
        lista.mostrar();







        System.out.println("\nLinkedList de números enteros y agregar 5 números");
        NumerosEnteros numerosEnteros = new NumerosEnteros();
        numerosEnteros.agregarNumero(5);
        numerosEnteros.agregarNumero(15);
        numerosEnteros.agregarNumero(25);
        numerosEnteros.agregarNumero(35);
        numerosEnteros.agregarNumero(45);
        numerosEnteros.imprimirNumeros();

        System.out.println("\nLinkedList de nombres y agregar 5 nombres");
        LinkelistNombres linkelistNombres = new LinkelistNombres();
        linkelistNombres.agregarNombre("Alice");
        linkelistNombres.agregarNombre("Bob");
        linkelistNombres.agregarNombre("Charlie");
        linkelistNombres.agregarNombreAlInicio("Sara");
        linkelistNombres.agregarNombreAlFinal("Yvonne");
        linkelistNombres.imprimirNombres();

        System.out.println("\nLinkedList de productos y agregar productos");
        LinkedList<Producto> productos1 = new LinkedList<>();
        productos1.add(new Producto("Monitor", 199.99));
        productos1.add(new Producto("Teclado", 49.99));

        for (Producto producto : productos1) {
            System.out.println(producto);
        }

        numerosmenormayor.NumerosAscendente ej1 = new NumerosAscendente();
        ej1.ejecutar();

        ListanombresAlfabeto.ListaNombres ej2 = new ListaNombres();
        ej2.ejecutar();

        Numerodesc.NumerosDescendente ej3 = new NumerosDescendente();
        ej3.ejecutar();

    }
}







