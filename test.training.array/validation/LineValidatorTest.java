package validation;

import by.training.array.validation.LineValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LineValidatorTest {

    @DataProvider
    public Object[][] dataExample() {
        return new Object[][]{
                {"1 ,23 -4/ *1", true},
                {"1q ,23 -4/ *1", false},
                {null, false}
        };
    }

    @Test(description = "Positive and negative tests LineValidator ", dataProvider = "dataExample")
    public void LineValidatorTest(String line, boolean expected) {
        boolean actual = LineValidator.checkValidLine(line);
        assertEquals(actual, expected);
    }
}
