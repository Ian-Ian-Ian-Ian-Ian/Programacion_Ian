package Tema3.Arrays;

import java.util.Scanner;

public class BuscaParejas {

    public static void showPairs(String[] ocultas, String[] visibles, int num1, int num2) {
        for (int i = 0; i <= visibles.length - 1; i++) {
            if (visibles[i].equals("/")) {
                if (num1 == i) {
                    System.out.print(ocultas[i]);
                    System.out.print(" ");
                } else if (num2 == i) {
                    System.out.print(ocultas[i]);
                    System.out.print(" ");
                } else {
                    System.out.print(visibles[i]);
                    System.out.print(" ");
                }
            } else {
                System.out.print(visibles[i]);
                System.out.print(" ");
            }
        }
    }

    public static String[] checkPairs(String[] ocultas, String[] visibles, int num1, int num2) {
        if (ocultas[num1].equals(ocultas[num2])) {
            visibles[num1] = ocultas[num1];
            visibles[num2] = ocultas[num2];
        }
        return visibles;
    }

    public static boolean winCheck(String[] visibles){
        boolean win = true;
        for (int i = 0; i < visibles.length - 1; i++) {
            if (visibles[i].equals("/")) {
                win = false;
            }
        }
        return win;
    }

    public static boolean checkNumber(String[] visible, int num) {
        boolean confirmacion = false;
        num = num - 1;
            if (num < 0 || num > 19) {
                System.out.println("Seleciona una carta del 1 al 20");
                confirmacion = true;
            } else if (!visible[num].equals("/")) {
                   System.out.println("Selecciona una carta dentro del rango que no este mostrada");
                   confirmacion = true;
            }
        return confirmacion;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //Ocultas para el jugador, no que sean las que no se vean en la consola.

        int num1 = 0;
        int num2 = 0;
        boolean ganar = false;
        boolean confirmacion = false;

        String[] ocultas; //1 perro 2 gato 3 araña 4 halcon 5 pajaro 6 toro 7 puerco 8 vaca 9 grillo 10 pez
        ocultas = new String[]{"perro","gato","araña","halcon","gato","pajaro","toro","puerco","halcon","perro","vaca","vaca","pez","grillo","pajaro","pez","puerco","grillo","toro","araña"};

        String[] visibles;
        visibles = new String[]{"/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/"};

        System.out.println("Bienvenido al juego de encontrar parejas.");

        while (!ganar) {
            System.out.println("Selecciona el número de la primera carta.(1-20)");
            num1 = in.nextInt();
            confirmacion = checkNumber(visibles, num1);
            while (confirmacion) {
                num1 = in.nextInt();
                confirmacion = checkNumber(visibles,num1);
            }

            System.out.println("Selecciona el número de la segunda carta.(1-20)");
            num2 = in.nextInt();

            confirmacion = checkNumber(visibles, num2);
            while (confirmacion || num2 == num1) {
                if (num2 == num1) {
                    System.out.println("Selecciona una carta diferente a la primera");
                }
                num2 = in.nextInt();
                confirmacion = checkNumber(visibles, num2);
            }

            //para que comience desde el 0
            num1 = num1 - 1;
            num2 = num2 - 1;

            showPairs(ocultas, visibles, num1, num2);

            visibles = checkPairs(ocultas, visibles, num1, num2);

            ganar = winCheck(visibles);
        }
        System.out.println("¡Has Ganado!");
    }
}
