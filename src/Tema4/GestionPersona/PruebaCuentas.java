package Tema4.GestionPersona;

import java.util.Scanner;

public class PruebaCuentas {
    public static void showMenu() {
        System.out.println(
                "Selecciona la opción que quieras realizar\n" +
                "-----------------------------------------\n" +
                "1. Crear instancia de tipo \"Persona\"\n" +
                "2. Crear instancia de tipo \"Cuenta\" y unirlo a una persona\n" +
                "3. Mostrar datos de una persona\n" +
                "4. Recibir nómina mensual de una persona\n" +
                "5. Recibir un pago\n" +
                "6. Realizar transferencias entre cuentas\n" +
                "7. Imprimir personas morosas\n" +
                "8. Salir");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean moroso = false;
        double saldo;
        int cantidad = -1;
        int num_cuenta;
        boolean salir = false;

        Persona persona = new Persona();
        Cuenta cuenta = new Cuenta();
        Cuenta cuenta2 = new Cuenta();

        String nombre_persona; //Esta String aunque se llame nombre_persona se utiliza para el DNI porque lo cambia tarde y para no tener ir una a una a cambiarlo
        Persona personas[] = new Persona[10];
        Cuenta cuentas[];


        while (!salir) {
        showMenu();
        int opcion = in.nextInt();
        while (opcion < 1 || opcion > 8) {
            System.out.println("Selecciona una acción a realizar válida");
            opcion = in.nextInt();
        }

        in.nextLine();

        switch (opcion) {
            case 1:
                for (int i = 0; i < personas.length; i++) {

                    if (personas[i] == null) {
                        cantidad = i;
                        System.out.println("Dime el DNI de la persona que quieres agregar");
                        nombre_persona = in.nextLine();
                        persona.setDNI(nombre_persona);

                        for (int j = 0; j < cantidad; j++) {
                            while (personas[j].getDNI().equals(nombre_persona)) {
                                System.out.println("No pueden haber dos personas con el mismo DNI, inserte otro DNI");
                                nombre_persona = in.nextLine();
                                j = 0;
                            }
                        }

                        personas[i] = persona;
                        i = personas.length;

                    } else if (personas[personas.length - 1] != null) {
                        System.out.println("Lo sentimos, se ha alcanzado el número máximo de personas");
                    }

                }
                break;
            case 2:
                if (personas[0] == null) {
                    System.out.println("No hay personas registradas todavía\n");
                } else {
                    System.out.println("Dime el DNI de la persona a la que quieres añadir una nueva cuenta");
                    nombre_persona = in.nextLine();

                    for (int i = 0; i < cantidad; i++) {

                        if (personas[i].getDNI().equals(nombre_persona)) {

                            cuentas = personas[i].getCUENTAS_BANCARIAS();

                            System.out.println("Ahora dime el saldo de la cuenta bancaria");
                            saldo = in.nextDouble();
                            cuenta.setSALDO(saldo);
                            for (int j = 0; j < cuentas.length; j++) {
                                if (cuentas[j] == null) {
                                    cuentas[j] = cuenta;
                                    j = cuentas.length;
                                    i = personas.length;
                                    cuenta.setNUMERO_CUENTA(cuenta.getNUMERO_CUENTA() + 1);
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (personas[0] == null) {
                    System.out.println("No hay personas registradas todavía\n");
                } else {
                    System.out.println("Dime el DNI de la persona que quieres buscar");
                    nombre_persona = in.next();
                    for (int i = 0; i < cantidad; i++) {

                        if (personas[i].getDNI().equals(nombre_persona)) {
                            System.out.println("Aqui tienes las cuentas ");
                            cuentas = personas[i].getCUENTAS_BANCARIAS();
                            for (int j = 0; j < cuentas.length; j++) {
                                if (cuentas[j] != null) {
                                    System.out.println((j + 1) + ". cuenta: Num. Cuenta:" + cuentas[j].getNUMERO_CUENTA() + " y Saldo: " + cuentas[j].getSaldo());
                                } else {
                                    System.out.println((j + 1) + ". cuenta: Vacío");
                                }
                            }
                        } else {
                            System.out.println("No hay resultados que coincidan con la búsqueda");
                        }
                    }
                }
                break;
            case 4:
                if (personas[0] == null) {
                    System.out.println("No hay personas registradas todavía\n");
                } else {
                    System.out.println("Dime el DNI de la persona que quieres buscar");
                    nombre_persona = in.next();
                    System.out.println("Y dime el número de cuenta");
                    num_cuenta = in.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        cuentas = personas[i].getCUENTAS_BANCARIAS();
                        for (int j = 0; j < cuentas.length; j++) {
                            if (personas[i].getDNI().equals(nombre_persona) && cuentas[j].getNUMERO_CUENTA() == num_cuenta) {
                                System.out.println("Dime la nómina");
                                saldo = in.nextDouble();
                                cuenta2 = cuentas[j];
                                cuenta2.pagarRecibos(saldo);
                                cuentas[j] = cuenta2;
                            } else {
                                System.out.println("No hay resultados que coincidan con la búsqueda");
                            }
                        }
                    }
                }
                break;
            case 5:
                if (personas[0] == null) {
                    System.out.println("No hay personas registradas todavía\n");
                } else {
                    System.out.println("Dime el DNI de la persona que quieres buscar");
                    nombre_persona = in.next();
                    System.out.println("Y dime el número de cuenta");
                    num_cuenta = in.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        cuentas = personas[i].getCUENTAS_BANCARIAS();
                        for (int j = 0; j < cuentas.length; j++) {
                            if (personas[i].getDNI().equals(nombre_persona) && cuentas[j].getNUMERO_CUENTA() == num_cuenta) {
                                System.out.println("Dime el pago que ha recibido la persona");
                                saldo = in.nextDouble();
                                cuenta2 = cuentas[j];
                                cuenta2.pagarRecibos(saldo);
                                cuentas[j] = cuenta2;
                            } else {
                                System.out.println("No hay resultados que coincidan con la búsqueda");
                            }
                        }
                    }
                }
                break;
            case 6:
                if (personas[0] == null) {
                    System.out.println("No hay personas registradas todavía\n");
                } else {
                    System.out.println("Dime el DNI de la persona que quieres hacer transferencias entre cuentas");
                    nombre_persona = in.next();
                    System.out.println("Y dime el número de la cuenta que tranfiere dinero");
                    num_cuenta = in.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        cuentas = personas[i].getCUENTAS_BANCARIAS();
                        for (int j = 0; j < cuentas.length; j++) {
                            if (personas[i].getDNI().equals(nombre_persona) && cuentas[j].getNUMERO_CUENTA() == num_cuenta) {
                                System.out.println("Dime la cantidad a transferir");
                                saldo = in.nextDouble();

                                System.out.println("Y ahora dime el número de la cuenta a recibir la transferencia");
                                num_cuenta = in.nextInt();

                                for (int x = 0; x < cuentas.length; x++) {
                                    if (cuentas[x].getNUMERO_CUENTA() == num_cuenta && x != j) {
                                        cuenta2 = cuentas[j];
                                        cuenta2.setSALDO(cuenta2.getSaldo() - saldo);
                                        cuentas[j] = cuenta2;
                                        cuenta2 = cuentas[x];
                                        cuenta2.setSALDO(cuenta2.getSaldo() - saldo);
                                        cuentas[x] = cuenta2;
                                    } else if (x == j) {
                                        System.out.println("Lo sentimos, no se pueden hacer transferencias en la misma cuenta, no se cobrará nada");
                                    } else {
                                        System.out.println("No se encuentran las cuetas correspondientes");
                                    }
                                }
                            } else {
                                System.out.println("No hay resultados que coincidan con la búsqueda");
                            }
                        }
                    }
                }
                break;
            case 7:
                for (int i = 0; i < cantidad; i++) {

                    cuentas = personas[i].getCUENTAS_BANCARIAS();

                    for (int j = 0; j < personas[i].getCUENTAS_BANCARIAS().length; j++) {

                        saldo = cuentas[j].getSaldo();
                        moroso = personas[i].isMoroso(saldo);

                        if (moroso) {
                            System.out.println("La persona con el DNI \"" + personas[i].getDNI() + "\" es morosa");
                            j = personas[i].getCUENTAS_BANCARIAS().length;
                        } else if (cuentas[j + 1] == null) {
                            j = personas[i].getCUENTAS_BANCARIAS().length;
                        }
                    }
                    moroso = false;
                }
                break;
            case 8:
                salir = true;
                break;
            }
        }
    }
}
