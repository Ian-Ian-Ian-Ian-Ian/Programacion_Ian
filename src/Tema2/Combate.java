package Tema2;

import java.util.Scanner;
import java.util.Random;

public class Combate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Las normas son: Un total máximo de 500 puntos en atributos y no más de 200 puntos por atributo");

        // Jugador 1 ---------------------------------------------------------------------------------------------------

        System.out.println("Procede a darle los atributos a Jugador 1");
        int atributos = 500;
        String ok = "no ok";

        int ataque1 = 0;
        int defensa1 = 0;
        int velocidad1 = 0;
        int hp1 = 0;

        while (ok.equals("no ok")) {

            System.out.println("Ataque:");
            ataque1 = in.nextInt();

            if (ataque1 >= 1 && ataque1 <= 200) {

                if (atributos > ataque1) {
                    atributos = atributos - ataque1;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }
        ok = "no ok";

        while (ok.equals("no ok")) {

            System.out.println("Defensa:");
            defensa1 = in.nextInt();

            if (defensa1 >= 1 && defensa1 <= 200) {

                if (atributos > defensa1) {
                    atributos = atributos - defensa1;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }
        ok = "no ok";

        while (ok.equals("no ok")) {

            System.out.println("HP (Puntos de vida):");
            hp1 = in.nextInt();

            if (hp1 >= 1 && hp1 <= 200) {

                if (atributos > hp1) {
                    atributos = atributos - hp1;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }
        ok =  "no ok";

        while (ok.equals("no ok")) {

            System.out.println("Velocidad:");
            velocidad1 = in.nextInt();

            if (velocidad1 >= 1 && velocidad1 <= 200) {

                if (atributos >= velocidad1) {
                    atributos = atributos - velocidad1;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }

        System.out.println("Estadísticas finales de Jugador 1");
        System.out.println("Ataque:     " + ataque1);
        System.out.println("Defensa:    " + defensa1);
        System.out.println("HP:         " + hp1);
        System.out.println("Velocidad:  " + velocidad1);
        System.out.println();


        // Jugador 2 ---------------------------------------------------------------------------------------------------

        System.out.println("Ahora procede a darle los atributos a Jugador 2");
        atributos = 500;
        ok = "no ok";

        int ataque2 = 0;
        int defensa2 = 0;
        int velocidad2 = 0;
        int hp2 = 0;

        while (ok.equals("no ok")) {

            System.out.println("Ataque:");
            ataque2 = in.nextInt();

            if (ataque2 >= 1 && ataque2 <= 200) {

                if (atributos > ataque2) {
                    atributos = atributos - ataque2;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }
        ok = "no ok";

        while (ok.equals("no ok")) {

            System.out.println("Defensa:");
            defensa2 = in.nextInt();

            if (defensa2 >= 1 && defensa2 <= 200) {

                if (atributos > defensa2) {
                    atributos = atributos - defensa2;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }
        ok = "no ok";

        while (ok.equals("no ok")) {

            System.out.println("HP (Puntos de vida):");
            hp2 = in.nextInt();

            if (hp2 >= 1 && hp2 <= 200) {

                if (atributos > hp2) {
                    atributos = atributos - hp2;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }
        ok =  "no ok";

        while (ok.equals("no ok")) {

            System.out.println("Velocidad:");
            velocidad2 = in.nextInt();

            if (velocidad2 >= 1 && velocidad2 <= 200) {

                if (atributos >= velocidad2) {
                    atributos = atributos - velocidad2;
                    ok = "ok";
                } else {
                    System.out.println("Los atributos no pueden sumar más de 500 puntos en total. Te quedan " + atributos + " puntos.");
                    System.out.println();
                }

            } else {
                System.out.println("No es un atributo válido");
                System.out.println();
            }
        }

        System.out.println("Estadísticas finales de Jugador 2");
        System.out.println("Ataque:     " + ataque2);
        System.out.println("Defensa:    " + defensa2);
        System.out.println("HP:         " + hp2);
        System.out.println("Velocidad:  " + velocidad2);
        System.out.println();

        System.out.println("Introduce cualquier tecla para continuar");
        ok = in.next();

        Random random = new Random();
        while (velocidad1 == velocidad2) {
            velocidad1 = random.nextInt(200);
            velocidad2 = random.nextInt(200);
        }

        int dano = 0;
        int critico = 0;
        int ronda = 1;
        String partida = "En proceso";

        if (velocidad1 > velocidad2) {
            while (partida == "En proceso") {

                System.out.println("**************************************************"); // Hay 50 *
                System.out.println("RONDA " + ronda);
                System.out.println("Jugador 1: " + hp1);
                System.out.println("Jugador 2: " + hp2);
                System.out.println();

                //Aqui formula de ataque jugador 1

                dano = ataque1 - defensa2;
                if (dano < 0){
                    dano = 0;
                }
                dano = dano + random.nextInt(10);

                critico = random.nextInt(100);
                if (critico >= 0 && critico <= 15) {
                    dano = dano * 2;
                    System.out.println("!¡Crítico!");
                }

                System.out.println("El jugador 1 hace " + dano + " puntos de daño");
                System.out.println();

                hp2 = hp2 - dano;
                if (hp2 <= 0) {

                    System.out.println("¡Jugador 1 gana!");
                    partida = "Acabada";
                    break;
                }

                //Aqui formula ataque jugador 2

                dano = ataque2 - defensa1;
                if (dano < 0){
                    dano = 0;
                }
                dano = dano + random.nextInt(10);

                critico = random.nextInt(100);
                if (critico >= 0 && critico <= 15) {
                    dano = dano * 2;
                    System.out.println("!¡Crítico!");
                }

                System.out.println("Jugador 2 hace " + dano + " puntos de daño");
                System.out.println();

                hp1 = hp1 - dano;

                if (hp1 <= 0) {

                    System.out.println("¡Jugador 2 gana!");
                    partida = "Acabada";
                    break;
                }

                System.out.println("Jugador 1: " + hp1);
                System.out.println("Jugador 2: " + hp2);

                System.out.println("Introduce cualquier tecla para continuar");
                ok = in.next();

                ronda++;
            }
        } else if (velocidad2 > velocidad1) {
            while (partida == "En proceso") {

                System.out.println("**************************************************"); // Hay 50 *
                System.out.println("RONDA " + ronda);
                System.out.println("Jugador 1: " + hp1);
                System.out.println("Jugador 2: " + hp2);
                System.out.println();

                //Aqui formula de ataque jugador 2

                dano = ataque2 - defensa1;
                if (dano < 0){
                    dano = 0;
                }
                dano = dano + random.nextInt(10);

                critico = random.nextInt(100);
                if (critico >= 0 && critico <= 15) {
                    dano = dano * 2;
                    System.out.println("!¡Crítico!");
                }

                System.out.println("El jugador 2 hace " + dano + " puntos de daño");
                System.out.println();

                hp1 = hp1 - dano;
                if (hp1 <= 0) {

                    System.out.println("¡Jugador 2 gana!");
                    partida = "Acabada";
                    break;
                }

                //Aqui formula ataque jugador 1

                dano = ataque1 - defensa2;
                if (dano < 0){
                    dano = 0;
                }
                dano = dano + random.nextInt(10);

                critico = random.nextInt(100);
                if (critico >= 0 && critico <= 15) {
                    dano = dano * 2;
                    System.out.println("!¡Crítico!");
                }

                System.out.println("Jugador 1 hace " + dano + " puntos de daño");
                System.out.println();

                hp2 = hp2 - dano;

                if (hp2 <= 0) {

                    System.out.println("¡Jugador 1 gana!");
                    partida = "Acabada";
                    break;
                }

                System.out.println("Jugador 1: " + hp1);
                System.out.println("Jugador 2: " + hp2);

                System.out.println("Introduce cualquier tecla para continuar");
                ok = in.next();

                ronda++;
            }
        }
    }
}

