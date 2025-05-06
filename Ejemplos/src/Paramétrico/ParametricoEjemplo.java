package Paramétrico;

import java.util.ArrayList;

public class ParametricoEjemplo {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Lucas");
        nombres.add("Ana");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
