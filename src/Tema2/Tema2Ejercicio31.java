package Tema2;

public class Tema2Ejercicio31 {
    public static void main(String[] args) {

        int num = 1;
        int divisor = num;
        int resto = 0;
        boolean primo = false;
        int total = 0;
        int totalR = 0;

        while (total < 20) {
            divisor = num;
            totalR = 0;
            while (divisor > 0) {
                resto = num%divisor ;
                if (divisor == num){
                    divisor = (num / 2) + 1;
                }
                divisor--;
                if (resto == 0) {
                    totalR++;
                }
            }

            primo = totalR <= 2;
            if (primo == true) {
                System.out.println(num);
                total++;
            }
            num++;
        }
    }
}
