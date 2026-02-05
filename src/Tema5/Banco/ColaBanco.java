package Tema5.Banco;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ColaBanco {

    public static void showMenu() {
        System.out.println("\nSelecciona la opción que quieres realizar");
        System.out.println("-----------------------------------------");
        System.out.println("1. Añadir usuario al banco");
        System.out.println("2. Atender a usuario de la cola");
        System.out.println("3. Sacar a usuario de la cola");
        System.out.println("4. Salir\n");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String dni;
        String nombre;
        int edad;
        int opcion;

        boolean esperando = true;

        List <Usuario> Cola = new LinkedList<>();


        while (esperando) {

            showMenu();
            opcion = in.nextInt();
            while (opcion < 1 || opcion > 4) {
                System.out.println("Seleccione una opción válida");
                opcion = in.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.print("Dime el DNI del usuario que quieres añadir: ");
                    dni = in.nextLine();
                    in.nextLine();

                    System.out.print("Dime el nombre del usuario que quieras añadir: ");
                    nombre = in.nextLine();

                    System.out.print("Dime la edad del usuario que quieras añadir: ");
                    edad = in.nextInt();
                    in.nextLine();

                    Cola.add(new Usuario(dni, nombre, edad));
                    break;
                case 2:
                    if (Cola.isEmpty()) {
                        System.out.println("Todavía no ha llegado ningún usuario");
                    } else {
                        Cola.remove(0);
                        System.out.println("La persona ha sido atendida");
                    }
                    break;
                case 3:
                    if (Cola.isEmpty()) {
                        System.out.println("Todavía no ha llegado ningún usuario");
                    } else if (Cola.size() == 1) {
                        System.out.println("La única persona en la cola está siendo atendida");
                    } else {
                        System.out.println("Hay un total de " + Cola.size() + " personas en la cola");
                        System.out.print("Seleciona la persona que ha abandonado la fila: ");
                        opcion = in.nextInt() - 1;
                        while (opcion < 1 || opcion > Cola.size()) {
                            if (opcion == 0) {
                                System.out.print("\nEsa persona esta siendo atendida, selecciona otra: ");
                                opcion = in.nextInt() - 1;
                            } else {
                                System.out.print("\nSelecciona un número dentro del rango de la fila: ");
                                opcion = in.nextInt() - 1;
                            }
                        }
                        Cola.remove(opcion);
                    }
                    break;
                case 4:
                    esperando = false;
                    break;
            }
        }
    }
}
