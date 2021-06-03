package validation;

import by.training.array.validation.FileValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileValidatorTest {

    @Test(description = "Test FileValidator with correct path")
    public void positiveFileValidatorTest() {
        boolean actual = FileValidator.checkFileIsValid("src\\resources\\text.txt");
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test(description = "Test FileValidator with null")
    public void nullFileValidatorTest() {
        boolean actual = FileValidator.checkFileIsValid(null);
        boolean expected = false;
        assertEquals(actual, expected);
    }
}
