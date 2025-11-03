package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.CaveRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaveRoomTest {

    private FakeUI fakeUI;
    private CaveRoom caveRoom;
    private Player player;

    @BeforeEach
    void setUp() {
        fakeUI = new FakeUI();
        caveRoom = new CaveRoom();
        player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();
    }

    @Test
    @DisplayName("hasAutoWin() ska returnera true")
    void testEnterRoom() {

        fakeUI.setInput("6");

        caveRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasAutoWin());
    }
}
