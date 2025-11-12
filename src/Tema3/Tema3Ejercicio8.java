package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {

    public static void correctDate(int dia, int mes, int ano){
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

            if (dia == 31){
                System.out.println("La fecha NO es correcta");
            } else {
                System.out.println("La fecha ES correcta");
            }

        } else if (mes == 2){

                if (ano % 400 == 0) {
                    if (ano % 100 == 0) {
                        if (dia > 28) {
                            System.out.println("La fecha NO es correta");
                        } else {
                            System.out.println("La fecha ES correcta");
                        }
                    } else {
                        if (ano % 4 == 0) {
                            if (dia > 29) {
                                System.out.println("La fecha NO es correta");
                            } else {
                                System.out.println("La fecha ES correcta");
                            }
                        } else {
                            if (dia > 28) {
                                System.out.println("La fecha NO es correta");
                            } else {
                                System.out.println("La fecha ES correcta");
                            }
                        }
                    }
                } else {
                    if (dia > 28) {
                        System.out.println("La fecha NO es correta");
                    } else {
                        System.out.println("La fecha ES correcta");
                    }
                }

        } else {
            System.out.println("La fecha es correcta");
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dime un día de un mes (1-31)");
        int dia = in.nextInt();
        if (dia < 0 && dia > 31){
            while (dia < 1 && dia > 31) {
                System.out.println("He dicho dime un día de un mes (1-31)");
                dia = in.nextInt();
            }
        }

        System.out.println("Dime un mes del año (1-12)");
        int mes = in.nextInt();
        if (mes < 0 && mes > 31){
            while (mes < 1 && mes > 31) {
                System.out.println("He dicho dime un mes del año (1-12)");
                mes = in.nextInt();
            }
        }
        System.out.println("Dime un año");
        int ano = in.nextInt();

        correctDate(dia, mes, ano);
    }
}
