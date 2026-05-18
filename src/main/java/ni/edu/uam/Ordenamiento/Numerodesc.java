package ni.edu.uam.Ordenamiento;

import java.util.ArrayList;
import java.util.Collections;

public class Numerodesc {

    public class NumerosDescendente {
        private ArrayList<Integer> numeros = new ArrayList<>();

        public NumerosDescendente() {
            numeros.add(15);
            numeros.add(3);
            numeros.add(27);
            numeros.add(9);
            numeros.add(21);
        }

        public void ejecutar() {
            System.out.println("Ejercicio 3: Números de mayor a menor");
            System.out.println("Lista original: " + numeros);
            Collections.sort(numeros, Collections.reverseOrder());
            System.out.println("Lista ordenada: " + numeros);
        }
    }
}



