
import isep.rpg.Hunter;
import isep.rpg.Mage;
import isep.rpg.Boss;
import org.junit.jupiter.api.Test;
import isep.rpg.Fighter;

import static org.junit.jupiter.api.Assertions.assertTrue;
//On lance le test unitaire pour voir si les HP sont bien aux normes//

public class TestPV {
    @Test
    public void TestHP() {
        Hunter Chasseur = new Hunter();
        System.out.println("Point de vie : "+ Chasseur.getLifePoints());
        boolean Kill = Chasseur.receiveAttack(Chasseur.getLifePoints()+ Chasseur.getArmor());
        System.out.println("Dégâts mortel");
        assertTrue(Chasseur.Dead());
        System.out.println("LA MORT");
        assertTrue(Chasseur.Dead());

    }

}