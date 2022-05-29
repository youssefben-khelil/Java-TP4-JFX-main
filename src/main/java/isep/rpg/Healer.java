package isep.rpg;

public class Healer extends SpellCaster {
    private int heal;
    public void setHeal(int heal){this.heal=heal;}
    public int getHeal(){return this.heal;}
    public Healer() {
        this.setLifePoints(10);
        this.setManaPoints(20);
        this.setArmor(1);
        this.setDamage(1);
        this.setHeal(2);
        this.setEffect(1);
        this.setExp(0);
        this.setLvl(1);
        this.setArmorGrowth(2);
        this.setDamageGrowth(1);




    }
    public boolean heals(Fighter Hero) {
        if(this.getManaPoints()>0){
            this.setManaPoints(this.getManaPoints()-1);
            System.out.println("the healer healed");
            return Hero.receiveHealing(this.getHeal());
        }   else{
          return Hero.receiveHealing(0);
        }

    }
    public boolean attack(Fighter hero) {
        return hero.receiveAttack(this.getDamage());
    }

}