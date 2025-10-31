package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.view.UI;

public interface Room {
    void enterRoom(Player player, UI ui);
}

