package isep.rpg;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter {

    //attributs
    private float lifePoints; // Point de vie du fighter
    private int armor;  // Armure du fighter
    private int armorGrowth; // Growth for lvl ups
    private float damage; //dégat du fighter
    private float damageGrowth; // Growth for lvl ups
    private float effect; //l’efficacité de la potion et de la nourriture
    private int exp; // Experience
    private int lvl;
    protected  List<Potion> potions = new ArrayList<>();
    protected List<Food> foods = new ArrayList<>();


    // get and set methods
    public float getLifePoints() { return lifePoints; }
    public void setLifePoints(int lifePoints) { this.lifePoints = lifePoints; }
    public void setArmor(int armor){this.armor=armor;}
    public void setDamage(float damage){this.damage=damage;}
    public float getDamage(){return damage;}
    public int getArmor(){return armor;}
    public void setEffect(float effect){this.effect=effect;}
    public float getEffect(){return this.effect;}
    public void setExp(int exp){this.exp=exp;}
    public int getExp(){return this.exp;}
    public void setLvl(int lvl){this.lvl=lvl;}
    public int getLvl(){return this.lvl;}
    public void setArmorGrowth(int armorGrowth){this.armorGrowth=armorGrowth;}
    public void setDamageGrowth(float damageGrowth){this.damageGrowth=damageGrowth;}
    public void gainExp(int exp){this.exp=this.exp+exp;}


    public void defend(){

    }

    //Other methods

    //    method attack
    public boolean attack(Fighter fighter) {return false; }
    //method Heal
    public boolean heals(Fighter Hero){return false;}
    //method Heal from Potions
    public boolean healsPotion(float heal){
        return this.receiveHealing(heal);
    }
    //method recieve attack
    public boolean receiveAttack(float lifePoints) {
        this.lifePoints = (this.lifePoints - ((lifePoints)*(100.0f/(100.0f+this.getArmor()))));
        return this.lifePoints <= 0; // Vrai si le combattant est mort
    }
    //method recieve heal
    public  boolean receiveHealing(float heal){
        this.lifePoints+=heal;
        return this.lifePoints <= 0; // Vrai si le combattant est mort
    }
    //method utiliser un consommable
    public void useFood(Potion  pot) {
        int heal = pot.gainHealth();
        this.healsPotion(heal);

        //Les spell casters auront de la mana en plus.
        // Methode complete dans spellcaster
    }
    public void usePotion() {
        System.out.println("aya you got healed bish");
        float heal = 5*this.getEffect();
        this.healsPotion(heal);
    }

    public void lvlUp(int choice){
        switch(choice) {
            case 1: //Increase Dmg
                this.setDamage(this.getDamage()+this.damageGrowth);
                System.out.println("this hero has leveled up his damage");
                break;
            case 2: //Increase Armor
                this.setArmor(this.getArmor()+this.armorGrowth);
                System.out.println("this hero has leveled up his armor");
                break;
            case 3: //Increase Efficiency of potions and food
                this.setEffect((float) (this.getEffect()+0.1));
                System.out.println("this hero has leveled up his potion efficienty");
                break;
            case 4: // Get potions / food in inventory

                break;
            default:
                // nothing
                break;
        }
        this.setExp(0);
        this.setLvl(this.lvl+1);
    }

    public boolean levelUpCheck(){
        if(this.exp>this.lvl*10){
            System.out.println("this hero is going to level up");
            this.exp=this.exp-this.lvl*10;
            this.lvl=this.lvl+1;
            return true;
        }
        else{return false;}
    }

    public boolean Dead()
    {
        if (this.getLifePoints() <= 0)
        {
            return true;
        } else {
            return false;
        }
    }
}
