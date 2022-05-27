package isep.rpg;

public class Potion implements Consumable {
    final private int manaRegen;
    final private int healthRegen;

    public Potion(int manaRegen,int healthRegen){this.manaRegen=manaRegen;this.healthRegen=healthRegen;}


    @Override
    public int gainHealth() {
        return this.healthRegen;
    }

    @Override
    public int gainMana() {
        return this.manaRegen;
    }
}
