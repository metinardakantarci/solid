import game.GameCharacter;
import interfaces.RangedAttacker;

class Archer extends GameCharacter implements RangedAttacker {
    private int arrowDamage;

    public Archer(String name, int health, int arrowDamage) {
        super(name, health);
        this.arrowDamage = arrowDamage;
    }

    @Override
    public void rangedAttack(GameCharacter target) {
        System.out.println(name + " " + target.getName() + "'ya ok fırlattı ");
        target.takeDamage(arrowDamage);
    }
}