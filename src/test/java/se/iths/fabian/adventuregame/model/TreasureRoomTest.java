package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.TreasureRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreasureRoomTest {

    @Test
    @DisplayName("hasOpenedChest() ska returnera true om player hasFoundKey() är true")
    void testEnterRoom() {
        FakeUI fakeUI = new FakeUI();
        TreasureRoom treasureRoom = new TreasureRoom();
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        player.setFoundKey(true);
        fakeUI.setInput("ja");

        treasureRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasOpenedChest());
    }
}
