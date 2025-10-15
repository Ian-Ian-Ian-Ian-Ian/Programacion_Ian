package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = in.nextInt();

        System.out.println("Dame otro número");
        int num2 = in.nextInt();

        System.out.println("Dame un último número");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("El número mayor es " + num1);
            }  else {
                System.out.println("El número mayor es " + num3);
            }
        } else {
            if (num2 > num3){
                System.out.println("El número mayor es " + num2);
            }  else {
                System.out.println("El número mayor es " + num3);
            }
        }
    }
}
