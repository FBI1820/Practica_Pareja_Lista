package ni.edu.uam.Ordenamiento;
import java.util.ArrayList;
import java.util.Collections;

public class ListanombresAlfabeto {


    public class ListaNombres {
        private ArrayList<String> nombres = new ArrayList<>();

        public ListaNombres() {
            nombres.add("Carlos");
            nombres.add("Ana");
            nombres.add("Beatriz");
            nombres.add("Daniel");
            nombres.add("Elena");
        }

        public void ejecutar() {
            System.out.println("Ejercicio 2: Nombres alfabéticamente");
            System.out.println("Lista original: " + nombres);
            Collections.sort(nombres);
            System.out.println("Lista ordenada: " + nombres);
        }
    }
}