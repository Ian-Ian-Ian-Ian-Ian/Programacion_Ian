package Tema4;

public class MainHero {
    public static void main(String[] args) {
        Hero Caballero = new Hero();

        Hero Duende = new Hero("Duende",100,100,3,1);

        System.out.println(Caballero);
        System.out.println(Duende);

        Caballero.attack(Duende);
        Duende.attack(Caballero);

        System.out.println(Caballero);
        System.out.println(Duende);

        Duende.drinkPotion();
        Caballero.rest();

        System.out.println(Caballero);
        System.out.println(Duende);
    }
}
