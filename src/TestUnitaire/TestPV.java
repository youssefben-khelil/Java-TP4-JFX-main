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
//On lance le test unitaire pour voir si les HP sont bien aux normes//

public class TestPV {
    @Test
    public void TestHP() {
        Warrior Chasseur = new Warrior();
        System.out.println("Point de vie : "+ Chasseur.getLifePoints());
        boolean Kill = Chasseur.receiveAttack(Chasseur.getLifePoints()+ Chasseur.getArmor());
        System.out.println("Dégâts mortel");
        assertTrue(Chasseur.Dead());
        System.out.println("LA MORT");
        assertTrue(Chasseur.Dead());

    }

}