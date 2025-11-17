package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio10 {

    public static int selectProgram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecciona el programa que quieras realizar\n" +
                "-----------------------------------------------------------\n" +
                "1. Muestra el signo de un número introducido por el usuario\n" +
                "2. Indica si el usuario es mayor de edad o no\n" +
                "3. Calcula el área y perímetro de un círculo\n" +
                "4. Conversor de euros a dólares y de dólares a euros\n" +
                "5. Mostrar tabla de multiplicar de un número\n" +
                "6. Mostrar tablas de multiplicar del 1 al 10\n" +
                "7. Comprobador de números primos\n" +
                "8. Comprobador de fechas\n" +
                "9. Dibujar triángulos");
        int programa = in.nextInt();

        while (programa < 1 && programa > 9) {
            System.out.println("Selecciona un programa disponilble");
            programa = in.nextInt();
        }

        return programa;
    }

    public static void main(String[] args){

        int programa = selectProgram();
        int numero = 0;

        Scanner in = new Scanner(System.in);

        switch (programa) {
            case 1:
                System.out.println("Dime un número entero");
                numero = in.nextInt();
                numero = Tema3Ejercicio1.numberSign(numero);

                switch (numero) {
                    case -1:
                        if (numero == -1) {
                            System.out.println("El número es negativo");
                        }
                    case 0:
                        if (numero == 0) {
                            System.out.println("El número es 0");
                        }
                    case 1:
                        if (numero == 1) {
                            System.out.println("El número es positivo");
                        }
                }
                break;
            case 2:
                System.out.println("Dime un número entero");
                numero = in.nextInt();
                numero = Tema3Ejercicio1.numberSign(numero);

                switch (numero) {
                    case -1:
                        if (numero == -1) {
                            System.out.println("El número es negativo");
                        }
                    case 0:
                        if (numero == 0) {
                            System.out.println("El número es 0");
                        }
                    case 1:
                        if (numero == 1) {
                            System.out.println("El número es positivo");
                        }
                }

                System.out.println();
                System.out.println("Dime tu edad");
                int edad = in.nextInt();

                    while (edad < 0) {
                        System.out.println("Dame una edad real");
                        edad = in.nextInt();
                    }

                boolean adulto = Tema3Ejercicio2.isAdult(edad);

                if (adulto){
                    System.out.println("Eres mayor de edad");
                } else {
                    System.out.println("Eres menor de edad");
                }
                break;
            case 3:
                System.out.println("Dame un radio válido");
                double radio = in.nextInt();

                boolean valido = Tema3Ejercicio3.validRadius(radio);



                    while (!valido) {
                        System.out.println("Eso no es un radio válido, vuelve a introducirlo ");
                        radio = in.nextInt();
                        valido = Tema3Ejercicio3.validRadius(radio);
                    }


                double perimetro = Tema3Ejercicio3.calculateCirclePerimeter(radio);
                double area = Tema3Ejercicio3.calculateCircleArea(radio);

                System.out.println("El perímetro es: " + perimetro);
                System.out.println("El área es: " + area);
                break;
            case 4:
                Tema3Ejercicio4.showMenu();
                int accion = in.nextInt();


                    while (accion < 1 && accion > 2) {
                        System.out.println("Por favor, selecciona una opción correcta");
                        accion = in.nextInt();
                    }


                System.out.println("Dime la cantidad que quieres cambiar");
                double dinero = in.nextDouble();

                switch (accion){
                    case 1:
                        if (accion == 1) {
                            double euros = Tema3Ejercicio4.dollar2euro(dinero);
                            System.out.println(dinero + "$ en euros son " + euros + "€");
                        }

                    case 2:
                        if (accion == 2) {
                            double dolares = Tema3Ejercicio4.euro2dollar(dinero);
                            System.out.println(dinero + "€ en dolares son " + dolares + "$");
                        }
                }
                break;
            case 5:
                System.out.println("Dime un número del 1 al 10 para mostrar su tabla");
                numero = in.nextInt();


                    while (numero < 1 && numero > 10){
                        System.out.println("Dime un número del 1 al 10 he dicho");
                        numero = in.nextInt();
                    }

                Tema3Ejercicio5.numberTable(numero);
                break;
            case 6:
                for (numero = 1; numero < 11; numero++) {
                    Tema3Ejercicio5.numberTable(numero);
                }
                break;
            case 7:
                System.out.println("Dime números positivos y cuando quieras acabar pon 0");
                numero = in.nextInt();

                if (numero > 0) {
                    while (numero > 0) {
                        Tema3Ejercicio7.primeNumber(numero);
                        numero = in.nextInt();
                    }
                } else if (numero < 0) {
                    while (numero < 0){
                        System.out.println("Numero positivo he dicho");
                        numero = in.nextInt();
                    }
                    while (numero > 0) {
                        Tema3Ejercicio7.primeNumber(numero);
                        numero = in.nextInt();
                        while (numero < 0) {
                            System.out.println("Numero positivo he dicho");
                            numero = in.nextInt();
                        }
                    }
                }
                System.out.println("¡Adios!");
                break;
            case 8:
                System.out.println("Dime un día de un mes (1-31)");
                int dia = in.nextInt();

                while (dia < 1 && dia > 31) {
                    System.out.println("He dicho dime un día de un mes (1-31)");
                    dia = in.nextInt();
                }


                System.out.println("Dime un mes del año (1-12)");
                int mes = in.nextInt();
                while (mes < 1 && mes > 31) {
                    System.out.println("He dicho dime un mes del año (1-12)");
                    mes = in.nextInt();
                }
                System.out.println("Dime un año");
                int ano = in.nextInt();

                Tema3Ejercicio8.correctDate(dia, mes, ano);
                break;
            case 9:
                System.out.println("Dime el carácter que quieras (Aunque pongas varios caracteres solo se leerá el primero)");
                char caracter = in.next().charAt(0);

                System.out.println("Ahora dime el número de filas que quieres que tenga el triángulo");
                int filas = in.nextInt();

                Tema3Ejercicio9.makeTriangle(caracter, filas);
                break;
        }
    }
}
