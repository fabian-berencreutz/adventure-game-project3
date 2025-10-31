package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.CandyRoom;
import se.iths.fabian.adventuregame.model.rooms.MazeRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MazeRoomTest {

    @Test
    @DisplayName("hasFoundMazeKey() ska returnera true")
    void testEnterRoom() {
        FakeUI fakeUI = new FakeUI();
        MazeRoom mazeRoom = new MazeRoom();
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        fakeUI.setInput("s");

        mazeRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasFoundMazeKey());
    }
}
