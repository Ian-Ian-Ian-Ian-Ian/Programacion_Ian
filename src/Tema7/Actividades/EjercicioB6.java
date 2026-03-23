package Tema7.Actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioB6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        File pi = new File("/home/ianbortom/Documents/Documentos/pi-million.txt");
        boolean confirmacion = false;
        String numero_pi = "";
        int buscar_num = 0;

        try {
            System.out.print("Introduce la secuencia de números que quieres que busque en el primer millón de pi: ");
            buscar_num = in.nextInt();

            while (buscar_num < 0) {
                System.out.print("Inserte un número positivo, por favor: ");
                buscar_num = in.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.println("Se ha introducido un valor incorrecto");
        }

        String numero = buscar_num + "";

        try (BufferedReader br = new BufferedReader(new FileReader(pi))) {
            String line;
            while ((line = br.readLine()) != null) {
                numero_pi += line;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (int i = 0; i < numero_pi.length() - numero.length(); i++) {
            confirmacion = true;
            for (int j = 0; j < numero.length(); j++) {
                if (numero_pi.charAt(i + j) != numero.charAt(j)) {
                    confirmacion = false;
                    j = numero.length();
                }
            }
            if (confirmacion) {
                i =  numero_pi.length();
            }
        }

        if (confirmacion) {
            System.out.println("El numero se encuentra en pi");
        } else {
            System.out.println("No se ha encontrado el número");
        }
    }
}
