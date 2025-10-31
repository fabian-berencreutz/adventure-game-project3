package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.Utils;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.view.UI;

// singleton för att inte kunna gå in i grottan igen.
public class StartRoom implements Room {

    private CaveRoom caveRoom = new CaveRoom();

    @Override
    public void enterRoom(Player player, UI ui) {
        ui.showMessage("Du befinner dig i start-rummet. Du ser sex dörrar framför dig.");
        boolean exit = false;
        while (!exit) {
            String choice = ui.getInput("Vilken dörr vill du ta? (1=Skog, 2=Fängelse," +
                    " 3=Skattkammare, 4=Godisrum, 5=Grotta, 6=Labyrint, q=avsluta)");
            switch (choice) {
                case "1":
                    if (!player.hasFoundKey()) {
                        new ForestRoom().enterRoom(player, ui);
                    } else {
                        System.out.println("Du har redan hittat och plockat upp nyckeln.");
                    }

                    break;
                case "2":
                    new DungeonRoom().enterRoom(player, ui);
                    break;
                case "3":
                    if (!player.hasOpenedChest()) {
                        new TreasureRoom().enterRoom(player, ui);
                    } else {
                        System.out.println("Du har redan hittat och öppnat kistan");
                    }
                    break;
                case "4":
                    new CandyRoom().enterRoom(player, ui);
                    break;
                case"5":
                    caveRoom.enterRoom(player, ui);
                    break;
                case "6":
                    new MazeRoom().enterRoom(player, ui);
                    break;
                case "q":
                    exit = true;
                    break;
                default:
                    ui.showMessage("Ogiltigt val.");
            }
            if (player.hasWon()) {
                ui.showMessage("Grattis! Du har klarat spelet!");
                Utils.delay(2000);
                exit = true;
            } else if (player.getHealth() <= 0) {
                ui.showMessage(("Du är död. Spelet är slut."));
                Utils.delay(2000);
                exit = true;
            }
        }
    }
}

