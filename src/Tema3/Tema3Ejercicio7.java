package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {

    public static void primeNumber(int numero){
        int divisores = 0;
        int dividendo = numero;
        int resultado = 0;

        while (dividendo > 0){
            resultado = numero%dividendo;
            if (resultado == 0){
                divisores++;
            }
            dividendo--;
        }

        if (divisores == 1 || divisores == 2){
            System.out.println("El número ES primo");
        } else {
            System.out.println("El número NO es primo");
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dime números positivos y cuando quieras acabar pon 0");
        int numero = in.nextInt();
            while (numero > 0){
                primeNumber(numero);
                numero = in.nextInt();
                if (numero < 0){
                    while (numero < 0){
                        System.out.println("Numero positivo he dicho");
                        numero = in.nextInt();
                    }
                }
            }
    }
}
