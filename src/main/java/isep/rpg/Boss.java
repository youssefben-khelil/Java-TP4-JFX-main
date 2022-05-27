package isep.rpg;

public class Boss extends Enemy {
    public Boss(){
        this.setLifePoints(30);
        this.setArmor(20);
        this.setDamage(3);
    }
    public boolean attack(Fighter hero) {
        return hero.receiveAttack(this.getDamage());
    }

}
