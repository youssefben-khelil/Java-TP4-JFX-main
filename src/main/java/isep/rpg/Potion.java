package isep.rpg;

public class Potion implements Consumable {
    private int manaRegen;
    public Potion(int manaRegen){this.manaRegen=manaRegen;}

    public int getManaRegen() {
        return manaRegen;
    }
}
