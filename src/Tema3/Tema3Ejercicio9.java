package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {

    public static void makeTriangle(char caracter, int fila) {
        String triangulo = "";
        int espacio = 0;
        int repeticion = 0;
        while (fila > 0) {
            espacio = fila - 1;
            while (espacio > 0){
                triangulo = triangulo + " ";
                espacio--;
            }
            espacio = fila - (fila - 1) + repeticion;
            while (espacio > 0){
                triangulo = triangulo + caracter;
                espacio--;
            }
            System.out.println(triangulo);
            fila--;
            triangulo = "";
            repeticion = repeticion + 2;
        }
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dime el carácter que quieras (Aunque pongas varios caracteres solo se leerá el primero)");
        char caracter = in.next().charAt(0);

        System.out.println("Ahora dime el número de filas que quieres que tenga el triángulo");
        int filas = in.nextInt();

        makeTriangle(caracter, filas);
    }
}
