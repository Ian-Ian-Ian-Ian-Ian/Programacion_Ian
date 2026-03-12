package Tema7.Actividades;

import java.io.*;

public class EjercicioB1 {
    public static void main(String[] args) {

        File numeros = new File("/home/ianbortom/Documents/Documentos/numeros.txt");
        int num_max = 0;
        int num_min = 0;
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(numeros))) {
            linea = br.readLine();
            num_min = Integer.parseInt(linea.trim());
            num_max = Integer.parseInt(linea.trim());

            while ((linea = br.readLine()) != null) {
                if (num_min > Integer.parseInt(linea.trim())) {
                    num_min = Integer.parseInt(linea.trim());
                }
                if (num_max < Integer.parseInt(linea.trim())) {
                    num_max = Integer.parseInt(linea.trim());
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Max: " + num_max + "\nMin: " + num_min);
    }
}
