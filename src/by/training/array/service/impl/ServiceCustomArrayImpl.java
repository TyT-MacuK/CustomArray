package by.training.array.service.impl;

import by.training.array.entity.CustomArray;
import by.training.array.service.ServiceCustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceCustomArrayImpl implements ServiceCustomArray {

    static final Logger logger = LogManager.getLogger();

    @Override
    public int min(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        logger.log(Level.INFO, "Min value is {}", min);
        return min;

    }

    @Override
    public int max(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        logger.log(Level.INFO, "Max value is {}", max);
        return max;
    }

    @Override
    public int[] replaceEvenNumbersByZero(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        logger.log(Level.INFO, "Numbers were replaced");
        return array;
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
        int[] array = customArray.getCustomArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        logger.log(Level.INFO, "Sum numbers in array = {}", sum);
        return sum;
    }

    @Override
    public int countNegativeNumbers(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int negativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeNumbers++;
            }
        }
        logger.log(Level.INFO, "Negative numbers in array = {}", negativeNumbers);
        return negativeNumbers;
    }

    @Override
    public int countPositiveNumbers(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int positiveNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumbers++;
            }
        }
        logger.log(Level.INFO, "Positive numbers in array = {}", positiveNumbers);
        return positiveNumbers;
    }
}
