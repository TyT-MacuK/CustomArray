package validation;

import by.training.array.validation.ArrayValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayValidatorTest {

    @DataProvider
    public Object[][] dataExample() {
        return new Object[][]{
                {new int[]{1, -3, 25}, true},
                {new int[0], false},
                {null, false}
        };
    }

    @Test(description = "Positive and negative tests ArrayValidator ", dataProvider = "dataExample")
    public void arrayValidatorTest(int[] array, boolean expected) {
        boolean actual = ArrayValidator.checkArrayIsValid(array);
        assertEquals(actual, expected);
    }
}
