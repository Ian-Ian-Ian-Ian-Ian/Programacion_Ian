package Tema7.Actividades_Serializacion;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Leer_Mostrar {
    public static void main(String[] args) {

        File usuario =  new File("src/Tema7/Actividades_Serializacion/usuario.txt");
        Path user = Paths.get("src/Tema7/Actividades_Serializacion/usuario.txt");
        String[] num_palabras = new String[]{};


        try (BufferedReader br = new BufferedReader(new FileReader(usuario))) {

            String palabras = Files.readString(user);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            num_palabras = palabras.trim().split("\\s+");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("El numero de palabras es: " + num_palabras.length);
    }
}
