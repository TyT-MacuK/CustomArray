package by.training.array.parser;

import by.training.array.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomParser {

    static final Logger logger = LogManager.getLogger();

    public CustomArray parserStringToCustomArray(String line) {
        String lineWithoutPunctuation = "";
        int beginNumber = 0;
        int endNumber;
        int countNumbers = 0;

        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i)) && line.charAt(i) != '-') {
                endNumber = i;
                if (Character.isDigit(line.charAt(i - 1)) && line.charAt(i) != '-') {
                    lineWithoutPunctuation = lineWithoutPunctuation + line.substring(beginNumber, endNumber) + " ";
                    countNumbers++;
                }
                beginNumber = endNumber + 1;
            }
        }

        int[] arrayResult = new int[countNumbers];
        beginNumber = 0;
        int j = 0;

        for (int i = 0; i < lineWithoutPunctuation.length(); i++) {
            if (lineWithoutPunctuation.charAt(i) == ' ') {
                endNumber = i;
                arrayResult[j] = Integer.parseInt(lineWithoutPunctuation.substring(beginNumber, endNumber));
                j++;
                beginNumber = endNumber + 1;
            }
        }
        logger.log(Level.INFO, "Array was parsed");
        return new CustomArray(arrayResult);
    }
}
