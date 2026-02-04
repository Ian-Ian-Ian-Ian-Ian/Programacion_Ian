package Tema5.Gimnasio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionGimnasio {

    public static void showMenu() {
        System.out.println("Selecciona la acción que quieras realizar:");
        System.out.println("------------------------------------------");
        System.out.println("1. Dar de alta usuario");
        System.out.println("2. Dar de baja usuario");
        System.out.println("3. Mostrar datos de un usuario");
        System.out.println("4. Modificar datos de un usuario");
        System.out.println("5. Salir");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion;

        String nombre;
        int edad;
        String DNI;

        boolean gestion = true;

        Map <String, Usuario> Miembros = new HashMap<>();

        while (gestion) {

            showMenu();
            opcion = in.nextInt();
            while (opcion < 1 || opcion > 5) {
                System.out.println("Seleccione una opcion válida");
                opcion = in.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.print("Dime el DNI del usuario que quieras añadir: ");
                    DNI = in.nextLine().trim().toUpperCase();
                    in.nextLine();

                    if (Miembros.containsKey(DNI)) {
                        System.out.println("El DNI ya esta registrado en el gimnasio");
                    } else {
                        System.out.print("Dime el nombre del usuario que quieras añadir: ");
                        nombre = in.nextLine();

                        System.out.print("Dime la edad del usuario que quieras añadir: ");
                        edad = in.nextInt();
                        in.nextLine();

                        Miembros.put(DNI, new Usuario(nombre, edad));
                        System.out.println("\nel usuario \"" + nombre + "\" ha sido registrado");
                    }
                    break;
                case 2:
                    if (Miembros.isEmpty()) {
                        System.out.println("\nTodavía no hay ningún miembro registrado\n");
                    } else {
                        System.out.print("Dime el DNI del usuario que quieres dar de baja: ");
                        DNI = in.nextLine().trim().toUpperCase();
                        in.nextLine();

                        if (Miembros.containsKey(DNI)) {
                            Miembros.remove(DNI);
                            System.out.println("\nSe ha eliminado el usuario\n");
                        } else {
                            System.out.println("\nNo existe ningún usuario con ese DNI\n");
                        }
                    }
                    break;
                case 3:
                    if (Miembros.isEmpty()) {
                        System.out.println("\nTodavía no hay ningún miembro registrado\n");
                    } else {
                        System.out.print("Dime el DNI del usuario del que quieres mostrar los datos: ");
                        DNI = in.nextLine().trim().toUpperCase();
                        in.nextLine();

                        if (Miembros.containsKey(DNI)) {
                            System.out.println(Miembros.get(DNI));
                        } else {
                            System.out.println("No existe ningún usuario con ese DNI");
                        }
                    }
                    break;
                case 4:
                    if (Miembros.isEmpty()) {
                        System.out.println("Todavía no hay ningún miembro registrado");
                    } else  {
                        System.out.print("Dime el DNI del usuario del que quieres modificar los datos: ");
                        DNI = in.nextLine().trim().toUpperCase();
                        in.nextLine();

                        if (Miembros.containsKey(DNI)) {
                            System.out.print("Dime el nombre nuevo: ");
                            nombre = in.nextLine();

                            System.out.print("Dime la edad nueva: ");
                            edad = in.nextInt();
                            in.nextLine();

                            Miembros.put(DNI, new Usuario(nombre, edad));

                            System.out.println("Se han guardado las modificaciones");
                        } else {
                            System.out.println("No existe ningún usuario con ese DNI");
                        }
                    }
                    break;
                case 5:
                    gestion = false;
                    break;
            }
        }
    }
}
