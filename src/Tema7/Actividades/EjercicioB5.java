package Tema7.Actividades;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioB5 {
    public static void main(String[] args) {

        Path diccionario_dir = Path.of("/home/ianbortom/Documents/Documentos/Diccionario");
        File diccionario_txt = new File("/home/ianbortom/Documents/Documentos/diccionario.txt");

        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        try {
            Files.createDirectories(diccionario_dir);
        } catch (IOException ioe) {
            System.err.println("No se ha creado el diccionario. Error: " + ioe.getMessage());
        }

        for (int i = 0; i < letras.length; i++) {
            File archivo_letra = new File(diccionario_dir + "/" + letras[i] + ".txt");
            try {
                if (archivo_letra.createNewFile()) {
                    System.out.println("Se ha creado el archivo " + letras[i] + ".txt");
                } else {
                    System.err.println("No se ha podido crear el archivo " + letras[i] + ".txt");
                }
            } catch (IOException ioe) {
                System.err.println("No se ha creado el archivo. Error: " + ioe.getMessage());
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(diccionario_txt))) {
            String line;
            while ((line = br.readLine()) != null) {

                for  (int i = 0; i < letras.length; i++) {

                    if (line.toUpperCase().startsWith(letras[i])) {

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(diccionario_dir + "/" + letras[i] + ".txt", true))) {
                            bw.write(line);
                            bw.newLine();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
