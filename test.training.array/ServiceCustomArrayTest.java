import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import by.training.array.service.impl.ServiceCustomArrayImpl;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ServiceCustomArrayTest {

    ServiceCustomArrayImpl serviceCustomArray = new ServiceCustomArrayImpl();

    @Test
    public void minTest() {
        CustomArray array = new CustomArray(new int[] {1, 125, -12, 0, -13});
        int actual = serviceCustomArray.min(array);
        int expected = -13;
        assertEquals(actual, expected);
    }

    @Test
    public void maxTest() {
        CustomArray array = new CustomArray(new int[] {1, 125, -12, 0, -13});
        int actual = serviceCustomArray.max(array);
        int expected = 125;
        assertEquals(actual, expected);
    }

    @Test
    public void replaceEvenNumbersByZeroTest() {
        CustomArray array = new CustomArray(new int[] {1, 125, -12, 0, -13});
        boolean actual = serviceCustomArray.replaceEvenNumbersByZero(array);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void middleTest() throws CustomArrayException {
        CustomArray array = new CustomArray(new int[] {1, 125, -12, 0, -13});
        int actual = serviceCustomArray.middle(array);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void sumTest() {
        CustomArray array = new CustomArray(new int[] {1, 125, -12, 0, -13});
        int actual = serviceCustomArray.sum(array);
        int expected = 101;
        assertEquals(actual, expected);
    }

    @Test
    public void countNegativeNumbersTest() {
        CustomArray array = new CustomArray(new int[] {1, 125, -12, 0, -13});
        int actual = serviceCustomArray.countNegativeNumbers(array);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void countPositiveNumbers() {
        CustomArray array = new CustomArray(new int[]{1, 125, -12, 0, -13});
        int actual = serviceCustomArray.countPositiveNumbers(array);
        int expected = 2;
        assertEquals(actual, expected);
    }
}
