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

public class TestVictoire {
@Test
    public void victoireTest()
{
    ArrayList<Hero> heroes = new ArrayList<Hero>();
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    heroes.add(new Hunter());
    enemies.add(new BasicEnemy());
    enemies.add(new BasicEnemy());
    while (enemies.size()>0){
        boolean killed = heroes.get(0).attack(enemies.get(0));
        if (killed) {
            enemies.remove(0);
        }
    }
    System.out.println("Les ennemis sont bien mort, on a donc une victoire ce qui confirme notre test");
    assertTrue(enemies.size()<=0);
}
}
