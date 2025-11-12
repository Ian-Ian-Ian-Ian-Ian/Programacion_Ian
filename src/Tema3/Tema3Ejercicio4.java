package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void showMenu(){
        Scanner in = new Scanner(System.in);

        System.out.println("Selecciona la función que quieras");
        System.out.println("---------------------------------");
        System.out.println("1. Dolares a euros");
        System.out.println("2. Euros a dolares");
    }

    public static double dollar2euro(double euros) {
        euros = euros * 1.16;
        return euros;
    }

    public static double euro2dollar(double dolares) {
        dolares = dolares * 0.86;
        return dolares;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        showMenu();
        int accion = in.nextInt();

        if (accion < 1 && accion > 2) {
            while (accion < 1 && accion > 2) {
                System.out.println("Por favor, selecciona una opción correcta");
                accion = in.nextInt();
            }
        }

        System.out.println("Dime la cantidad que quieres cambiar");
        double dinero = in.nextDouble();

        switch (accion){
            case 1:
                if (accion == 1) {
                    double euros = dollar2euro(dinero);
                    System.out.println(dinero + "$ en euros son " + euros + "€");
                }

            case 2:
                if (accion == 2) {
                    double dolares = euro2dollar(dinero);
                    System.out.println(dinero + "€ en dolares son " + dolares + "$");
                }
        }
    }
}
