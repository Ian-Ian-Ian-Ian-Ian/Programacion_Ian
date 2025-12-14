package Tema3.Strings;

import java.util.Scanner;

public class HangmanGame {

    public static String letterCheck(String visible, String palabra, char letra) {
        char vis[] = visible.toCharArray();
        char pal[] = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++) {
            if (letra == pal[i]) {
                vis[i] = letra;
            }
        }
        visible = "";
        for (int j = 0; j < palabra.length(); j++) {
            visible = visible + vis[j];
        }
        return visible;
    }

    public static void hangedman(int errores) {
        switch (errores) {
            case 1:
                System.out.println("  0  ");
                break;
            case 2:
                System.out.println("  0  ");
                System.out.println("/    ");
                break;
            case 3:
                System.out.println("  0  ");
                System.out.println("/ |  ");
                break;

            case 4:
                System.out.println("  0  ");
                System.out.println("/ | \\");
                break;

            case 5:
                System.out.println("  0  ");
                System.out.println("/ | \\");
                System.out.println(" /   ");
                break;
            case 6:
                System.out.println("  0  ");
                System.out.println("/ | \\");
                System.out.println(" / \\ ");
                break;
        }
    }

    public static boolean winCheck(String visible, String palabra) {
        if (visible.equalsIgnoreCase(palabra)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String visible = "";
        String visible2 = "";
        int errores = 0;
        char letra = 0;
        boolean ganar = false;

        System.out.println("Bienvenido al juego del Ahorcado, por favor, escriba la palabra secreta (No más de 10 carácteres de largo)");
        String palabra = in.next();
        while (palabra.length() > 10) {
            System.out.println("No más de 10 carácteres de largo");
            palabra = in.next();
        }
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            visible = visible + "_";
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Ahora toca que el otro jugador acierte la palabra, por favor, introduzca la letra");
        System.out.println("(Si escribe más de una letra solo se seleccionará la primera letra)");

        while (errores < 6) {
            letra = in.next().toLowerCase().charAt(0);

            visible2 = visible;
            visible = letterCheck(visible, palabra, letra);

            if (visible2.equals(visible)) {
                System.out.println("Letra incorrecta");
                errores++;
            }

            hangedman(errores);
            System.out.println("\n" + visible);
            ganar = winCheck(palabra, visible);

            if (ganar) {
                errores = 6;
            }
        }
        if (ganar) {
            System.out.println("¡Has Acertado!");
        } else if (!ganar) {
            System.out.println("Has perdido... La palabra era: " + palabra);
        }
    }
}
