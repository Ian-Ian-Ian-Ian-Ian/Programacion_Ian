import java.util.Random;
import java.util.Scanner;

public class Pruebiñas {
    public static void main(String[] args){

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int hola = random.nextInt(10) + 1;
            System.out.println(hola);
        }
    }
}
