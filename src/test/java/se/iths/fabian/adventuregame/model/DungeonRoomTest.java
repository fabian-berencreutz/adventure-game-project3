package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.DungeonRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DungeonRoomTest {

    private FakeUI fakeUI;
    private DungeonRoom dungeonRoom;
    private Player player;

    @BeforeEach
    void setUp() {
        fakeUI = new FakeUI();
        dungeonRoom = new DungeonRoom();
        player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();
    }

    @Test
    @DisplayName("hasDefeatedEnemy() ska returnera true")
    void testEnterRoom() {

        fakeUI.setInput("a");

        dungeonRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasDefeatedEnemy());
    }
}
