package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.Utils;
import se.iths.fabian.adventuregame.model.characters.Death;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.view.UI;

public class CandyRoom implements Room{
    @Override
    public void enterRoom(Player player, UI ui) {
        ui.showMessage("Du kliver in i ett rum fyllt av godis...");
        Utils.delay(2000);
        ui.showMessage("Plötsligt känner du en iskall närvaro bakom dig...");
        Utils.delay(2000);

        Death death = new Death("Döden", 100, 0, 9999);

        ui.showMessage(death.getName() + " står framför dig!");
        Utils.delay(2000);

        player.setHealth(0);
    }
}
