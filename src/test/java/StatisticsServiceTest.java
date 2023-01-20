package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxChangedArray() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {3, 6, 4, 8, 5};
        long expected = 8;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}