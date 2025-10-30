import interfaces.IAttackable;
import interfaces.ICharacter;

class Warrior implements ICharacter, IAttackable {
    private String name;
    private int health;

    private int strength;
    private int attackPower;

    public Warrior(String name, int initialHealth, int attackPower, int strength) {
        this.name = name;
        this.health = initialHealth;
        this.attackPower = attackPower;
        this.strength = strength;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.println(this.name + " " + amount + " hasar aldı. Kalan can: " + this.health);
    }

    @Override
    public void receiveHealth(int amount) {
        this.health += amount;
        System.out.println(this.name + " " + amount + " can kazandı. Yeni can: " + this.health);
    }

    @Override
    public void attack(ICharacter target) {

        if (strength <= 0) {
            System.out.println(this.name + " karakterinin gücü kalmadı!");
            return;
        }

        System.out.println(this.name + ", " + target.getName() + " karakterine kılıçla saldırdı!");
        target.takeDamage(this.attackPower);

        strength--;

        if (this.strength == 0) {
            System.out.println(this.name + " karakterinin gücü bitti!");
        } else {
            System.out.println(this.name + " karakterinin " + strength + " gücü kaldı.");
        }
    }
}