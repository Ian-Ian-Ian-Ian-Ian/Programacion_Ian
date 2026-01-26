package Tema4;

import java.util.Random;
import java.util.Scanner;

public class MainHero {
    public static int autoRest(Hero jugador) {
        System.out.println("Te sientes cansado tras el combate...");
        jugador.rest();
        return jugador.getHealth();
    }

    public static int findPotion(Hero jugador) {
        System.out.println("¡Has encontrado una poción tirada en el suelo!");
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
        Hero enemigo1 = new Hero("Duende 1");
        Hero enemigo2 = new Hero("Duende 2");
        Hero enemigo3 = new Hero("Duende 3");

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
                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 80) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 90) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 90) / 100);

                    enemigo2.setHealth(0);
                    enemigo3.setHealth(0);

                    System.out.println("¡Ha aparecido 1 enemigo!");
                    break;
                case 2:
                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 65) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 80) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 85) / 100);

                    enemigo2.setMaxHealth((jugador.getMaxHealth() * 65) / 100);
                    enemigo2.setHealth(enemigo2.getMaxHealth());
                    enemigo2.setAttack((jugador.getAttack() * 80) / 100);
                    enemigo2.setDefense((jugador.getDefense() * 85) / 100);

                    enemigo3.setHealth(0);

                    System.out.println("¡Han aparecido 2 enemigos!");
                    break;
                case 3:
                    enemigo3.setMaxHealth((jugador.getMaxHealth() * 50) / 100);
                    enemigo3.setHealth(enemigo3.getMaxHealth());
                    enemigo3.setAttack((jugador.getAttack() * 70) / 100);
                    enemigo3.setDefense((jugador.getDefense() * 75) / 100);

                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 50) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 70) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 75) / 100);

                    enemigo1.setMaxHealth((jugador.getMaxHealth() * 50) / 100);
                    enemigo1.setHealth(enemigo1.getMaxHealth());
                    enemigo1.setAttack((jugador.getAttack() * 70) / 100);
                    enemigo1.setDefense((jugador.getDefense() * 75) / 100);

                    System.out.println("¡Han aparecido 3 enemigos!");
                    break;
            }

            while (jugador.getHealth() > 0 && (enemigo1.getHealth() > 0 || enemigo2.getHealth() > 0 || enemigo3.getHealth() > 0)) {
                System.out.println("\nSalud restante: " + jugador.getHealth());
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
                        System.out.println("\nEventos del turno ----------------\n");

                        //Probabilidades de huida
                        probabilidad = random.nextInt(100 + 1);
                        if (probabilidad >= 1 && probabilidad <= 10 && enemigo1.getHealth() > 0) {
                            enemigo1.setHealth(0);
                            System.out.println("¡" + enemigo1.getName() + " ha huido del combate! \n");
                        }

                        probabilidad = random.nextInt(100 + 1);
                        if (probabilidad >= 1 && probabilidad <= 10 && enemigo2.getHealth() > 0) {
                            enemigo2.setHealth(0);
                            System.out.println("¡" + enemigo2.getName() + " ha huido del combate! \n");
                        }

                        probabilidad = random.nextInt(100 + 1);
                        if (probabilidad >= 1 && probabilidad <= 10 && enemigo3.getHealth() > 0) {
                            enemigo3.setHealth(0);
                            System.out.println("¡" + enemigo3.getName() + " ha huido del combate! \n");
                        }

                        //Opciones de acción
                        switch (opcion) {
                            case 1:
                                if (enemigo1.getHealth() > 0) {
                                    jugador.attack(enemigo1);
                                    System.out.println(enemigo1.getName() + "\n");

                                } else if (enemigo2.getHealth() > 0) {
                                    jugador.attack(enemigo2);
                                    System.out.println(enemigo2.getName() + "\n");

                                } else if (enemigo3.getHealth() > 0) {
                                    jugador.attack(enemigo3);
                                    System.out.println(enemigo3.getName() + "\n");
                                }

                                turno--;
                                break;
                            case 2:
                                jugador.drinkPotion();
                                turno--;
                                break;
                            case 3:
                                jugador.rest();
                                turno--;
                                turno--;
                                break;
                        }
                    break;

                    case 0:
                        System.out.println("Estas descansando, pasa tu turno");
                    break;
                }

                if (enemigo1.getHealth() > 0 && jugador.getHealth() > 0) {
                    enemigo1.attack(jugador);
                    System.out.println(jugador.getName() + "\n");
                }

                if (enemigo2.getHealth() > 0 && jugador.getHealth() > 0) {
                    enemigo2.attack(jugador);
                    System.out.println(jugador.getName() + "\n");
                }

                if (enemigo3.getHealth() > 0 && jugador.getHealth() > 0) {
                    enemigo3.attack(jugador);
                    System.out.println(jugador.getName() + "\n");
                }

                jugador.levelUp();

                System.out.println("Introduce cualquier tecla para continuar");
                in.next();

                turno++;
            }

            System.out.println("\n!Fin del combate!\n");

            //Probabilidad de eventos tras acabar una oleada
            probabilidad = random.nextInt(1000 + 1);
            if (probabilidad == 1 && jugador.getHealth() > 0) {
                jugador.setHealth(autoRest(jugador));
            }

            probabilidad = random.nextInt(100 + 1);
            if (probabilidad >= 1 && probabilidad <= 10 && jugador.getHealth() > 0) {
                jugador.setHealth(findPotion(jugador));
            }

            turno = 1;
        }

        System.out.println("Te han derrotado...");

        //Informe sobre oleadas sobrevividas
        switch (oleada) {
            case 0:
                System.out.println("No has sobrevivido ninguna oleada :(");
                break;
            case 1:
                System.out.println("¡Has sobrevivido " + oleada + " oleada");
                break;
            default:
            System.out.println("¡Has sobrevivido un total de " + oleada + " oleadas!");
        }
    }
}
