package reader;

import by.training.array.exception.CustomArrayException;
import by.training.array.reader.DataReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataReaderTest {

    DataReader reader;

    @BeforeClass
    public void initialize() {
        reader = new DataReader();
    }

    @Test(description = "Testing reader with right path")
    public void positiveReaderTest() throws CustomArrayException {
        reader.readFromFile("src\\resources\\text.txt");
    }

    @Test(description = "Testing reader with wrong path", expectedExceptions = CustomArrayException.class)
    public void negativeReaderTest() throws CustomArrayException {
        reader.readFromFile("src\\resources");
    }

    @Test(description = "Testing reader with null path", expectedExceptions = CustomArrayException.class)
    public void nullReaderTest() throws CustomArrayException {
        reader.readFromFile(null);
    }

    @AfterClass
    public void tierDown() {
        reader = null;
    }
}
