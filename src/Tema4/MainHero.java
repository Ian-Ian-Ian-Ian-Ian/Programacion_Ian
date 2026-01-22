package Tema4;

import java.util.Random;
import java.util.Scanner;

public class MainHero {
    public static int autoRest(Hero jugador) {
        jugador.drinkPotion();
        int vida = jugador.getHealth();
        return vida;
    }

    public static int findPotion(Hero jugador) {
        jugador.drinkPotion();
        int vida = jugador.getHealth();
        return vida;
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
        int oleada = -1;
        //Mientras nuestra vida sea mayor que 0 que siga el juego
        while (vida > 0) {

            oleada++;

            probabilidad = random.nextInt(100 + 1);
            if (probabilidad >= 1 && probabilidad <= 50) {
                enemigos = 1;
            } else if (probabilidad >= 51 && probabilidad <= 80) {
                enemigos = 2;
            } else {
                enemigos = 3;
            }

            //Para crear a los enemigos al principio de cada oleada
            switch (enemigos) {
                case 1:
                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 75) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 75) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 75) / 100);

                    enemigo2.setHealth(0);
                    enemigo3.setHealth(0);

                    System.out.println("Ha aparecido 1 enemigo!");
                    break;
                case 2:
                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 55) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 55) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 55) / 100);

                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 55) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 55) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 55) / 100);

                    enemigo3.setHealth(0);

                    System.out.println("Han aparecido 2 enemigos!");
                    break;
                case 3:
                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 40) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 40) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 40) / 100);

                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 40) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 40) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 40) / 100);

                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 40) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 40) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 40) / 100);

                    System.out.println("Han aparecido 3 enemigos!");
                    break;
            }

            while (jugador.getHealth() > 0 || (enemigo1.getHealth() > 0 && enemigo2.getHealth() > 0 && enemigo3.getHealth() > 0)) {


                jugador.levelUp();
            }


            probabilidad = random.nextInt(1000 + 1);
            if (probabilidad == 1) {
                jugador.setHealth(autoRest(jugador));
            }

            probabilidad = random.nextInt(100 + 1);
            if (probabilidad >= 1 && probabilidad <= 10) {
                jugador.setHealth(findPotion(jugador));
            }
        }
        switch (oleada) {
            case 0:
                System.out.println("No has sobrevivido ninguna oleada :(");
                break;
            case 1:
                System.out.println("Has sobrevivido " + oleada + " oleada");
                break;
            default:
            System.out.println("Has sobrevivido un total de " + oleada + " oleadas!");
        }
    }
}
