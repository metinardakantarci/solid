import interfaces.ICharacter;
import interfaces.IHealable;

class Healer implements ICharacter, IHealable {
    private String name;
    private int health;
    private int healPower;
    private int medkit = 3;

    public Healer(String name, int initialHealth, int healPower) {
        this.name = name;
        this.health = initialHealth;
        this.healPower = healPower;
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
    public int getHealPower() {
        return this.healPower;
    }

    @Override
    public void heal(ICharacter target) {
        if (this.medkit > 0) {
            System.out.println(this.name + ", " + target.getName() + " karakterini " + this.healPower + " iyileştiriyor.");

            target.receiveHealth(this.healPower);

            this.medkit--;
            System.out.println(this.name + " karakterinin " + this.medkit + " medkiti kaldı.");
        } else {
            System.out.println(this.name + " karakterinin medkiti kalmadı! İyileştirme başarısız.");
        }
    }
}