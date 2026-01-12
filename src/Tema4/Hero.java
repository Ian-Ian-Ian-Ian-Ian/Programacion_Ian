package Tema4;

public class Hero {
    //Level y Experience estan en private porque level siempre comienza en 1 y experience en 0

    private String name;
    private int level;
    private int health;
    private int MAX_HEALTH;
    private int experience;
    private int attack;
    private int defense;
    //Características predeterminadas
    private final String DEFAULT_NAME = "Heroe";
    private final int DEFAULT_LEVEL = 1;
    private final int DEFAULT_HEALTH = 250;
    private final int DEFAULT_MAX_HEALTH = 250;
    private final int DEFAULT_EXPERIENCE = 0;
    private final int DEFAULT_ATTACK = 5;
    private final int DEFAULT_DEFENSE = 2;

    public Hero () {
        name = DEFAULT_NAME;
        level = DEFAULT_LEVEL;
        health = DEFAULT_HEALTH;
        MAX_HEALTH = DEFAULT_MAX_HEALTH;
        experience = DEFAULT_EXPERIENCE;
        attack = DEFAULT_ATTACK;
        defense = DEFAULT_DEFENSE;
    }

    public Hero (String name, int health, int MAX_HEALTH, int attack, int defense) {
        this.name = name;
        level = DEFAULT_LEVEL;
        this.health = health;
        this.MAX_HEALTH = MAX_HEALTH;
        experience = DEFAULT_EXPERIENCE;
        this.attack = attack;
        this.defense = defense;
    }

    public void drinkPotion() {
        health = health + 10;
        if (health > MAX_HEALTH) {
            System.out.println("");
        }
    }
}
