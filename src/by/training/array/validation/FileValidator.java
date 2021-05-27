package by.training.array.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileValidator {

     private static final String DecimalsAndPunctuation = "[-?[\\d\\p{Punct}]+\\s]+$";

     private FileValidator() {}

     public static boolean checkValid(String line) {
          Pattern pattern = Pattern.compile(DecimalsAndPunctuation);
          Matcher matcher = pattern.matcher(line);
          return matcher.matches();
     }
}
