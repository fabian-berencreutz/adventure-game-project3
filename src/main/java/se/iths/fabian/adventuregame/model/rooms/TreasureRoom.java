package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.view.UI;

public class TreasureRoom implements Room {

    @Override
    public void enterRoom(Player player, UI ui) {
        ui.showMessage("Du hittar en skattkista. Den verkar låst...");

        String choice = ui.getInput("Vill du försöka öppna kistan? (ja/nej)");
        if (choice.equalsIgnoreCase("ja")) {

            if (player.hasFoundKey() && player.hasFoundMazeKey()) {
                ui.showMessage("Du öppnar kistan med båda nycklarna!");
                player.setOpenedChest(true);
                player.addScore(100);
            } else if (!player.hasFoundKey() && !player.hasFoundMazeKey()) {
                ui.showMessage("Kistan är låst. Du saknar båda nycklarna.");
            } else if (!player.hasFoundKey()) {
                ui.showMessage("Kistan är låst. Du saknar nyckeln från skogen.");
            } else {
                ui.showMessage("Kistan är låst. Du saknar nyckeln från labyrinten.");
            }
        } else {
            ui.showMessage("Du lämnar kistan orörd.");
        }
    }
}
