package isep.rpg;

public class Mage extends SpellCaster {
    public Mage() {
        this.setLifePoints(1);
        this.setManaPoints(20);
        this.setArmor(5);
        this.setDamage(3);
        this.setEffect(1);
        this.setExp(0);
        this.setLvl(1);
        this.setArmorGrowth(2);
        this.setDamageGrowth(5);


    }
    public boolean attack(Fighter enemy) {
        if(this.getManaPoints()>0){
            this.setManaPoints(this.getManaPoints()-1);
            return enemy.receiveAttack(this.getDamage());
        } else{
            return enemy.receiveAttack(0);
        }

    }
}
