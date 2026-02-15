package Tema5.Excepciones;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Gato gato = new Gato();
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();
        gato.imprimir();
        gato2.imprimir();
        gato3.imprimir();
        System.out.print("Introduce una tecla para continuar: ");
        in.next();
        gato2.setEdad(-23);
        gato2.imprimir();
        System.out.print("Introduce una tecla para continuar: ");
        in.next();
        gato3.setNombre("ha");
        gato3.imprimir();
        System.out.print("Introduce una tecla para continuar: ");
        in.next();
        gato2.setEdad(10);
        gato2.setNombre("Bigotes");
        gato2.imprimir();
        System.out.print("Introduce una tecla para continuar: ");
        in.next();
        gato3.setEdad(7);
        gato3.setNombre("Matias");
        gato3.imprimir();
    }
}
