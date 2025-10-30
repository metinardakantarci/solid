import interfaces.IAttackable;
import interfaces.ICharacter;

class Archer implements ICharacter, IAttackable {
    private String name;
    private int health;

    private int arrowPower;
    private int currentArrow;

    public Archer(String name, int initialHealth, int arrowPower, int currentArrow) {
        this.name = name;
        this.health = initialHealth;
        this.arrowPower = arrowPower;
        this.currentArrow = currentArrow;
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
        if (currentArrow <= 0) {
            System.out.println(this.name + " karakterinin oku kalmadı!");
            return;
        }

        System.out.println(this.name + ", " + target.getName() + " karakterine ok fırlattı!");
        target.takeDamage(this.arrowPower);

        currentArrow--;

        if (this.currentArrow == 0) {
            System.out.println(this.name + " karakterinin oku bitti!");
        } else {
            System.out.println(this.name + " karakterinin " + currentArrow + " oku kaldı.");
        }
    }
}