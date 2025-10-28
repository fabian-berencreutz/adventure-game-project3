package se.iths.fabian.adventuregame.model;

import se.iths.fabian.adventuregame.view.FakeUI;

public class TreasureRoomTest {

    void testEnterRoom() {
        FakeUI fakeUI = new FakeUI();
        DungeonRoom dungeonRoom = new DungeonRoom();
        Player player = new Player.Builder()
                .name("Fabian")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        fakeUI.setInput("ja");
    }
}
