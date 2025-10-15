package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args) {

        int total = 0;
        int num1 = 1;
        while(num1 <= 1000) {
            if (num1%2 == 0) {
                total = total + num1;
                System.out.println(total);
            }
            num1++;
        }
    }
}

