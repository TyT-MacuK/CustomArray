package by.training.array.service.impl;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import by.training.array.service.ServiceCustomArray;

public class ServiceCustomArrayImpl implements ServiceCustomArray {
    @Override
    public int min(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
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
        return max;
    }

    @Override
    public boolean replaceEvenNumbersByZero(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return true;
    }

    @Override
    public int middle(CustomArray customArray) throws CustomArrayException {
        int arrayLength = customArray.length();
        return (arrayLength + 1) / 2;
    }

    @Override
    public int sum(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
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
        return positiveNumbers;
    }
}
