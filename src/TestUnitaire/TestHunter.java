package isep.TestUnitaire;

import isep.rpg.BasicEnemy;
import isep.rpg.Hunter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
//On lance le Test Unitaire pour voir si les flèches du Hunter fonctionne correctement//
public class TestHunter {

    @Test
    public void FlèchesUtilisé(){
        Hunter chasseur = new Hunter(); // On met notre chasseur//
        BasicEnemy enemy = new BasicEnemy(); // On Ajoute un ennemi pour qu'il se prenne une flèche ou deux en fonction de l'humeur du Hunter//

        int NombreDeFlèchesAvant = chasseur.getArrows();
        chasseur.attack(enemy); //On fait attaquer le Hunter
        int NombreDeFlècheAprès = chasseur.getArrows();
        assertTrue(NombreDeFlèchesAvant>NombreDeFlècheAprès ); //On vérifie la condition
        System.out.println("Comme on passe de "+NombreDeFlèchesAvant+" à "+NombreDeFlècheAprès+" Alors notre test Unitaire est bien vérifié");
    }
}
