package Tema5.Excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List <Gato> lista_gatos = new ArrayList<>();
        Gato gato = new Gato();
        String nombre;
        int edad;

        while (lista_gatos.size() < 5) {
            System.out.print("Dime el nombre del nuevo gato: ");
            nombre = in.nextLine();
            System.out.print("Ahora dime la edad del gato: ");
            try {
                edad = in.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Se ha introducido un valor no válido");
                edad = -1;
                in.next();
            }
            gato.nameVerifier(nombre);
            gato.ageVerifier(edad);
            if (gato.ageVerifier(edad) && gato.nameVerifier(nombre)) {
                lista_gatos.add(new Gato(nombre, edad));
                System.out.println("Se ha añadido el gato correctamente");
            } else {
                System.err.println("Un dato introducido no es correcto");
                System.out.println("No se ha añadido el gato");
            }
            System.out.println("Lista de gatos\n===================");
            for (Gato num_gato : lista_gatos) {
                gato = num_gato;
                gato.imprimir();
                System.out.println("--------------------");
            }
            in.nextLine();
        }
    }
}
