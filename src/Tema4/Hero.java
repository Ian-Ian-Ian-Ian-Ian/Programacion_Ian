package Tema4;

import java.util.Random;

public class Hero {
    //Level y Experience estan en private porque level siempre comienza en 1 y experience en 0

    private String name;
    private int level;
    private int health;
    private int maxHealth;
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
    private final int POTION_HEAL = 10;
    private final int REST_HEAL = 50;
    private final int REQUIRED_EXPERIENCE = 50;
    private final int EXPERIENCE_RECIEVED = 10;

    //Constructores
    public Hero () {
        name = DEFAULT_NAME;
        level = DEFAULT_LEVEL;
        health = DEFAULT_HEALTH;
        maxHealth = DEFAULT_MAX_HEALTH;
        experience = DEFAULT_EXPERIENCE;
        attack = DEFAULT_ATTACK;
        defense = DEFAULT_DEFENSE;
    }

    public Hero (String name, int health, int maxHealth, int attack, int defense) {
        this.name = name;
        level = DEFAULT_LEVEL;
        this.health = health;
        this.maxHealth = maxHealth;
        experience = DEFAULT_EXPERIENCE;
        this.attack = attack;
        this.defense = defense;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getExperience() {
        return experience;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setHealth(int health) {
        if (health <= maxHealth) {
            this.health = health;
        }
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    //Metodo toString modificado
    public String toString() {
        return "Características del héroe \"" + name + "\" \n" +
        "----------------------------------- \n" +
        "Nivel:          " + level +
        "\nExperiencia:    " + experience +
        "\nSalud:          " + health +
        "\nSalud Máxima:   " + maxHealth +
        "\nAtaque:         " + attack +
        "\nDefensa:        " + defense + "\n";
    }

    //Metodos de batalla
    public void drinkPotion() {
        health = health + POTION_HEAL;
        if (health > maxHealth) {
            System.out.println("Se ha alcanzado la salud máxima");
            health = maxHealth;
        }
    }

    public void rest() {
        health = health + REST_HEAL;
        if (health > maxHealth) {
            System.out.println("Se ha alcanzado la salud máxima");
            health = maxHealth;
        }
    }

    public void levelUp() {
        if (experience >= REQUIRED_EXPERIENCE) {
            experience = experience - REQUIRED_EXPERIENCE;
            level++;

            health = health + 5;
            maxHealth = maxHealth + 5;
            attack++;
            defense++;
        }
    }

    public void attack(Hero rival) {
        Random random = new Random();
        int dano = (random.nextInt(9) + 1) + (attack - rival.defense);
        rival.health = rival.health - dano;

        experience = experience + EXPERIENCE_RECIEVED;
    }
}
