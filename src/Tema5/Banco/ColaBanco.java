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

        List <Usuario> cola = new LinkedList<>();


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

                    cola.add(new Usuario(dni, nombre, edad));
                    System.out.println("Se ha añadido un usuario a la cola. Cola: " + cola.size());
                    break;
                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("Todavía no ha llegado ningún usuario");
                    } else {
                        cola.remove(0);
                        System.out.println("La persona ha sido atendida. Cola: " + cola.size());
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("Todavía no ha llegado ningún usuario");
                    } else if (cola.size() == 1) {
                        System.out.println("La única persona en la cola está siendo atendida");
                    } else {
                        System.out.println("Hay un total de " + cola.size() + " personas en la cola");
                        System.out.print("Seleciona la persona que ha abandonado la fila: ");
                        opcion = in.nextInt() - 1;
                        while (opcion < 1 || opcion > cola.size()) {
                            if (opcion == 0) {
                                System.out.print("\nEsa persona esta siendo atendida, selecciona otra: ");
                                opcion = in.nextInt() - 1;
                            } else {
                                System.out.print("\nSelecciona un número dentro del rango de la fila: ");
                                opcion = in.nextInt() - 1;
                            }
                        }
                        cola.remove(opcion);
                        System.out.println("La persona se ha cansado de esperar. Cola: " + cola.size());
                    }
                    break;
                case 4:
                    esperando = false;
                    break;
            }
        }
    }
}
