package ru.netology.stats.StatsService.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllSales = 180;
        int actualAllSales = service.sumAllSales(sales);
        Assertions.assertEquals(expectedAllSales, actualAllSales);


    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvgSales = 15;
        int actualAvgSales = service.avgAmountSales(sales);
        Assertions.assertEquals(expectedAvgSales, actualAvgSales);

    }

    @Test
    public void shouldMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minMonthSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxMonthSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void shouldBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsBelow = 5;
        int actualMonthsBelow = service.belowAverageSales(sales);
        Assertions.assertEquals(expectedMonthsBelow, actualMonthsBelow);
    }

    @Test
    public void shouldAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsAbove = 5;
        int actualMonthsAbove = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedMonthsAbove, actualMonthsAbove);
    }


}
