package se.iths.fabian.adventuregame;

import se.iths.fabian.adventuregame.dao.FileStatisticsDao;
import se.iths.fabian.adventuregame.dao.StatisticsDao;
import se.iths.fabian.adventuregame.model.Player;
import se.iths.fabian.adventuregame.model.StartRoom;
import se.iths.fabian.adventuregame.model.Statistics;
import se.iths.fabian.adventuregame.service.StatisticsService;
import se.iths.fabian.adventuregame.view.ScannerUI;
import se.iths.fabian.adventuregame.view.UI;

public class Main {

    public static void main(String[] args) {
        UI ui = new ScannerUI();

        ui.showMessage(AppInfo.getInstance().getAuthorAndVersion());

        ui.showMessage("Välkommen till Äventyrsspelet!");
        String name = ui.getInput("Ange ditt namn:");
        //Player player = new Player(name, 100, 0, 10);

        Player player = new Player.Builder()
                .name(name)
                .health(100)
                .score(0)
                .strength(10)
                .build();

        new StartRoom().enterRoom(player, ui);

        StatisticsDao dao = new FileStatisticsDao();
        dao.save(new Statistics(player.getName(), player.getScore()));

        StatisticsService service = new StatisticsService(dao);
        ui.showMessage("\n--- Topplista ---");
        for (Statistics s : service.getSortedStatistics()) {
            ui.showMessage(s.getPlayerName() + " - " + s.getScore() + " poäng");
        }
    }
}

