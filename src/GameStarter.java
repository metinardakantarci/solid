public class GameStarter {
    public static void main(String[] args) {
        Warrior w = new Warrior("Mustafa", 40, 10);
        Archer a = new Archer("Arda", 30, 8);
        Magician m = new Magician("Taha", 25, 12);

        a.rangedAttack(w);
        w.meleeAttack(m);
        m.castSpell(a);

        System.out.println(w.getName() + " hp: " + w.getHealth());
        System.out.println(a.getName() + " hp: " + a.getHealth());
        System.out.println(m.getName() + " hp: " + m.getHealth());
    }
}