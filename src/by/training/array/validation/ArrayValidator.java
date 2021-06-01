package by.training.array.validation;

public class ArrayValidator {

    private ArrayValidator() {  }

    public static boolean checkArrayIsValid(int... array) {
        if (array.length <= 0 || array == null) {
            return false;
        }
        return true;
    }
}
