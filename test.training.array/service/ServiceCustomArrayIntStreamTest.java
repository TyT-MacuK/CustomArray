package service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import by.training.array.service.ServiceCustomArrayIntStream;
import by.training.array.service.impl.ServiceCustomArrayIntStreamImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ServiceCustomArrayIntStreamTest {

    ServiceCustomArrayIntStream serviceCustomArrayIntStream;
    CustomArray customArray;
    int[] array;

    @BeforeClass
    public void initialize() throws CustomArrayException {
        array = new int[]{1, 125, -12, 0, -13};
        serviceCustomArrayIntStream = new ServiceCustomArrayIntStreamImpl();
        customArray = new CustomArray(array);

    }

    @Test(description = "Find the minimum value in CustomArray")
    public void minTest() {
        int actual = serviceCustomArrayIntStream.min(customArray);
        int expected = -13;
        assertEquals(actual, expected);
    }

    @Test(description = "Find the maximum value in CustomArray")
    public void maxTest() {
        int actual = serviceCustomArrayIntStream.max(customArray);
        int expected = 125;
        assertEquals(actual, expected);
    }

    @Test(description = "Replace all even values in CustomArray by zero")
    public void replaceEvenValuesByZeroTest() {
        int[] actual = serviceCustomArrayIntStream.replaceEvenNumbersByZero(customArray);
        int[] expected = new int[]{1, 125, 0, 0, -13};
        assertEquals(actual, expected);
    }

    @Test(description = "Find the middle value in CustomArray")
    public void middleTest() {
        int actual = serviceCustomArrayIntStream.middle(customArray);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test(description = "Find the sum of values in CustomArray")
    public void sumTest() {
        int actual = serviceCustomArrayIntStream.sum(customArray);
        int expected = 101;
        assertEquals(actual, expected);
    }

    @Test(description = "Count negative values in CustomArray")
    public void countNegativeNumbersTest() {
        int actual = serviceCustomArrayIntStream.countNegativeNumbers(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(description = "Count positive values in CustomArray")
    public void countPositiveNumbers() {
        int actual = serviceCustomArrayIntStream.countPositiveNumbers(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @AfterClass
    public void tierDown() {
        array = null;
        serviceCustomArrayIntStream = null;
        customArray = null;
    }
}
