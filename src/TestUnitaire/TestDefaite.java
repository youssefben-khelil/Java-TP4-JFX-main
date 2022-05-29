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
public class TestDefaite {
    @Test
    public void DefaiteTest(){
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        heroes.add(new Warrior());
        heroes.add(new Hunter());
        enemies.add(new BasicEnemy());
        while (heroes.size()>0){
            boolean killed = enemies.get(0).attack(heroes.get(0));
            if (killed) {
                heroes.remove(0);
            }
        }
        System.out.println("Les héros sont bien mort, ca confirme notre test");
        assertTrue(heroes.size()<=0);
    }

}
