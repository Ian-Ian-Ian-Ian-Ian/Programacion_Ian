package Tema3.Strings;

import java.util.Scanner;

public class MyString {

    public static String stringInverter(String cadena) {
        int lenght = cadena.length() - 1;
        char num1 = cadena.charAt(0);
        char num2 = cadena.charAt(lenght);
        for (int i = 0; num1 < cadena.length()/2;i++)


        cadena = cadena.toUpperCase();
        return cadena;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String cadena = "murcielago";
        int opcion = 1;

        switch (opcion) {
            case 1:
                String cadena2 = stringInverter(cadena);
                System.out.println(cadena2);
                break;

        }
    }
}
