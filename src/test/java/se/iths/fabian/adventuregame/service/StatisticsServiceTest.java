package se.iths.fabian.adventuregame.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.dao.FakeFileStatisticsDao;
import se.iths.fabian.adventuregame.model.Statistics;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    @DisplayName("getSortedStatistics() ska returnera en sorterad lista, med fakeDao")
    void testGetSortedStatistics() {
        FakeFileStatisticsDao fakeDao = new FakeFileStatisticsDao();
        StatisticsService service = new StatisticsService(fakeDao);

        List<Statistics> sortedList = service.getSortedStatistics();

        assertEquals("B", sortedList.get(0).getPlayerName());
        assertEquals("C", sortedList.get(1).getPlayerName());
        assertEquals("A", sortedList.get(2).getPlayerName());
    }
}
