package by.training.array.validation;

public class ArrayValidator {

    private ArrayValidator() {  }

    public static boolean checkArrayIsValid(int... array) {
        if (array == null || array.length == 0) {
            return false;
        }
        return true;
    }
}
