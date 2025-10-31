package se.iths.fabian.adventuregame.dao;

import se.iths.fabian.adventuregame.model.Statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeFileStatisticsDao implements StatisticsDao {
    @Override
    public void save(Statistics stat) {

    }

    @Override
    public List<Statistics> loadAll() {
        List<Statistics> unsortedList = new ArrayList<>();
        unsortedList.add(new Statistics("A", 150));
        unsortedList.add(new Statistics("B", 500));
        unsortedList.add(new Statistics("C", 200));
        return unsortedList;
    }
}
