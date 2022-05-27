package isep.rpg;

public class Warrior extends Hero {
    public Warrior() {
        this.setLifePoints(5);
        this.setArmor(1);
        this.setDamage(3);
    }
    @Override
    public boolean attack(Fighter enemy) {
        return enemy.receiveAttack(this.getDamage());
    }
}
