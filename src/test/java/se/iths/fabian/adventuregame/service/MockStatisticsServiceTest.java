package se.iths.fabian.adventuregame.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.fabian.adventuregame.dao.FileStatisticsDao;
import se.iths.fabian.adventuregame.model.Statistics;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockStatisticsServiceTest {

    @Test
    @DisplayName("getSortedStatistics() ska returnera en sorterad lista av spelare, med Mockito")
    void testGetSortedStatistics() {
        FileStatisticsDao dao = mock(FileStatisticsDao.class);
        StatisticsService service = new StatisticsService(dao);

        List<Statistics> unsortedList = Arrays.asList(
                new Statistics("A", 50),
                new Statistics("B", 100),
                new Statistics("C", 10)
        );

        when(dao.loadAll()).thenReturn(unsortedList);

        List<Statistics> sortedList = service.getSortedStatistics();

        assertEquals("B", sortedList.get(0).getPlayerName());
        assertEquals("A", sortedList.get(1).getPlayerName());
        assertEquals("C", sortedList.get(2).getPlayerName());

        verify(dao).loadAll();
    }
}
