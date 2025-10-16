package Tema2;

import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {

        Random random = new Random();
        int Loteria= random.nextInt(99999);
        Scanner in = new Scanner(System.in);

        int Intentos = 5;

        System.out.println("Intenta adivinar el número del 0 al 99.999");

        while (Intentos > 0){
            if (Intentos > 1) {
                System.out.println("Te quedan " + Intentos + " intentos");
            } else if (Intentos == 1) {
                System.out.println("Te queda " + Intentos + " intento");
            }
            int num = in.nextInt();
            if (num == Loteria){
                System.out.println("¡Felicidades has acertado!");
                break;
            }
            Intentos--;
        }
        System.out.println("El número de la Loteria era " + Loteria);
    }
}
