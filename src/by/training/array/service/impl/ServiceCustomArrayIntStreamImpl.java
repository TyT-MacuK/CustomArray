package by.training.array.service.impl;

import by.training.array.entity.CustomArray;
import by.training.array.service.ServiceCustomArrayIntStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalInt;

public class ServiceCustomArrayIntStreamImpl implements ServiceCustomArrayIntStream {

    static final Logger logger = LogManager.getLogger();

    @Override
    public int min(CustomArray customArray) {
        OptionalInt min = Arrays.stream(customArray.getCustomArray()).min();
        logger.log(Level.INFO, "Min value is {}", min);
        return min.getAsInt();
    }

    @Override
    public int max(CustomArray customArray) {
        OptionalInt max = Arrays.stream(customArray.getCustomArray()).max();
        logger.log(Level.INFO, "Max value is {}", max);
        return max.getAsInt();
    }

    @Override
    public int[] replaceEvenNumbersByZero(CustomArray customArray) {
        int[] result = Arrays.stream(customArray.getCustomArray()).
                map(x -> x % 2 == 0 ? 0 : x).toArray();
        logger.log(Level.INFO, "Numbers were replaced");
        return result;
    }

    @Override
    public int middle(CustomArray customArray) {
        int arrayLength = customArray.length();
        int middle = (arrayLength + 1) / 2;
        logger.log(Level.INFO, "Middle in array = {}", middle);
        return middle;
    }

    @Override
    public int sum(CustomArray customArray) {
        int sum = Arrays.stream(customArray.getCustomArray()).sum();
        logger.log(Level.INFO, "Sum numbers in array = {}", sum);
        return sum;
    }

    @Override
    public int countNegativeNumbers(CustomArray customArray) {
        int negativeNumbers = (int) Arrays.stream(customArray.getCustomArray()).filter(x -> x < 0).count();
        logger.log(Level.INFO, "Negative numbers in array = {}", negativeNumbers);
        return negativeNumbers;
    }

    @Override
    public int countPositiveNumbers(CustomArray customArray) {
        int positiveNumbers = (int) Arrays.stream(customArray.getCustomArray()).filter(x -> x > 0).count();
        logger.log(Level.INFO, "Positive numbers in array = {}", positiveNumbers);
        return positiveNumbers;
    }
}
