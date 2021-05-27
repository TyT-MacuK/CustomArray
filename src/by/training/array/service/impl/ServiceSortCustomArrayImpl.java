package by.training.array.service.impl;

import by.training.array.entity.CustomArray;
import by.training.array.service.ServiceSortCustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceSortCustomArrayImpl implements ServiceSortCustomArray {

    final static Logger logger = LogManager.getLogger();

    @Override
    public boolean shellSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int i = 0;
        int buffer;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                buffer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buffer;

                if (i > 0) {
                    i--;
                }
            } else if (i < array.length - 1) {
                i++;
            }
        }
        customArray.setCustomArray(array);
        logger.log(Level.INFO, "CustomArray was sorted by Shell sort");
        return true;
    }

    @Override
    public boolean bubbleSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int buffer;
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    flag = false;
                }
            }
        }
        customArray.setCustomArray(array);
        logger.log(Level.INFO, "CustomArray was sorted by bubble sort");
        return true;
    }

    @Override
    public boolean quickSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        boolean result = algorithmQuickSort(array, 0, array.length - 1);
        if (result) {
            customArray.setCustomArray(array);
            logger.log(Level.INFO, "CustomArray was sorted by quick sort");
            return true;
        }
        logger.log(Level.INFO, "CustomArray wasn't sorted by quick sort");
        return false;
    }

    private boolean algorithmQuickSort(int[] array, int leftBorder, int rightBorder) {
        if (array.length == 0) {
            return false;
        }

        int middle = leftBorder + (rightBorder - leftBorder) / 2;
        int supportElement = array[middle];
        int i = leftBorder;
        int j = rightBorder;

        while (i < j) {
            while (array[i] < supportElement) {
                i++;
            }
            while (array[j] > supportElement) {
                j--;
            }
            if (i <= j) {
                int buffer = array[i];
                array[i] = array[j];
                array[j] = buffer;
                i++;
                j--;
            }
        }
        if (leftBorder < j) {
            algorithmQuickSort(array, leftBorder, j);
        }
        if (rightBorder > i) {
            algorithmQuickSort(array, i, rightBorder);
        }
        return true;
    }
}
