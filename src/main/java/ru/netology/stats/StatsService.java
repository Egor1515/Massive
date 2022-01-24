package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;

        for (int sale : sales) {

            sum += sale;

        }
        return sum;

    }

    public int calculateAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;


    }

    public int belowAverage(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale < calculateAverage(sales)) {
                amount++;
            }
        }
        return amount;
    }

    public int aboveAverage(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale > calculateAverage(sales)) {
                amount++;
            }


        }
        return amount;
    }
}





