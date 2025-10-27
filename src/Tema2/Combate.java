package Tema2;

import java.beans.Customizer;
import java.util.Scanner;
import java.util.Random;

public class Combate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String personaje = "";

        int customizacion = 0;
        System.out.println("");
        System.out.println("¿Que desea? [ Crear personaje (1) | Seleccionar personaje ya existente (2) ] ");
        customizacion = in.nextInt();
        while (customizacion < 1 && customizacion > 2) {
            customizacion = in.nextInt();
            if (customizacion < 1 && customizacion > 2) {
                System.out.println("Por favor introduzca una opción válida");
            }
        }

        //Variable de confirmación
        String ok = "no ok";
        //Variables jugador 1
        int ataque1 = 0;
        int defensa1 = 0;
        int velocidad1 = 0;
        int hp1 = 0;
        String habilidad1 = "";
        //Variables jugador 2
        int ataque2 = 0;
        int defensa2 = 0;
        int velocidad2 = 0;
        int hp2 = 0;
        String habilidad2 = "";

        if (customizacion == 1) {
            System.out.println("");
            System.out.println("Las normas son: Un total máximo de 500 puntos en atributos y no más de 200 puntos por atributo");

            // Jugador 1 ---------------------------------------------------------------------------------------------------

            System.out.println("");
            System.out.println("Procede a darle los atributos a Jugador 1");
            System.out.println("");
            int atributos = 500;


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
            ok = "no ok";

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
            System.out.println("");
            atributos = 500;
            ok = "no ok";

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
            ok = "no ok";

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

        } else if (customizacion == 2) {

            while (ok.equals("not ok")) {
            System.out.println("Seleccione el personaje para Jugador 1 (Escribe el nombre)");
            System.out.println("Si desea saber más información sobre las Habilidades, escriba 'ayuda'");
            System.out.println("Personaje:      Atleta          Justiciero      Clerigo         Druida          Veterano");
            System.out.println("");
            System.out.println("Ataque:         125             150             100             75              150");
            System.out.println("Defensa:        100             125             125             125             150");
            System.out.println("HP:             200             125             150             150             150");
            System.out.println("Velocidad       25              100             75              150             50");
            System.out.println("Habilidad:      Velocista       Tablas          Bendicion       Punzante        Cansancio");
            personaje = in.next();


            switch (personaje) {
                case "Atleta" :
                    ataque1 = 125;
                    defensa1 = 100;
                    velocidad1 = 25;
                    hp1 = 200;
                    habilidad1 = "Velocista";
                case "Justiciero" :
                    ataque1 = 150;
                    defensa1 = 125;
                    velocidad1 = 100;
                    hp1 = 125;
                    habilidad1 = "Tablas";
                case "Clerigo" :
                    ataque1 = 125;
                    defensa1 = 100;
                    velocidad1 = 25;
                    hp1 = 200;
                    habilidad1 = "Bencicion";
                case "Druida" :
                    ataque1 = 75;
                    defensa1 = 125;
                    velocidad1 = 50;
                    hp1 = 200;
                    habilidad1 = "Punzante";
                case "Veterano" :
                    ataque1 = 150;
                    defensa1 = 150;
                    velocidad1 = 50;
                    hp1 = 150;
                    habilidad1 = "Cansancio";
                case "ayuda" :
                        System.out.println("");
                        System.out.println("Velocista:  Siempre comienza primero (si el enemigo no tiene la habilidad Velocista");
                        System.out.println("Tablas:     Hace que el campo de batalla sea igual, haciendo que la habilidad rival no tenga efecto");
                        System.out.println("Bendicion:  El personaje esta bendecido con magia que hace que regenere un poco de vida al final de la ronda");
                        System.out.println("Punzante:   Envuelve al personaje en una capa de espinas que hace daño a quien se atreva a atacarle");
                        System.out.println("Cansancio:  Hace que el personaje duerma después de realizar una acción, a cambio de duplicar la efectividad de la acción");
                        System.out.println("");
            }
        }
        System.out.println("Introduce cualquier tecla para continuar");
        ok = in.next();

        if (habilidad1.equals("Velocista")) {
            velocidad1 = 999;
        }
        if (habilidad2.equals("Velocista")) {
            velocidad2 = 999;
        }

        Random random = new Random();
        while (velocidad1 == velocidad2) {
            velocidad1 = random.nextInt(200);
            velocidad2 = random.nextInt(200);
        }

        //Variables para los combates
        int dano = 0;
        int critico = 0;
        int ronda = 1;
        int repeticion = 0;
        int accion = 0;
        String vida1 = "" ;
        String vida2 = "" ;

        String partida = "En proceso";

        if (velocidad1 > velocidad2) {
            System.out.println("¡Empieza Jugador 1!");
            while (partida == "En proceso") {

                repeticion = hp1;
                vida1 = "";
                while (repeticion > 0) {
                    vida1 = vida1 + "-";
                    repeticion = repeticion - 5;
                }

                repeticion = hp2;
                vida2 = "";
                while (repeticion > 0) {
                    vida2 = vida2 + "-";
                    repeticion = repeticion - 5;
                }

                System.out.println("**************************************************"); // Hay 50 *
                System.out.println("RONDA " + ronda);
                System.out.println("Jugador 1: " + hp1 + " " + vida1);
                System.out.println("Jugador 2: " + hp2 + " " + vida2);
                System.out.println();

                //Aqui formula de ataque jugador 1

                System.out.println("Selecciona la accion que Jugador 1 haga ( 1 [atacar] | 2 [sanar] )");
                accion = in.nextInt();

                switch (accion) {

                    case 1:
                        if (accion == 1) {
                            dano = ataque1 - defensa2;
                            if (dano < 0) {
                                dano = 0;
                            }
                            dano = dano + random.nextInt(10);

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else {

                                critico = random.nextInt(100);
                                if (critico >= 0 && critico <= 15) {
                                    dano = dano * 2;
                                    System.out.println("!¡Crítico!");
                                }

                                System.out.println("Jugador 1 hace " + dano + " puntos de daño");
                                System.out.println();

                                hp2 = hp2 - dano;
                            }
                        }

                    case 2:
                        if (accion == 2) {
                            dano = random.nextInt(10);
                            hp1 = hp1 + dano;

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else if (hp1 > 200) {
                                System.out.println("Has alcanzado el límite de 200 de hp");
                                hp1 = 200;
                            } else {
                                System.out.println("Jugador 1 se cura " + dano + " puntos de vida");
                            }
                        }

                    default:
                        if (accion == 1 || accion == 2) {
                            System.out.println("");
                        } else {
                            System.out.println("Eso no es una accion. ¡Pierdes el turno!");
                        }
                }
                if (hp2 <= 0) {

                    System.out.println("¡Jugador 1 gana!");
                    partida = "Acabada";
                } else {

                //Aqui formula ataque jugador 2

                System.out.println("Selecciona la accion que Jugador 2 haga ( 1 [atacar] | 2 [sanar] )");
                accion = in.nextInt();

                switch (accion) {

                    case 1:
                        if (accion == 1) {
                            dano = ataque2 - defensa1;
                            if (dano < 0) {
                                dano = 0;
                            }
                            dano = dano + random.nextInt(10);

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else {
                                critico = random.nextInt(100);
                                if (critico >= 0 && critico <= 15) {
                                    dano = dano * 2;
                                    System.out.println("!¡Crítico!");
                                }

                                System.out.println("Jugador 2 hace " + dano + " puntos de daño");
                                System.out.println();

                                hp1 = hp1 - dano;
                            }
                        }

                    case 2:
                        if (accion == 2) {
                            dano = random.nextInt(10);
                            hp2 = hp2 + dano;

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else if (hp2 > 200) {
                                System.out.println("Has alcanzado el límite de 200 de hp");
                                hp2 = 200;
                            } else {
                                System.out.println("Jugador 2 se cura " + dano + " puntos de vida");
                            }
                        }
                    default:
                        if (accion == 1 || accion == 2){
                            System.out.println("");
                        } else {
                            System.out.println("Eso no es una accion. ¡Pierdes el turno!");
                        }
                }

                if (hp1 <= 0) {

                    System.out.println("¡Jugador 2 gana!");
                    partida = "Acabada";

                } else {

                    repeticion = hp1;
                    vida1 = "";
                    while (repeticion > 0) {
                        vida1 = vida1 + "-";
                        repeticion = repeticion - 5;
                    }

                    repeticion = hp2;
                    vida2 = "";
                    while (repeticion > 0) {
                        vida2 = vida2 + "-";
                        repeticion = repeticion - 5;
                    }

                    System.out.println("Jugador 1: " + hp1 + " " + vida1);
                    System.out.println("Jugador 2: " + hp2 + " " + vida2);

                    // aqui
                    System.out.println("");

                    ronda++;
                }
                }
            }
        } else if (velocidad2 > velocidad1) {
            System.out.println("¡Empieza Jugador 2!");
            while (partida == "En proceso") {

                repeticion = hp1;
                vida1 = "";
                while (repeticion > 0) {
                    vida1 = vida1 + "-";
                    repeticion = repeticion - 5;
                }

                repeticion = hp2;
                vida2 = "";
                while (repeticion > 0) {
                    vida2 = vida2 + "-";
                    repeticion = repeticion - 5;
                }

                System.out.println("**************************************************"); // Hay 50 *
                System.out.println("RONDA " + ronda);
                System.out.println("Jugador 1: " + hp1 + " " + vida1);
                System.out.println("Jugador 2: " + hp2 + " " + vida2);
                System.out.println();

                //Aqui formula de ataque jugador 2

                System.out.println("Selecciona la accion que Jugador 2 haga ( 1 [atacar] | 2 [sanar] )");
                accion = in.nextInt();

                switch (accion) {

                    case 1:
                        if (accion == 1) {
                            dano = ataque2 - defensa1;
                            if (dano < 0) {
                                dano = 0;
                            }
                            dano = dano + random.nextInt(10);

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else {
                                critico = random.nextInt(100);
                                if (critico >= 0 && critico <= 15) {
                                    dano = dano * 2;
                                    System.out.println("!¡Crítico!");
                                }

                                System.out.println("Jugador 2 hace " + dano + " puntos de daño");
                                System.out.println();

                                hp1 = hp1 - dano;
                            }
                        }
                    case 2:
                        if (accion == 2) {
                            dano = random.nextInt(10);
                            hp2 = hp2 + dano;

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else if (hp2 > 200) {
                                System.out.println("Has alcanzado el límite de 200 de hp");
                                hp2 = 200;
                            } else {
                                System.out.println("Jugador 2 se cura " + dano + " puntos de vida");
                            }
                        }

                    default:
                        if (accion == 1 || accion == 2) {
                            System.out.println("");
                        } else {
                            System.out.println("Eso no es una accion. ¡Pierdes el turno!");
                        }
                }

                if (hp1 <= 0) {

                    System.out.println("¡Jugador 2 gana!");
                    partida = "Acabada";

                } else {

                //Aqui formula ataque jugador 1

                System.out.println("Selecciona la accion que Jugador 1 haga ( 1 [atacar] | 2 [sanar] )");
                accion = in.nextInt();

                switch (accion) {

                    case 1:
                        if (accion == 1) {
                            dano = ataque1 - defensa2;
                            if (dano < 0) {
                                dano = 0;
                            }
                            dano = dano + random.nextInt(10);

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else {

                                critico = random.nextInt(100);
                                if (critico >= 0 && critico <= 15) {
                                    dano = dano * 2;
                                    System.out.println("!¡Crítico!");
                                }

                                System.out.println("Jugador 1 hace " + dano + " puntos de daño");
                                System.out.println();

                                hp2 = hp2 - dano;
                            }
                        }

                    case 2:
                        if (accion == 2) {
                            dano = random.nextInt(10);
                            hp1 = hp1 + dano;

                            if (dano == 0) {
                                System.out.println("¡La accion ha fallado!");
                            } else if (hp1 > 200) {
                                System.out.println("Has alcanzado el límite de 200 de hp");
                                hp1 = 200;
                            } else {
                                System.out.println("Jugador 1 se cura " + dano + " puntos de vida");
                            }
                        }
                    default:
                        if (accion == 1 || accion == 2) {
                            System.out.println("");
                        } else {
                            System.out.println("Eso no es una accion. ¡Pierdes el turno!");
                        }
                }
                if (hp2 <= 0) {

                    System.out.println("¡Jugador 1 gana!");
                    partida = "Acabada";
                } else {
                    repeticion = hp1;
                    vida1 = "";
                    while (repeticion > 0) {
                        vida1 = vida1 + "-";
                        repeticion = repeticion - 5;
                    }

                    repeticion = hp2;
                    vida2 = "";
                    while (repeticion > 0) {
                        vida2 = vida2 + "-";
                        repeticion = repeticion - 5;
                    }

                    System.out.println("Jugador 1: " + hp1 + " " + vida1);
                    System.out.println("Jugador 2: " + hp2 + " " + vida2);

                    // aqui
                    System.out.println("");

                    ronda++;

                }
                }
            }
        }
    }
    }
}