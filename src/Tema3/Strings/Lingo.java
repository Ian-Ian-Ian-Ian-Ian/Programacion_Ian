package Tema3.Strings;

import java.util.Scanner;

public class Lingo {

    public static String wordCheck(String respuesta, char[] palabra, char[] vis) {
        char[] resp = respuesta.toCharArray();
        String visible = "";

        for (int ii = 0; ii < resp.length; ii++) {
                if (resp[ii] == palabra[ii]) {
                    vis[ii] = resp[ii];
                } else if (resp[ii] == palabra[0] || resp[ii] == palabra[1] || resp[ii] == palabra[2] || resp[ii] == palabra[3] || resp[ii] == palabra[4]) {
                    vis[ii] = '*';
                } else if (resp[ii] != palabra[ii]) {
                    vis[ii] = '-';
                }
        }

        for (int i = 0; i < vis.length; i++)
            visible = visible + vis[i];
        return visible;
    }

    public static boolean winCheck(char[] palabra, char[] visible) {
        for (int i = 0; i < palabra.length; i++) {
            if (visible[i] != palabra[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        String visible = "-----";
        char[] vis = visible.toCharArray();
        String palabra = "paris";
        char[] pal = palabra.toCharArray();
        String respuesta = "";
        int intentos = 5;
        boolean ganar = false;

        System.out.println("Bienvenido a Lingo");
        System.out.println("Por favor, introduzca una palabra de 5 letras");
        for (int i = 0; i < intentos; i++) {
            System.out.print("Try:  ");
            respuesta = in.next();
            while (respuesta.length() != 5) {
                System.out.println("He dicho que sea de 5 letras");
                System.out.print("Try:  ");
                respuesta = in.next();
            }
            visible = wordCheck(respuesta, pal, vis);

            System.out.println("Hint: " + visible);

            ganar = winCheck(pal, vis);

            if (ganar) {
                i = 5;
            }
        }
        if (ganar) {
            System.out.println("¡Has Ganado!");
        } else {
            System.out.println("Has Perdido... La palabra era: " + palabra);
        }
    }
}
