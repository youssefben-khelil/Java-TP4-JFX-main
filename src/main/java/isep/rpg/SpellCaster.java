package isep.rpg;

public abstract class SpellCaster extends Hero {

    private int manaPoints;

    public void setManaPoints(int manaPoints){
        this.manaPoints=manaPoints;
    }
    public int getManaPoints(){
        return this.manaPoints;
    }

}
