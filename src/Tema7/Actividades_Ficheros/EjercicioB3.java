package Tema7.Actividades_Ficheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class EjercicioB3 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        //Aqui pones la ruta del directorio al que quieres acceder para realizar las operaciones
        //                                  vvv
        final String RUTA_DIRECTORIO = "/home/ianbortom/Documents/Documentos/";

        String nombre_a;
        String nombre_b;

        List <String> lineas = new ArrayList<>();

        System.out.println("Archivos en el directorio:");
        Files.list(Path.of(RUTA_DIRECTORIO)).forEach(System.out::println);
        System.out.println("--------------------------");

        System.out.println("Introduce el archivo que quieres copiar");
        nombre_a = in.next();

        File fichero_a = new File(RUTA_DIRECTORIO + nombre_a);

        if (fichero_a.exists()) {

            System.out.println("Introduce el archivo al que quieres volcar");
            nombre_b = in.next();

            File fichero_b = new File(RUTA_DIRECTORIO + nombre_b);

            if (!fichero_b.exists()) {
                if (fichero_b.createNewFile()) {
                    System.out.println("El fichero de destino no existe. Se creará uno nuevo");
                }
            }

            try (BufferedReader br = new BufferedReader(new FileReader(fichero_a))) {

                String linea;
                while ((linea = br.readLine()) != null) {
                    lineas.add(linea);
                }

                Collections.sort(lineas);

            } catch (IOException ioe)  {
                ioe.printStackTrace();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_b, true))) {
                for (String linea : lineas) {
                    bw.write(linea);
                    bw.newLine();
                }
            }
        } else  {
            System.out.println("Archivo de origen no encontrado");
        }



    }
}
