package isep.rpg;

public class BasicEnemy extends Enemy {
    public BasicEnemy() {
        this.setLifePoints(2);
        this.setArmor(1);
        this.setDamage(1);
    }
    @Override
    public boolean attack(Fighter hero) {
        return hero.receiveAttack(this.getDamage());
    }
}
