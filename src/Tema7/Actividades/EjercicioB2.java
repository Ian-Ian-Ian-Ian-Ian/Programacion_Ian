package Tema7.Actividades;

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class EjercicioB2 {
    public static void main(String[] args) {

        File archivo_notas = new File("/home/ianbortom/Documents/Documentos/alumnos_notas.txt");
        String linea;
        String nombre_al = "";
        String apellido_al = "";

        float nota_media;
        int cant_notas;

        Map <Float, String> alumnos = new TreeMap<>(Collections.reverseOrder());

        try (BufferedReader br = new BufferedReader(new FileReader(archivo_notas))) {

            while ((linea = br.readLine()) != null) {
                String[] notas_alumno = linea.split(" ");
                nombre_al = notas_alumno[0] + " ";
                apellido_al = notas_alumno[1];

                cant_notas = 0;
                nota_media = 0;

                for (int i = 2; i < notas_alumno.length; i++) {
                    nota_media = nota_media + Integer.parseInt(notas_alumno[i]);
                    cant_notas++;
                }
                nota_media = nota_media / cant_notas;

                alumnos.put(nota_media,nombre_al + apellido_al);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("La nota media de los alumnos ordenados de mayor a menor son: \n" + alumnos);
    }
}
