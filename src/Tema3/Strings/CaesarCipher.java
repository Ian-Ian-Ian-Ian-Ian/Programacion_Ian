package Tema3.Strings;

import java.util.Scanner;

public class CaesarCipher {

    public static void showMenu() {
        System.out.println("Elige la opción que quieras realizar");
        System.out.println("------------------------------------");
        System.out.println("1. Encriptar");
        System.out.println("2. Descifrar");
    }

    public static String encrypt(String palabra) {
        palabra = palabra.replace('Z','a');
        palabra = palabra.replace('Y','Z');
        palabra = palabra.replace('X','Y');
        palabra = palabra.replace('W','X');
        palabra = palabra.replace('V','W');
        palabra = palabra.replace('U','V');
        palabra = palabra.replace('T','U');
        palabra = palabra.replace('S','T');
        palabra = palabra.replace('R','S');
        palabra = palabra.replace('Q','R');
        palabra = palabra.replace('P','Q');
        palabra = palabra.replace('O','P');
        //La ñ no aparece
        palabra = palabra.replace('N','O');
        palabra = palabra.replace('M','N');
        palabra = palabra.replace('L','M');
        palabra = palabra.replace('K','L');
        palabra = palabra.replace('J','Q');
        palabra = palabra.replace('I','J');
        palabra = palabra.replace('H','I');
        palabra = palabra.replace('G','H');
        palabra = palabra.replace('F','G');
        palabra = palabra.replace('E','F');
        palabra = palabra.replace('D','E');
        palabra = palabra.replace('C','D');
        palabra = palabra.replace('B','C');
        palabra = palabra.replace('A','B');
        palabra = palabra.replace('a','A');
        palabra = palabra.replace('9','b');
        palabra = palabra.replace('8','9');
        palabra = palabra.replace('7','8');
        palabra = palabra.replace('6','7');
        palabra = palabra.replace('5','6');
        palabra = palabra.replace('4','5');
        palabra = palabra.replace('3','4');
        palabra = palabra.replace('2','3');
        palabra = palabra.replace('1','2');
        palabra = palabra.replace('0','1');
        palabra = palabra.replace('b','0');
        return palabra;
    }

    public static String decrypt(String palabra) {
        palabra = palabra.replace('A','a');
        palabra = palabra.replace('B','A');
        palabra = palabra.replace('C','B');
        palabra = palabra.replace('D','C');
        palabra = palabra.replace('E','D');
        palabra = palabra.replace('F','E');
        palabra = palabra.replace('G','F');
        palabra = palabra.replace('H','G');
        palabra = palabra.replace('I','H');
        palabra = palabra.replace('J','I');
        palabra = palabra.replace('K','J');
        palabra = palabra.replace('L','Q');
        palabra = palabra.replace('M','L');
        palabra = palabra.replace('N','M');
        palabra = palabra.replace('O','N');
        palabra = palabra.replace('P','O');
        palabra = palabra.replace('Q','P');
        palabra = palabra.replace('R','Q');
        palabra = palabra.replace('S','R');
        palabra = palabra.replace('T','S');
        palabra = palabra.replace('U','T');
        palabra = palabra.replace('V','U');
        palabra = palabra.replace('W','V');
        palabra = palabra.replace('X','W');
        palabra = palabra.replace('Y','X');
        palabra = palabra.replace('Z','Y');
        palabra = palabra.replace('a','Z');
        palabra = palabra.replace('0','b');
        palabra = palabra.replace('1','0');
        palabra = palabra.replace('2','1');
        palabra = palabra.replace('3','2');
        palabra = palabra.replace('4','3');
        palabra = palabra.replace('5','4');
        palabra = palabra.replace('6','5');
        palabra = palabra.replace('7','6');
        palabra = palabra.replace('8','7');
        palabra = palabra.replace('9','8');
        palabra = palabra.replace('b','9');
        return palabra;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        showMenu();
        int opcion = in.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.println("Seleccione una opción válida");
            opcion = in.nextInt();
        }
        in.nextLine();
        System.out.println("Escriba la palabra/frase a continuación:");
        String palabra = in.nextLine().toUpperCase();

        switch (opcion) {
            case 1:
                String encriptada = encrypt(palabra);
                System.out.println("La palabra: " + palabra + " encriptada es: " + encriptada);
                break;
            case 2:
                String descifrada = decrypt(palabra);
                System.out.println("La palabra: " + palabra + " en realidad es: " + descifrada);
                break;
        }
    }
}
