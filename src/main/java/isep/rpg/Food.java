package isep.rpg;

public class Food implements Consumable {
    private int healthRegen;
    public Food(int healthRegen){this.healthRegen=healthRegen;}

    public int getHealthRegen() {
        return healthRegen;
    }
}
