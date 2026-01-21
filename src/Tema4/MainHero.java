package Tema4;

import java.util.Random;
import java.util.Scanner;

public class MainHero {
    public static int autoRest() {
        return 1;
    }

    public static int findPotion() {
        return 1;
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        boolean accion = false;
        int probabilidad = 0;

        System.out.println("Bienvenido a el juego del Héroe.");
        System.out.println("Por favor, introduce el nombre del Héroe:");
        String nombre = in.nextLine();
        System.out.println("^^^^^^^^^^");

        while (nombre.length() > 10) {
            in.nextLine();
            System.out.println("Introduce un nombre válido dentro del rango de carácteres (10)");
            nombre = in.nextLine();
            System.out.println("^^^^^^^^^^");
        }
        //Creación de los personajes
        Hero jugador = new Hero(nombre);
        System.out.println();
        System.out.println("Muy bien, comienza tu aventura con " + nombre + "!");
        Hero enemigo1 = new Hero("Duende");
        Hero enemigo2 = new Hero("Duende");
        Hero enemigo3 = new Hero("Duende");

        boolean OLEADA_EN_MARCHA = true;
        int vida = jugador.getHealth();
        int enemigos;
        //Mientras nuestra vida sea mayor que 0 que siga el juego
        while (vida > 0) {

            probabilidad = random.nextInt(100 + 1);
            if (probabilidad >= 1 && probabilidad <= 50) {
                enemigos = 1;
            } else if (probabilidad >= 51 && probabilidad <= 80) {
                enemigos = 2;
            } else {
                enemigos = 3;
            }

            switch (enemigos) {
                case 1:

                    break;
            }

            probabilidad = random.nextInt(1000 + 1);
            if (probabilidad == 1) {
                autoRest();
            }

            probabilidad = random.nextInt(100 + 1);
            if (probabilidad >= 1 && probabilidad <= 10) {
                findPotion();
            }
        }
    }
}
