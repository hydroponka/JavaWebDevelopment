package by.ageenko.learn.task2.generator;

public class NumberGenerator {
    private static final int MAX_SIZE_OF_NUMBER_OF_ORDER = 100000;
    private static int numberOfOrderCounter = 9999;
    private static int numberOfClientCounter;

    private NumberGenerator() {
    }

    public static int generateNumberOfOrder() {
        numberOfOrderCounter++;
        return numberOfOrderCounter < MAX_SIZE_OF_NUMBER_OF_ORDER ? numberOfOrderCounter : 0;
    }

    public static int generateNumberOfClient() {
        numberOfClientCounter++;
        return numberOfClientCounter < Long.MAX_VALUE ? numberOfClientCounter : 0;
    }
}
