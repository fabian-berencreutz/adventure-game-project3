package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.Utils;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.characters.Wizard;
import se.iths.fabian.adventuregame.view.UI;

public class CaveRoom implements Room{

    private boolean visited = false;

    @Override
    public void enterRoom(Player player, UI ui) {
        if (visited) {
            ui.showMessage("Grottan har kollapsat och du kan inte gå in.");
            Utils.delay(2000);
            return;
        }
        visited = true;

        ui.showMessage("Du går ner i en mörk grotta, fylld av spindlar...");
        Utils.delay(2000);
        ui.showMessage("Framför dig ser du en herre med långt vitt skägg...");
        Utils.delay(2000);

        Wizard wizard = new Wizard("Trollkarl Jarl", 100, 0, 0);

        ui.showMessage("-Jag är mäktigast av alla, säger " + wizard.getName() + ".");
        Utils.delay(2000);
        ui.showMessage("-Svara rätt på denna fråga så kommer jag att ge dig nyckeln.");
        Utils.delay(2000);

        String choice = ui.getInput("Hur många laxar får plats i en laxask..?");

        if (choice.equals("6")) {
            player.setAutoWin(true);
            player.addScore(1000);
            ui.showMessage("Du får nyckeln och 1000 poäng!!");
            Utils.delay(2000);
        } else {
            ui.showMessage("Tyvärr, det var fel svar... ");
            Utils.delay(2000);
            ui.showMessage("Grottan kollapsar och du springer ut!");
            Utils.delay(2000);
        }
    }
}
