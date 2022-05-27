package isep.rpg;

public class Boss extends Enemy {
    public Boss(){
        this.setLifePoints(100);
        this.setArmor(20);
        this.setDamage(3);
    }
    public Boss(int level){
        this.setLifePoints(30*level+30);
        this.setArmor(20*level+20);
        this.setDamage(3*level+3);
    }
    public boolean attack(Fighter hero) {
        return hero.receiveAttack(this.getDamage());
    }

}
