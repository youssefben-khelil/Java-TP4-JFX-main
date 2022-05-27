package isep.rpg;

public class Hunter extends Hero {

    private int arrows;
    public Hunter(){
        this.setLifePoints(2);
        this.arrows=30;
        this.setArmor(1);
        this.setDamage(5);
    }

    public int getArrows() {
        return arrows;
    }

    public boolean attack(Fighter enemy) {
        if(this.getArrows()>0){
            this.arrows--;
            return enemy.receiveAttack(this.getDamage());
        }
        else{
            return enemy.receiveAttack(0);
        }
    }



}
