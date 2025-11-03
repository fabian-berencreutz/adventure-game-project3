package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.Utils;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.view.UI;

public class MazeRoom implements Room{
    @Override
    public void enterRoom(Player player, UI ui) {
        ui.showMessage("Du går in i en gigantisk labyrint med 5 meter höga väggar...");
        Utils.delay(2000);
        ui.showMessage("För att ta dig ut och hitta nyckeln måste du ta den rätta vägen.");
        Utils.delay(2000);

        boolean escaped = false;

        while (!escaped) {
            String choice = ui.getInput("Välj riktning: w=upp, a=vänster, s=ner, d=höger");
            switch (choice.toLowerCase()) {
                case "w":
                    ui.showMessage("Du går upp men stöter på en vägg!");
                    break;
                case "a":
                    ui.showMessage("Du går vänster och kommer fram till en återvändsgränd!");
                    break;
                case "s":
                    ui.showMessage("Du går ner, hittar utgången och en nyckel!");
                    Utils.delay(2000);
                    player.setFoundMazeKey(true);
                    player.addScore(50);
                    escaped = true;
                    break;
                case "d":
                    ui.showMessage("Du går höger men hamnar vid början av labyrinten igen.");
                    break;
                default:
                    ui.showMessage("Ogiltigt val.");
            }
        }

        ui.showMessage("Du lämnar labyrinten och återvänder till startrummet...");
        Utils.delay(2000);
    }
}
