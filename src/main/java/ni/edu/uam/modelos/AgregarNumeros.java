package ni.edu.uam.modelos;

import java.util.ArrayList;
import java.util.List;

public class AgregarNumeros {
    List<Integer> numeros = new ArrayList<>();

    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    public void imprimirNumeros() {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
