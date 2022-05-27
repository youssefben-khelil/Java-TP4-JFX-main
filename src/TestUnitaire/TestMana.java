import isep.rpg.BasicEnemy;
import isep.rpg.Hunter;
import org.junit.jupiter.api.Test;
import isep.rpg.Mage;
import isep.rpg.Boss;

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
}
