package isep.rpg;

public abstract class SpellCaster extends Hero {

    private int manaPoints;

    public void setManaPoints(int manaPoints){
        this.manaPoints=manaPoints;
    }
    public int getManaPoints(){
        return this.manaPoints;
    }
    public void receiveMana(float mana){
        this.manaPoints+=mana;
    }


    public void useFood(Potion  pot) {
        float heal = pot.gainHealth()*this.getEffect();
        this.healsPotion(heal);

        float mana = pot.gainMana()*this.getEffect();
        this.receiveMana(mana);
    }

}
