package by.training.array.service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;

public interface ServiceCustomArray {
    int min(CustomArray customArray);

    int max(CustomArray customArray);

    boolean replaceEvenNumbersByZero(CustomArray customArray);

    int middle(CustomArray customArray) throws CustomArrayException;

    int sum(CustomArray customArray);

    int countNegativeNumbers(CustomArray customArray);

    int countPositiveNumbers(CustomArray customArray);
}
