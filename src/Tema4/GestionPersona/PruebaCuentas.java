package Tema4.GestionPersona;

import java.util.Scanner;

public class PruebaCuentas {
    public static void showMenu() {
        System.out.println(
                "Selecciona la opción que quieras realizar\n" +
                "-----------------------------------------\n" +
                "1. Crear instancia de tipo \"Persona\"\n" +
                "2. Crear instancia de tipo \"Cuenta\" y unirlo a una persona\n" +
                "3. Mostrar datos de una persona\n" +
                "4. Recibir nómina mensual de una persona\n" +
                "5. Recibir un pago\n" +
                "6. Realizar transferencias entre cuentas\n" +
                "7. Imprimir personas morosas");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        showMenu();
        int opcion = in.nextInt();
        while (opcion < 1 || opcion > 7) {
            System.out.println("Selecciona una acción a realizar válida");
            opcion = in.nextInt();
        }

        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
        }
    }
}
