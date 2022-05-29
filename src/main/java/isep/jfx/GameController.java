package isep.jfx;

import isep.rpg.Enemy;
import isep.rpg.Game;
import isep.rpg.Hero;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class GameController {

    @FXML
    ListView<String> heroList;
    @FXML
    ListView<String> enemyList;
    @FXML
    Button fightButton;
    @FXML
    Button ConsumableButton;
    @FXML
    Button DmgButton;
    @FXML
    Button EffectButton;
    @FXML
    Button ArmorButton;

    // "initialize()" est appelé par JavaFX à l'affichage de la fenêtre
    @FXML
    public void initialize() {
        Game.playGame();
        updateListViews();
        updateFightButton();
    }

    private void updateListViews() {
        heroList.getItems().setAll(Game.context.getHeroesStatus());
        enemyList.getItems().setAll(Game.context.getEnemiesStatus());
    }

    // L'action du bouton change en fonction de l'état du jeu
    private void updateFightButton() {
        switch (Game.context.status) {
            case START_COMBAT:
                fightButton.setText("Lancer le combat !");
                fightButton.setOnAction( event -> {
                    updateListViews();
                    Game.context.startNextFighterTurn();
                    updateFightButton();
                    } );
                break;
            case HERO_TURN:
                fightButton.setText("Attaque du héro...");
                fightButton.setOnAction( event -> {
                    Game.context.startHeroTurn();
                    if(Game.context.CheckLvlWin()==true){


                        Game.context.gainExp();
                    }

                    ConsumableButton.setOnAction( event2 -> {
                        updateListViews();
                        Game.context.consume();
                    } );

                    updateListViews();
                    Game.context.startNextFighterTurn();
                    if(Game.context.CheckLvlWin()==true){
                        Game.context.gainExp();
                    }
                    updateFightButton();
                    } );
                    DmgButton.setOnAction( event11 -> {
                        System.out.println("dmg lets gogogogogogog");
                        updateListViews();
                        Game.context.lvlup(1);
                    });
                        ArmorButton.setOnAction( event12 -> {
                            System.out.println("armorrrrr lets gogogogogogog");
                            updateListViews();
                            Game.context.lvlup(2);
                        });

                        EffectButton.setOnAction(event13 -> {
                            System.out.println("idk lets gogogogogogog");
                            updateListViews();
                            Game.context.lvlup(3);
                        });


                break;
            case ENEMY_TURN:
                fightButton.setText("Attaque de l'ennemi...");
                fightButton.setOnAction( event -> {
                    Game.context.startEnemyTurn();
                    if(Game.context.CheckLvlWin()==true){
                        Game.context.gainExp();
                    }
                    updateListViews();
                    Game.context.startNextFighterTurn();
                    if(Game.context.CheckLvlWin()==true){
                        Game.context.gainExp();
                    }
                    updateFightButton();
                    } );
                break;
            case END_GAME:
                fightButton.setDisable(true);
                fightButton.setText("Oh non, vous avez perdu :'(");
                break;
        }
    }


}
