package Tema5;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ListaCompra {

    public static void showMenu() {
        System.out.println("\nSelecciona la opción que quieres realizar a continuación\n" +
                "--------------------------------------------------------\n" +
                "1. Añadir producto a la lista de la compra\n" +
                "2. Mirar la lista de la compra\n" +
                "3. Añadir producto de la lista al carrito\n" +
                "4. Mirar productos que faltan por añadir al carrito\n" +
                "5. Salir");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String producto;
        boolean apuntar = true;
        int opcion = 1;
        int producto_num;
        LinkedHashSet<String> lista_compra = new LinkedHashSet<>();
        LinkedHashSet<String> carrito_compra = new LinkedHashSet<>();

        System.out.println("Bienvenid@!");

        while (apuntar) {

            showMenu();
            opcion = in.nextInt();
            while (opcion < 1 || opcion > 5) {
                System.out.println("Selecciona una opción válida");
                opcion = in.nextInt();
            }
                in.nextLine();
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
                        if (lista_compra.isEmpty()) {
                            System.out.println("No hay ningún producto en la lista todavía");
                        } else {
                            producto_num = 1;
                            System.out.println("Lista de la compra\n---------------");
                            for (String lista : lista_compra) {
                                System.out.println(producto_num + ": " + lista);
                                producto_num++;
                            }
                        }
                        break;
                    case 3:
                        if (lista_compra.isEmpty()) {
                            System.out.println("No hay ningún producto en la lista todavía");
                        } else {
                            System.out.print("Dime le producto que quieras añadir al carrito: ");
                            producto = in.nextLine();

                            if (lista_compra.contains(producto) && !(carrito_compra.contains(producto))) {
                                carrito_compra.add(producto);
                                System.out.println("Se ha añadido el producto al carrito de la compra\n" +
                                        "Productos en la lista:   " + lista_compra.size() +
                                        "\nProductos en el carrito: " + carrito_compra.size());
                            } else if (carrito_compra.contains(producto)) {
                                System.out.println("El producto ya esta en el carrito");
                            } else {
                                System.out.println("El producto no se encuentra en la lista de la compra");
                            }
                        }
                        break;
                    case 4:
                        if (lista_compra.isEmpty()) {
                            System.out.println("No hay ningún producto en la lista todavía");
                        } else {
                            if (lista_compra.equals(carrito_compra)) {
                                System.out.println("No te quedan productos por añadir");
                            } else {
                                System.out.println("Te queda por añadir al carrito:");
                                for (String lista : lista_compra) {
                                    if (!(carrito_compra.contains(lista))) {
                                        System.out.println(lista);
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        apuntar = false;
                        break;
                }

            }
        }
    }

