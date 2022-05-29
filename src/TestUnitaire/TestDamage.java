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

public class TestDamage {
    @Test
    public void damageTest(){
        Warrior guerrier = new Warrior();
        BasicEnemy enemy = new BasicEnemy();
        System.out.println("Attaque du Chasseur : "+guerrier.setDamage());
        System.out.println("L'Armure de l'ennemi : "+enemy.getArmor());
        System.out.println("Dégâts : "+(guerrier.setDamage()-enemy.getArmor()));
        int oldEnemyLifePoint = (int) enemy.getLifePoints();
        guerrier.attack(enemy);
        int newEnemyLifePoint = (int) enemy.getLifePoints();
        System.out.println("Dégâts infligés réels : "+(oldEnemyLifePoint-newEnemyLifePoint));
        assertTrue((guerrier.setDamage()-enemy.getArmor())==(oldEnemyLifePoint-newEnemyLifePoint));
    }
}
