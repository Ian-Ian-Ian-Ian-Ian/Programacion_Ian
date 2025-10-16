package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nota = 0;
        int susp = 0;
        int apro = 0;

        System.out.println("Ves insertando las notas y cuando quieras parar inserta un negativo");
        while (nota >= 0) {
            nota = in.nextInt();
            if (nota >= 5 && nota <= 10) {
                apro++;
            } else if (nota >= 0 && nota < 5) {
                susp++;
            } else if (nota > 10) {
                System.out.println("Eso no es una nota");
            }
        }
        System.out.println("Han aprobado un total de " + apro + " y han suspendido " + susp);
    }
}
