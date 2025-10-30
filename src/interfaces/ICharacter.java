package interfaces;

public interface ICharacter {
    String getName();
    int getHealth();
    void takeDamage(int amount);
    void receiveHealth(int amount);
}