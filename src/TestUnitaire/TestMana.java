package isep.TestUnitaire;

import isep.rpg.BasicEnemy;
import isep.rpg.Boss;
import isep.rpg.Consumable;
import isep.rpg.Enemy;
import isep.rpg.Fighter;
import isep.rpg.Food;
import isep.rpg.Game;
import isep.rpg.Healer;
import isep.rpg.Hero;
import isep.rpg.Hunter;
import isep.rpg.Mage;
import isep.rpg.Potion;
import isep.rpg.SpellCaster;
import isep.rpg.Warrior;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestMana
{
    @Test
    public void MageAttack(){
        Mage mage = new Mage();
        BasicEnemy enemy = new BasicEnemy();
        int ManaAvant = mage.getManaPoints();
        mage.attack(enemy);
        int ManaAprès = mage.getManaPoints();
        assertTrue(ManaAvant>ManaAprès);
        System.out.println("Comme on passe de : "+ManaAvant+" à "+ManaAprès+" Alors notre test unitaire est bien vérifié");
    }

    @Test
    public void MageConsomme(){
        Mage mage = new Mage();
        BasicEnemy enemy = new BasicEnemy();
        while (mage.getManaPoints()>0){
            if (mage.getManaPoints()>0){
                assertTrue(mage.getManaPoints()>0);
                mage.attack(enemy);
            } else {
                assertTrue(mage.getManaPoints()<=0);
                System.out.println("Comme il n'y a plus assez de mana, le test est vérifié");
            }
        }
    }
}