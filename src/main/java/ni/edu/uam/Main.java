package ni.edu.uam;

import ni.edu.uam.modelos.AgregarNumeros;

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





    }
}