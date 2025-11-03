package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.MazeRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MazeRoomTest {

    private FakeUI fakeUI;
    private MazeRoom mazeRoom;
    private Player player;

    @BeforeEach
    void setUp() {
        fakeUI = new FakeUI();
        mazeRoom = new MazeRoom();
        player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();
    }

    @Test
    @DisplayName("hasFoundMazeKey() ska returnera true")
    void testEnterRoom() {

        fakeUI.setInput("s");

        mazeRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasFoundMazeKey());
    }
}
