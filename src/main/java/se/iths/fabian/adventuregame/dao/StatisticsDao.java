package se.iths.fabian.adventuregame.dao;

import se.iths.fabian.adventuregame.model.Statistics;

import java.util.List;

public interface StatisticsDao {
    void save(Statistics stat);

    List<Statistics> loadAll();
}

