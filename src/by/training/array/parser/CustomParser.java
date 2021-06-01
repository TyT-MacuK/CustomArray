package by.training.array.parser;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomParser {

    static final Logger logger = LogManager.getLogger();
    private final String REG_NUMBER = "(-?\\d+)";

    public CustomArray parserStringToCustomArray(String line) throws CustomArrayException {
        Pattern pattern = Pattern.compile(REG_NUMBER);
        Matcher matcher = pattern.matcher(line);
        List<Integer> listInt = new ArrayList<>();
        StringBuilder bufferString = new StringBuilder();

        while (matcher.find()) {
           bufferString.append(matcher.group(1) + " ");
        }

        String[] arrayString = bufferString.toString().split("\\s");
        int[] result = new int[arrayString.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(arrayString[i]);
        }
        logger.log(Level.INFO, "Array was parsed");
        return new CustomArray(result);// добавить массив
    }
}
