package isep.rpg;

public class Warrior extends Hero {
    public Warrior() {
        this.setLifePoints(30);
        this.setArmor(20);
        this.setDamage(3);
        this.setEffect(1);
        this.setExp(0);
        this.setLvl(1);
        this.setArmorGrowth(5);
        this.setDamageGrowth(3);




    }
    @Override
    public boolean attack(Fighter enemy) {

        System.out.println("the hero attack");
        return enemy.receiveAttack(this.getDamage());
    }
}
