package isep.rpg;

public class Mage extends SpellCaster {
    public Mage() {
        this.setLifePoints(1);
        this.setManaPoints(20);
        this.setArmor(2);
        this.setDamage(3);
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
