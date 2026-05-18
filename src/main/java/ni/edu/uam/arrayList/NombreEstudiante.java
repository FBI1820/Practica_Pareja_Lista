package ni.edu.uam.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NombreEstudiante {


        private ArrayList<String> nombres = new ArrayList<>();

        // Constructor con lista predefinida
        public NombreEstudiante() {
            nombres.add("Carlos");
            nombres.add("Ana");
            nombres.add("Beatriz");
            nombres.add("Daniel");
        }

        // Método para ordenar
        public void ordenar() {
            Collections.sort(nombres);
        }

        // Método para mostrar
        public void mostrar() {
            System.out.println(nombres);
        }
    }