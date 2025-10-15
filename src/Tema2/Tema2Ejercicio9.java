package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dime los dolaringos");
        int dolar = in.nextInt();

        double euro = dolar * 0.86;
        System.out.println("Tienes " + euro + " euros");
    }
}
