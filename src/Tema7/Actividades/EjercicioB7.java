package Tema7.Actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EjercicioB7 {

    public static void main(String[] args){

        String ruta_archivo = "E:\\Archivos\\Documentos_Ejercicio_Java\\Libros\\fuenteovejuna_lopevega.txt";
        Path path_archivo = Paths.get(ruta_archivo);
        File archivo = new File(ruta_archivo);

        String leer_archivo;
        String[] contar_palabras = new String[]{};
        Map<String, Integer> top_palabras = new HashMap<>();

        int total_lineas = 0;
        int total_palabras = 0;
        int total_caracteres = 0;

        if (archivo.exists()) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("No se encuentra el archivo");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){

            //Para leer las líneas que contengan texto
            String linea;
            while ((linea = br.readLine()) != null) {
                total_lineas++;
            }

            leer_archivo = Files.readString(path_archivo);

            //Incluye espacios
            total_caracteres = leer_archivo.length();

            //Contar el total de palabras y por separado
            if (!leer_archivo.isBlank()) {
                contar_palabras = leer_archivo.toLowerCase().trim().split("\\s+");
                total_palabras = contar_palabras.length;
                for (String pal : contar_palabras) {
                    if (top_palabras.containsKey(pal)) {

                        int cuentaActual = top_palabras.get(pal);
                        top_palabras.put(pal, cuentaActual + 1);

                    } else {

                        top_palabras.put(pal, 1);

                    }
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println ("  Estadísticas  " + "\n----------------" + "\nNº lineas:  " + total_lineas + "\nPalabras:   " + total_palabras + "\nCarácteres: " + total_caracteres);
        System.out.println("Top palabras que más aparecen: ");
        top_palabras.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(10).forEach(entrada -> {
                    System.out.println(entrada.getKey() + " -> " + entrada.getValue() + " veces"); });
    }
}
