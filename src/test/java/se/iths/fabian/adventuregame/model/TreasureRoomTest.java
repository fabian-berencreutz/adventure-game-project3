package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.TreasureRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreasureRoomTest {

    private FakeUI fakeUI;
    private TreasureRoom treasureRoom;
    private Player player;

    @BeforeEach
    void setUp() {
        fakeUI = new FakeUI();
        treasureRoom = new TreasureRoom();
        player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();
    }

    @Test
    @DisplayName("hasOpenedChest() ska returnera true om man hittat båda nycklarna.")
    void testEnterRoom() {

        player.setFoundKey(true);
        player.setFoundMazeKey(true);
        fakeUI.setInput("ja");

        treasureRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasOpenedChest());
    }
}
