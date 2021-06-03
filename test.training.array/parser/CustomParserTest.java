package parser;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import by.training.array.parser.CustomParser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CustomParserTest {

    CustomParser parser;
    String example;

    @BeforeClass
    public void initialize() {
        parser = new CustomParser();
        example = " 1 -23 15/ 8 *7 ";
    }

    @Test(description = "Test parser")
    public void customParserTest() throws CustomArrayException {
        CustomArray actual = parser.parserStringToCustomArray(example);
        CustomArray expected = new CustomArray(1, -23, 15, 8, 7);
        assertEquals(actual.getCustomArray(), expected.getCustomArray());
    }

    @AfterClass
    public void tierDown() {
        parser = null;
        example = null;
    }
}
