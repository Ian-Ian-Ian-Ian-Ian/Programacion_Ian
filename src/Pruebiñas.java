import java.util.Random;

public class Pruebiñas {
    public static void main(String[] args){
        Random random = new Random();
        int dano = 100;
        int defensa = 200;
        dano = (dano * 5) / defensa;
        dano = dano + random.nextInt(10);
        System.out.println(dano);
        dano = 50 - (50 * 25 / 100);
        System.out.println(dano);
    }
}
