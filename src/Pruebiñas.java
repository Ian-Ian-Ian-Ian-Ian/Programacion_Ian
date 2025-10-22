import java.util.Random;

public class Pruebiñas {
    public static void main(String[] args){
        Random random = new Random();
        int dano = 0;
        dano = dano + random.nextInt(10);
        System.out.println(dano);
    }
}
