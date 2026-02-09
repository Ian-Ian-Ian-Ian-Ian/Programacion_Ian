package Tema5.Excepciones;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Dime un número entero: ");
        try {
            int num = in.nextInt();
            System.out.println("Valor final introducido: " + num);
        } catch (InputMismatchException ex) {
            System.out.println("Valor introducido erróneo");
        }
    }
}
