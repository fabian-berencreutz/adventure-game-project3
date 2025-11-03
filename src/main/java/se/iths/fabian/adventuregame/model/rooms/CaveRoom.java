package se.iths.fabian.adventuregame.model.rooms;

import se.iths.fabian.adventuregame.Utils;
import se.iths.fabian.adventuregame.model.characters.Player;
import se.iths.fabian.adventuregame.model.characters.Wizard;
import se.iths.fabian.adventuregame.view.UI;

public class CaveRoom implements Room{

    @Override
    public void enterRoom(Player player, UI ui) {

        ui.showMessage("Du går ner i en mörk grotta, fylld av spindlar...");
        Utils.delay(2000);
        ui.showMessage("Framför dig ser du en herre med långt vitt skägg...");
        Utils.delay(2000);

        Wizard wizard = new Wizard("Trollkarl Jarl", 100, 0, 0);

        ui.showMessage("-Jag är mäktigast av alla, säger " + wizard.getName() + ".");
        Utils.delay(2000);
        ui.showMessage("-Svara rätt på denna fråga så kommer jag att ge dig allt du drömmer om...");
        Utils.delay(2000);

        String choice = ui.getInput("Hur många laxar får plats i en laxask..? Skriv ditt svar:");

        if (choice.equals("6") || choice.equalsIgnoreCase("sex")) {
            player.setAutoWin(true);
            player.addScore(1000);
            ui.showMessage("Skatten dyker magiskt upp och du får 1000 poäng!!");
        } else {
            ui.showMessage("Tyvärr, det var fel svar... ");
            ui.showMessage("Grottan kollapsar och du springer ut!");
        }

        Utils.delay(2000);
    }
}
