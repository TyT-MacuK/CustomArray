package by.training.array.entity;

import by.training.array.exception.CustomArrayException;
import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int... array) {
        this.array = array;
    }

    public int[] getCustomArray() {
        return array.clone();
    }

    public void setCustomArray(int... array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public int getElement(int number) throws CustomArrayException {
        if (number < 0 || number > array.length) {
            throw new CustomArrayException("Index " + number + "must be > 0 and < than the total length of the array");
        }
        return array[number];
    }

    public void setElement(int number, int index) throws CustomArrayException {
        if (number < 0 || number > array.length) {
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
        return this.array == customArray.array;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i : array) {
            builder.append(i + " ");
        }
        return builder.toString();
    }
}
