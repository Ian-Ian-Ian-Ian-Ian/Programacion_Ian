package Tema3.Strings;

import java.util.Scanner;

public class HangmanGame {

    public static String letterCheck(String visible, String palabra, char letra) {

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

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String visible = "";
        String visible2 = "";
        int errores = 0;
        char letra = 0;
        boolean ganar = false;

        System.out.println("Bienvenido al juego del Ahorcado, por favor, escriba la palabra secreta");
        String palabra = in.next();

        for (int i = 0; i < palabra.length(); i++) {
            visible = visible + "_";
        }

        System.out.println("Ahora toca que el otro jugador acierte la palabra, por favor, introduzca la letra");
        System.out.println("(Si escribe más de una letra solo se seleccionará la primera letra)");

        while (errores < 6) {
            letra = in.next().charAt(0);
            while (letra >= 0) {
                System.out.println("Por favor, introduzca una letra, no un número");
                letra = in.next().charAt(0);
            }

            visible2 = visible;
            visible = letterCheck(visible, palabra, letra);

            if (visible2 == visible) {
                errores++;
            }

            hangedman(errores);
        }
    }
}
