package ni.edu.uam.linkedList;

import java.util.LinkedList;

public class NumerosEnteros {
    LinkedList<Integer> numeros = new LinkedList<>();

    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    public void imprimirNumeros() {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }


}
