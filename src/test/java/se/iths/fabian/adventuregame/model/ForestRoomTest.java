package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.ForestRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.*;

public class ForestRoomTest {

    @Test
    @DisplayName("hasFoundKey() ska returnera true")
    void testEnterRoom() {
        ForestRoom forestRoom = new ForestRoom();
        FakeUI fakeUI = new FakeUI();
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        fakeUI.setInput("ja");

        forestRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasFoundKey());
    }
}
