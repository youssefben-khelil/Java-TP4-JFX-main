package isep.rpg;

public abstract class SpellCaster extends Hero {

    private int manaPoints;

    public void setManaPoints(int manaPoints){
        this.manaPoints=manaPoints;
    }
    public int getManaPoints(){
        return this.manaPoints;
    }
    public void receiveMana(int mana){
        this.manaPoints+=mana;
    }


    public void useFood(Potion  pot) {
        int heal = pot.gainHealth()*this.getEffect();
        this.healsPotion(heal);

        int mana = pot.gainMana()*this.getEffect();
        this.receiveMana(mana);
    }

}
