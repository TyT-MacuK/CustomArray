package by.training.array.service;

import by.training.array.entity.CustomArray;

public interface ServiceSortCustomArray {
    int[] shellSort(CustomArray customArray);

    int[] bubbleSort(CustomArray customArray);

    int[] quickSort(CustomArray customArray);
}
