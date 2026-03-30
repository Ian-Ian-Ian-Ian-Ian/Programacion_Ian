package Tema7.Actividades_Serializacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Leer_Contar {
    public static void main(String[] args) {

        File usuario =  new File("src/Tema7/Actividades_Serializacion/usuario.txt");


        try (BufferedReader br = new BufferedReader(new FileReader(usuario))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}


