package Tema7.Actividades_Serializacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Crear_Escribir {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        File usuario = new File("src/Tema7/Actividades_Serializacion/usuario.txt");

        String nombre = "";
        int edad = 0;

        try {
            System.out.print("Introduce tu nombre: ");
            nombre = in.nextLine();
            System.out.print("Introduce tu edad: ");
            edad = in.nextInt();

            if (usuario.createNewFile()) {
                System.out.println("Se ha creado el archivo usuario.txt");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InputMismatchException ime) {
            System.err.println("Se ha introducido un dato inválido, se detendra el programa");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(usuario))) {
            bw.write("Nombre: " + nombre + "\nEdad: " + edad);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
