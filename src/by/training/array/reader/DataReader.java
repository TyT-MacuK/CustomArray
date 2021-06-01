package by.training.array.reader;

import by.training.array.exception.CustomArrayException;
import by.training.array.validation.LineValidator;
import by.training.array.validation.FileValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    static final Logger logger = LogManager.getLogger();

    public String readFromFile(String path) throws CustomArrayException {
        String line = "";
        StringBuilder result = new StringBuilder();

        if (FileValidator.checkFileIsValid(path)) {

            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                while ((line = reader.readLine()) != null) {
                    if (LineValidator.checkValidLine(line)) {
                        result.append(line + " ");
                    }
                }

                logger.log(Level.INFO, "File was read");
            } catch (IOException e) {
                logger.log(Level.ERROR, "The file can not be read");
                throw new CustomArrayException("File read exception");
            }
        } else {
            logger.log(Level.ERROR, "The file or path is not valid");
            throw new CustomArrayException("File or path exception");
        }
        return result.toString();
    }
}
