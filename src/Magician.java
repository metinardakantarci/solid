import game.GameCharacter;
import interfaces.MagicAttacker;

class Magician extends GameCharacter implements MagicAttacker {
    private int spellDamage;

    public Magician(String name, int health, int spellDamage) {
        super(name, health);
        this.spellDamage = spellDamage;
    }

    @Override
    public void castSpell(GameCharacter target) {
        System.out.println(name + " " + target.getName()+ "'ya ateş topu fırlattı" );
        target.takeDamage(spellDamage);
    }
}