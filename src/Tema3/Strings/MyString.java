package Tema3.Strings;

import java.util.Scanner;

public class MyString {

    public static void showMenu() {

    }

    public static String stringInverter(String cadena) {
        int lenght = cadena.length() - 1;
        String cadena2 = "";
        for (int i = 0; i < cadena.length() ;i++) {
            cadena2 = cadena2 + cadena.charAt(lenght);
            lenght--;
        }
        cadena2 = cadena2.toUpperCase();
        return cadena2;
    }

    public static int totalVocal(String cadena) {
        int total = 0;
        char[] car;
        car = cadena.toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            if (car[i] == 'a' || car[i] == 'e' || car[i] == 'i' || car[i] == 'o' || car[i] == 'u') {
                total++;
            }
        }
        return total;
    }

    public static String biggestWord(String cadena) {

        return cadena;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String cadena = "murcielago hola que tal";
        int opcion = 2;

        switch (opcion) {
            case 1:
                String cadena2 = stringInverter(cadena);
                System.out.println(cadena2);
                break;
            case 2:
                int totalvocales = totalVocal(cadena);
                System.out.println("El total de vocales es: " + totalvocales);
                break;
            case 3:
                String palabralarga = biggestWord(cadena);
                System.out.println("La palabra más larga es: " + palabralarga);
                break;
        }
    }
}
