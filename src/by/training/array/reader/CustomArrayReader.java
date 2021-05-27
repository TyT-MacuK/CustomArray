package by.training.array.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

import static by.training.array.validation.FileValidator.checkValid;

public class CustomArrayReader {

    static final Logger logger = LogManager.getLogger();

    public String readFromFile(String path) {
        File file = new File(path);
        String line = "";
        String result = "";

        if (file.exists() && file.canRead()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while ((line = reader.readLine()) != null) {
                    if (checkValid(line)) {
                     result += line + " ";
                    }
                }
            } catch (IOException e) {
                logger.log(Level.ERROR, "File read exception");
                e.printStackTrace();
            }
        }
        logger.log(Level.INFO, "File was read");
        return result;
    }
}
