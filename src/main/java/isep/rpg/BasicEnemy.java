package isep.rpg;

public class BasicEnemy extends Enemy {
    public BasicEnemy() {
        this.setLifePoints(2);
        this.setArmor(1);
        this.setDamage(1);
    }
    public BasicEnemy(int level) {
        this.setLifePoints(2*level+2);
        this.setArmor(1*level+1);
        this.setDamage(1*level+1);
    }
    @Override
    public boolean attack(Fighter hero) {
        System.out.println("the enemy attack");
        return hero.receiveAttack(this.getDamage());
    }
}
