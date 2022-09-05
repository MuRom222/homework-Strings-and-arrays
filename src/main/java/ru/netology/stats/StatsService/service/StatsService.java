package ru.netology.stats.StatsService.service;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;

    }

    public int avgAmountSales(int[] sales) {

        int sum = 0;
        int amount = sales.length;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int averageSales = sum / amount;
        return averageSales;

    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int counter = 0;
        int averageSales = avgAmountSales(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                counter = counter + 1;
            }
        }
        return counter;


    }

    public int aboveAverageSales(int[] sales) {
        int counter = 0;
        int averageSales = avgAmountSales(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}
