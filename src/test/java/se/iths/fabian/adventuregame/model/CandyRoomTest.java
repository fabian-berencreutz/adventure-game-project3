package se.iths.fabian.adventuregame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.rooms.CandyRoom;
import se.iths.fabian.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyRoomTest {

    @Test
    @DisplayName("setHealth() ska sättas till 0")
    void testEnterRoom() {
        FakeUI fakeUI = new FakeUI();
        CandyRoom candyRoom = new CandyRoom();
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        fakeUI.setInput("ja");

        candyRoom.enterRoom(player, fakeUI);

        assertEquals(0, player.getHealth());
    }
}
