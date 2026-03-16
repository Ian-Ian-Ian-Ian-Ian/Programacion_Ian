package Tema7.Actividades;

import java.io.*;
import java.util.*;

public class EjercicioB4 {
    public static void main(String[] args) {

        Random random = new  Random();
        Scanner in = new Scanner(System.in);

        List <String> lista_nom = new ArrayList<>();
        List <String> lista_ape = new ArrayList<>();

        int repeticiones = 0;
        String nombre_apellido = "";

        try {
            System.out.println("Dime la cantidad de nombre que quieres añadir");
            repeticiones = in.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("Valores introducidos incorrectos");
        }

        File nombres = new File("/home/ianbortom/Documents/Documentos/usa_nombres.txt");
        File apellidos = new File("/home/ianbortom/Documents/Documentos/usa_apellidos.txt");
        File personas = new File("/home/ianbortom/Documents/Documentos/usa_personas.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(nombres))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                lista_nom.add(linea);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(apellidos))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                lista_ape.add(linea);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(personas, true))) {

            for (int i = 0; i < repeticiones; i++) {
                int nombre_random = random.nextInt(lista_nom.size());
                int apellido_random = random.nextInt(lista_ape.size());
                nombre_apellido = lista_nom.get(nombre_random) + " " +  lista_ape.get(apellido_random);
                bw.write(nombre_apellido);
                bw.newLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
