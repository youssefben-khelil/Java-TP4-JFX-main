package isep.rpg;

public class Boss extends Enemy {
    public Boss(){
        this.setLifePoints(50);
        this.setArmor(20);
        this.setDamage(10);
    }
    public Boss(int level){
        this.setLifePoints(30*level+30);
        this.setArmor(20*level+20);
        this.setDamage(3*level+3);
    }
    public boolean attack(Fighter hero) {
        System.out.println("the boss attack");
        return hero.receiveAttack(this.getDamage());
    }

}
