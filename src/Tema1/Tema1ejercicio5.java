package Tema1;

public class Tema1ejercicio5 {
    public static void main(String[] args) {

        //num1 es para numeros
        double num1 = 24 % 5;
        System.out.println("1. 24 % 5 = " + num1);

        num1 = 7 / 2 + 2.5;
        System.out.println("2. 7 / 2 + 2.5 = " + num1);

        num1 = 10.8 / 2 + 2;
        System.out.println("3. 10.8 / 2 + 2 " + num1);

        num1 = (4 + 6) * 3 + 2 * (5 -1);
        System.out.println("4. (4 + 6) * 3 + 2 * (5 - 1) = " + num1);

        num1 = 5 / 2 + 17 % 3;
        System.out.println("5. 5 / 2 + 17 % 3 = " + num1);

        //num2 es para Verdadero/Falso
        boolean num2 = 7 >= 5 || 27 != 8;
        System.out.println("6. 7 >= 5 || 27 != 8 = " + num2);

        num2 = (45 <= 7) || !(5 >= 7);
        System.out.println("7. (45 <= 7) || !(5 >= 7) = " + num2);

        num1 = 27 % 4 + 15 / 4;
        System.out.println("8. 27 % 4 + 15 / 4 = " + num1);

        num1 = 37 / 4 * 4 - 2;
        System.out.println("9. 37 / 4 * 4 - 2 = " + num1);

        num2 = (25 >= 7) && !(7 <= 2);
        System.out.println("10. (25 >= 7) && !(7 <= 2) = " + num2);

        num2 = ('H' < 'J') && (9 != 7);
        System.out.println("11. ('H' < 'J') && (9 != 7) = " + num2);

        num2 = 25 > 20 && 13 > 5;
        System.out.println("12. 25 > 20 && 13 > 5 = " + num2);

        num2 = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2;
        System.out.println("13. 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2 = " + num2);

        num2 = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println("14. 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1 = " + num2);

        num2 = 10 <= 2 * 5 && 3 < 4 || !(8>7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("15. 10 <= 2 * 5 && 3 < 4 || !(8>7) && 3 * 2 <= 4 * 2 - 1 = " + num2);
    }
}
