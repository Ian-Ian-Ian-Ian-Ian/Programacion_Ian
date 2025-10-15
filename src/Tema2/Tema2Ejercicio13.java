package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame la hora");
        int Hora = in.nextInt();

        if (Hora > 23 || Hora < 0) {
            System.out.println("Eso no es una hora");
        } else {
            System.out.println("Dame los minutos");
            int Min = in.nextInt();

            if (Min > 60 || Min < 0) {
                System.out.println("Eso no son minutos");
            } else {
                System.out.println("Dame los segundos");
                int Sec = in.nextInt();

                if (Sec > 59 || Sec < 0) {
                    System.out.println("Eso no son segundos");
                } else {
                    Sec = Sec + 1;
                    if (Sec == 60) {
                        Sec = 00;
                        Min = Min + 1;
                    }
                    if (Min == 60) {
                        Min = 00;
                        Hora = Hora + 1;
                    }
                    if (Hora == 24) {
                        Hora = 00;
                        System.out.printf("En un segundo seán las " + "%02d:%02d:%02d%n", Hora, Min, Sec);
                    } else {
                        System.out.println("En un segundo seán las " + Hora + ":" + Min + ":" + Sec);
                    }
                }
            }
        }
    }
}
