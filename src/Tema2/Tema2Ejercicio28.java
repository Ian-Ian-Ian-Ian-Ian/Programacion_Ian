package Tema2;

import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {

        Random random = new Random();
        int loteria= random.nextInt(99999);
        Scanner in = new Scanner(System.in);

        int intentos = 5;

        System.out.println("Intenta adivinar el número del 0 al 99.999");

        while (intentos > 0){
            if (intentos > 1) {
                System.out.println("Te quedan " + intentos + " intentos");
            } else if (intentos == 1) {
                System.out.println("Te queda " + intentos + " intento");
            }
            int num = in.nextInt();
            if (num == loteria){
                System.out.println("¡Felicidades has acertado!");
                break;
            }
            intentos--;
        }
        System.out.println("El número de la Loteria era " + loteria);
    }
}
