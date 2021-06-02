package by.training.array.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineValidator {

    static final String NUMBERS_AND_PUNCTUATION = "[-?[\\d\\p{Punct}]+\\s]+$";

    private LineValidator() { }

    public static boolean checkValidLine(String line) {
        Pattern pattern = Pattern.compile(NUMBERS_AND_PUNCTUATION);
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
