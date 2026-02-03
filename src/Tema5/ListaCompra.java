package Tema5;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ListaCompra {

    public static void showMenu() {
        System.out.println("\nSelecciona la opción que quieres realizar a continuación\n" +
                           "--------------------------------------------------------\n" +
                           "1. Añadir producto a la lista de la compra\n" +
                           "2. Mirar la lista de la compra\n" +
                           "3. Salir");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String producto;
        boolean apuntar = true;
        int opcion = 1;
        int producto_num = 0;
        LinkedHashSet <String> lista_compra = new LinkedHashSet<>();

        System.out.println("Bienvenid@!");

        while (apuntar) {
            switch (opcion) {
                case 1:
                    System.out.print("Por favor, introduce el producto que quieras en la lista de la compra: ");
                    producto = in.nextLine();

                    if (lista_compra.contains(producto)) {
                    System.out.println("El producto ya se encuentra en la lista");
                    }
                    lista_compra.add(producto);
                    break;
                case 2:
                    producto_num = 1;
                    for (String lista : lista_compra) {
                        System.out.println(producto_num + ": " + lista);
                        producto_num++;
                    }
                    break;
                case 3:
                    apuntar = false;
                    break;
            }

            if (apuntar) {
                showMenu();
                opcion = in.nextInt();
                while (opcion < 1 || opcion > 3) {
                    System.out.println("Selecciona una opción válida");
                    opcion = in.nextInt();
                }
                in.nextLine();
            }
        }
    }
}
