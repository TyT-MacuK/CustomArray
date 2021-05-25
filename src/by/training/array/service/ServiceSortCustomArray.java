package by.training.array.service;

import by.training.array.entity.CustomArray;

public interface ServiceSortCustomArray {
    boolean shellSort(CustomArray customArray);

    boolean bubbleSort(CustomArray customArray);

    boolean quickSort(CustomArray customArray);
}
