import game.GameCharacter;
import interfaces.MeleeAttacker;

class Warrior extends GameCharacter implements MeleeAttacker {
    private int damage;

    public Warrior(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }

    @Override
    public void meleeAttack(GameCharacter target) {
        System.out.println(name + " " + target.getName() + "'ya kılıcıyla vurdu" );
        target.takeDamage(damage);
    }
}