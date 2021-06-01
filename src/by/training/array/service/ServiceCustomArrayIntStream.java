package by.training.array.service;

import by.training.array.entity.CustomArray;

public interface ServiceCustomArrayIntStream {
    int min(CustomArray customArray);

    int max(CustomArray customArray);

    int[] replaceEvenNumbersByZero(CustomArray customArray);

    int middle(CustomArray customArray);

    int sum(CustomArray customArray);

    int countNegativeNumbers(CustomArray customArray);

    int countPositiveNumbers(CustomArray customArray);

}
