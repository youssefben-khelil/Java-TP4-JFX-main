package isep.rpg;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter {

    //attributs
    private float lifePoints; // Point de vie du fighter
    private int armor;  // Armure du fighter
    private float damage; //dégat du fighter
    private int effect; //l’efficacité de la potion et de la nourriture
    private int exp; // Experience
    private int lvl;
    private  List<Potion> potions = new ArrayList<>();
    private List<Food> foods = new ArrayList<>();

    // get and set methods
    public float getLifePoints() { return lifePoints; }
    public void setLifePoints(int lifePoints) { this.lifePoints = lifePoints; }
    public void setArmor(int armor){this.armor=armor;}
    public void setDamage(float damage){this.damage=damage;}
    public float getDamage(){return damage;}
    public int getArmor(){return armor;}
    public void setEffect(int effect){this.effect=effect;}
    public int getEffect(){return this.effect;}
    public void setExp(int exp){this.exp=exp;}
    public int getExp(){return this.exp;}
    public void setLvl(int lvl){this.lvl=lvl;}
    public int getLvl(){return this.lvl;}


    //Other methods

    //    method attack
    public boolean attack(Fighter fighter) {return false; }
    //method Heal
    public boolean heals(Fighter Hero){return false;}
    //method recieve attack
    public boolean receiveAttack(float lifePoints) {
        this.lifePoints = (this.lifePoints - ((lifePoints)*(100.0f/(100.0f+this.getArmor()))));
        return this.lifePoints <= 0; // Vrai si le combattant est mort
    }
    //method recieve heal
    public  boolean receiveHealing(int heal){
        this.lifePoints+=heal;
        return this.lifePoints <= 0; // Vrai si le combattant est mort
    }
    //method utiliser un consommable
    public void useConsumable(Consumable consumable) {

    }

}
