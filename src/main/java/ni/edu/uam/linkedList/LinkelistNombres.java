package ni.edu.uam.linkedList;

import java.util.LinkedList;

public class LinkelistNombres {
    LinkedList<String> nombres = new LinkedList<>();

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    public void agregarNombreAlInicio(String nombre) {
        nombres.addFirst(nombre);
    }

    public void agregarNombreAlFinal(String nombre) {
        nombres.addLast(nombre);
    }

    public void imprimirNombres() {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
