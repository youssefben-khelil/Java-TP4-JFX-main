package isep.rpg;

public class Food implements Consumable {
    final private int healthRegen;
    public Food(int healthRegen){this.healthRegen=healthRegen;}

    @Override
    public int gainHealth() {
        return this.healthRegen;
    }

    @Override
    public int gainMana() {
        return 0;
    }
}
