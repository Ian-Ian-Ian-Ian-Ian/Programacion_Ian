package Tema3.Arrays;

import java.util.Scanner;

public class WifiHotel {

    public static void simulation(int[] array, int hab, int senal) {

        for (int i = 0; i < senal; i++){
            if (hab + i < 20) {
                array[hab + i] = senal - i;
            }
            if (hab - i >= 0) {
                array[hab - i] = senal - i;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int[] array;
        array = new int[20];

        System.out.println("¿En que habitación quieres instalar el wifi? (1-20)");
        int hab = in.nextInt();
        while (hab < 1 || hab > 20) {
            System.out.println("Por favor, introduzca una habitación dentro del rango");
            hab = in.nextInt();
        }
        hab = hab - 1;

        System.out.println("Ahora dime la señal que quieres instalar (1-6)");
        int senal = in.nextInt();
        while (senal < 1 || senal > 6) {
            System.out.println("Por favor, introduzca una habitación dentro del rango");
            senal = in.nextInt();
        }

        simulation(array, hab, senal);
    }
}
