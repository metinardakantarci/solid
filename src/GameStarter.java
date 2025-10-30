import interfaces.IAttackable;
import interfaces.ICharacter;

public class GameStarter {
    public static void main(String[] args) {

        Healer taha = new Healer("Taha (Şifacı)", 100, 25);
        ICharacter mustafa = new Warrior("Mustafa (Savaşçı)", 150, 20, 5);
        ICharacter arda = new Archer("Arda (Okçu)", 110, 15, 10);
        ICharacter ilker = new Magician("İlker (Büyücü)", 90, 30);

        System.out.println(mustafa.getName() + " can: " + mustafa.getHealth());
        System.out.println(ilker.getName() + " can: " + ilker.getHealth());

        ((IAttackable) arda).attack(mustafa);
        ((IAttackable) ilker).attack(mustafa);

        System.out.println(mustafa.getName() + " durumu: " + mustafa.getHealth() + " canı kaldı.");

        taha.heal(mustafa);

        System.out.println(mustafa.getName() + " son durumu: " + mustafa.getHealth() + " canı oldu.");

        ((IAttackable) mustafa).attack(ilker);

        System.out.println(ilker.getName() + " durumu: " + ilker.getHealth() + " canı kaldı.");

        taha.heal(mustafa);
        taha.heal(mustafa);
        taha.heal(mustafa);

    }
}