package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.ForestRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForestRoomTest {

    private FakeUI fakeUI;
    private ForestRoom forestRoom;
    private Player player;

    @BeforeEach
    void setUp() {
        fakeUI = new FakeUI();
        forestRoom = new ForestRoom();
        player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();
    }

    @Test
    @DisplayName("hasFoundKey() ska returnera true")
    void testEnterRoom() {

        fakeUI.setInput("ja");

        forestRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasFoundKey());
    }
}
