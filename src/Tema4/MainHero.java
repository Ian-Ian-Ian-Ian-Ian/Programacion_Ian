package Tema4;

import java.util.Random;
import java.util.Scanner;

public class MainHero {
    public static int autoRest(Hero jugador) {
        jugador.rest();
        return jugador.getHealth();
    }

    public static int findPotion(Hero jugador) {
        jugador.drinkPotion();
        return jugador.getHealth();
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int probabilidad;

        System.out.println("Bienvenido a el juego del Héroe.");
        System.out.println("Por favor, introduce el nombre del Héroe:");
        System.out.println("**********");
        String nombre = in.nextLine();

        while (nombre.length() > 10) {
            System.out.println("Introduce un nombre válido dentro del rango de carácteres (10)");
            System.out.println("**********");
            nombre = in.nextLine();
        }
        //Creación de los personajes
        //Héroe
        Hero jugador = new Hero(nombre);
        System.out.println();
        System.out.println("Muy bien, comienza tu aventura con " + nombre + "!");

        //Enemigos
        Hero enemigo1 = new Hero("Duende");
        Hero enemigo2 = new Hero("Duende");
        Hero enemigo3 = new Hero("Duende");

        //Variables utilizadas en el bucle
        int enemigos;
        int oleada = -1;
        int turno = 1;
        int opcion;

        //Mientras nuestra vida sea mayor que 0 que siga el juego
        while (jugador.getHealth() > 0) {

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

            while (jugador.getHealth() > 0 && (enemigo1.getHealth() > 0 || enemigo2.getHealth() > 0 || enemigo3.getHealth() > 0)) {

                switch (turno) {

                    case 1:
                        //Elección de acción
                        System.out.println("Selecciona la acción que quieres realizar");
                        System.out.println("1. Atacar | 2. Beber poción | 3. Descansar");
                        opcion = in.nextInt();
                        while (opcion < 1 || opcion > 3) {
                            System.out.println("Selecciona una acción válida");
                            opcion = in.nextInt();
                        }

                        switch (opcion) {
                            case 1:
                                if (enemigo1.getHealth() > 0) {
                                    jugador.attack(enemigo1);
                                    System.out.println("Has atacado al Duende 1");

                                } else if (enemigo2.getHealth() > 0) {
                                    jugador.attack(enemigo2);
                                    System.out.println("Has atacado al Duende 2");

                                } else if (enemigo3.getHealth() > 0) {
                                    jugador.attack(enemigo3);
                                    System.out.println("Has atacado al Duende 3");
                                }

                                turno--;
                                break;
                            case 2:
                                jugador.drinkPotion();
                                turno--;
                                break;
                            case 3:
                                jugador.rest();
                                turno = turno - 2;
                                break;
                        }
                    break;

                    case 0:
                        System.out.println("Estas descansando, pasa tu turno");
                    break;
                }

                jugador.levelUp();

                turno++;
            }

            //Probabilidad de eventos tras acabar una oleada
            probabilidad = random.nextInt(1000 + 1);
            if (probabilidad == 1) {
                jugador.setHealth(autoRest(jugador));
            }

            probabilidad = random.nextInt(100 + 1);
            if (probabilidad >= 1 && probabilidad <= 10) {
                jugador.setHealth(findPotion(jugador));
            }
        }

        //Informe sobre oleadas sobrevividas
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
