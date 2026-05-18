package ni.edu.uam.Ordenamiento;
import java.util.ArrayList;
import java.util.Collections;

public class numerosmenormayor {



    public class NumerosAscendente {
        private ArrayList<Integer> numeros = new ArrayList<>();

        public NumerosAscendente() {
            numeros.add(25);
            numeros.add(10);
            numeros.add(40);
            numeros.add(5);
            numeros.add(30);
        }

        public void ejecutar() {
            System.out.println("Ejercicio 1: Números de menor a mayor");
            System.out.println("Lista original: " + numeros);
            Collections.sort(numeros);
            System.out.println("Lista ordenada: " + numeros);
        }
    }

}
