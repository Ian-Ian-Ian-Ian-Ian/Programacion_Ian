package Tema3;


import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static void numberTable(int numero){
        int total = 0;

        System.out.println("------------");
        for (int tabla = 0; tabla < 11; tabla++){
            total = numero * tabla;
            System.out.println(numero + " * " + tabla + " = " + total);
        }
        System.out.println("------------");

    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número del 1 al 10 para mostrar su tabla");
        int numero = in.nextInt();

        if (numero < 1 && numero > 10){
            while (numero < 1 && numero > 10){
                System.out.println("Dime un número del 1 al 10 he dicho");
                numero = in.nextInt();
            }
        }
        numberTable(numero);
    }
}
