package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static String[] numberPlacement(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("*")) {
                if (i == 0){
                     if (array[i + 1].equals("*")) {
                         array[i] = "1";
                     }
                } else if (i == 19){
                    if (array[i - 1].equals("*")) {
                        array[i] = "1";
                    }
                } else {
                    if (array[i + 1].equals("*") && array[i - 1].equals("*")) {
                        array[i] = "2";
                    } else if (array[i + 1].equals("*") || array[i - 1].equals("*")) {
                        array[i] = "1";
                    }
                }
            }
        }
        return array;
    }

    public static boolean numberCheck(String[] visible, int num1){
        boolean check = true;
        if (num1 < 1 || num1 > 20){
            System.out.println("Por favor, seleccione un número entre el rango seleccionado");
            check = false;
        } else if (!visible[num1 - 1].equals("/")) {
            System.out.println("Por favor, seleccione una casilla que no haya sido revelada");
            check = false;
        }
        return check;
    }

    public static String[] checkMine(String[] visible, String[] array, int num1){
        visible[num1] = array[num1];
        return visible;
    }

    public static boolean checkWin(String[] visible){
        boolean acabar = false;
        int casillas = 0;
        for (int i = 0; i < visible.length; i++) {
            System.out.print(visible[i]);
            System.out.print(" ");
        }
        for (int i = 0; i < visible.length; i++) {
            if (visible[i].equals("*")) {
                System.out.println();
                System.out.println("Has perdido...");
                acabar = true;
            }
            if (visible[i].equals("/")) {
                casillas++;
            }
        }
        if (casillas <= 6 && !acabar) {
            System.out.println();
            System.out.println("¡Has ganado!");
            acabar = true;
        }
        return acabar;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //array es la que no se ve por el jugador
        String[] array;
        array = new String[]{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};

        String[] visible;
        visible = new String[]{"/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/","/"};

        int num1 = 0;
        boolean acabar = false;
        boolean check = false;

        for (int i = 0; i < 6; i++) {
            num1 = random.nextInt(19);
            while (!array[num1].equals("0")) {
                num1 = random.nextInt(19);
            }
            array[num1] = "*";
        }

        array = numberPlacement(array);

        System.out.println("Bienvenido al juego de Buscaminas");
        while (!acabar) {
            System.out.println();
            System.out.println("Selecciona el numero del hueco que quieres revelar (1-20)");
            num1 = in.nextInt();

            check = numberCheck(visible, num1);
            while (!check){
                num1 = in.nextInt();
                check = numberCheck(visible, num1);
            }
            num1 = num1 - 1;

            visible = checkMine(visible, array, num1);

            acabar = checkWin(visible);
        }
    }
}
