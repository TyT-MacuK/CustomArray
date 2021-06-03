package by.training.array.validation;

import java.io.File;

public class FileValidator {

    private FileValidator() {}

    public static boolean checkFileIsValid(String path) {
        boolean result = false;
        if (path != null) {
            File file = new File(path);
            if (file.exists() && file.canRead()) {
                result = true;
            }
        }
        return result;
    }
}
