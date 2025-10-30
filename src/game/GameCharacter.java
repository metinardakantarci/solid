package game;

public class GameCharacter {
    public String name;
    public int health;


    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) health = 0;
        System.out.println(name + " " +  dmg + " hasar aldı (hp=" + health +")");
    }
}