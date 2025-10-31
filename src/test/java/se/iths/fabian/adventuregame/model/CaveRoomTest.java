package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.CaveRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaveRoomTest {

    @Test
    @DisplayName("hasAutoWin() ska returnera true")
    void testEnterRoom() {
        FakeUI fakeUI = new FakeUI();
        CaveRoom caveRoom = new CaveRoom();
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        fakeUI.setInput("6");

        caveRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasAutoWin());
    }
}
