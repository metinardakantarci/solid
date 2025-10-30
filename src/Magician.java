import interfaces.IAttackable;
import interfaces.ICharacter;

class Magician implements ICharacter, IAttackable {
    private String name;
    private int health;
    private int spellPower;
    private int mana = 10;

    public Magician(String name, int initialHealth, int spellPower) {
        this.name = name;
        this.health = initialHealth;
        this.spellPower = spellPower;
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
        if (mana <= 0) {
            System.out.println(this.name + " karakterinin manası kalmadı!");
            return;
        }

        System.out.println(this.name + ", " + target.getName() + " karakterine büyü fırlattı!");
        target.takeDamage(this.spellPower);

        mana--;

        if (this.mana == 0) {
            System.out.println(this.name + " karakterinin manası bitti!");
        } else {
            System.out.println(this.name + " karakterinin " + mana + " manası kaldı.");
        }
    }
}