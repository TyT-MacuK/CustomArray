package by.training.array.entity;

import by.training.array.exception.CustomArrayException;
import by.training.array.validation.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray {

    private static final Logger logger = LogManager.getLogger();
    private int[] array;

    public CustomArray(int... array) throws CustomArrayException {
        if (!ArrayValidator.checkArrayIsValid(array)) {
            logger.log(Level.ERROR, "Array is not valid");
            throw new CustomArrayException("Array can't be null, and length must be greater than 0");
        }
        this.array = array;
    }

    public int[] getCustomArray() {
        return array.clone();
    }

    public void setCustomArray(int... array) throws CustomArrayException {
        if (!ArrayValidator.checkArrayIsValid(array)) {
            logger.log(Level.ERROR, "Array is not valid");
            throw new CustomArrayException("Array can't be null, and length must be greater than 0");
        }
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public int getElement(int number) throws CustomArrayException {
        if (number < 0 || number > array.length) {
            logger.log(Level.ERROR, "Index" + number + "is not valid");
            throw new CustomArrayException("Index " + number + "must be > 0 and < than the total length of the array");
        }
        return array[number];
    }

    public void setElement(int number, int index) throws CustomArrayException {
        if (number < 0 || number > array.length) {
            logger.log(Level.ERROR, "Index" + number + "is not valid");
            throw new CustomArrayException("Index " + number + "must be > 0 and < than the total length of the array");
        }
        array[index] = number;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() == object.getClass()) {
            return true;
        }

        CustomArray customArray = (CustomArray) object;
        return Arrays.equals(customArray.getCustomArray(), array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
