package service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import by.training.array.service.impl.ServiceSortCustomArrayImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ServiceSortCustomArrayTest {

    int[] expectedArray;
    int[] array;
    ServiceSortCustomArrayImpl serviceSortCustomArray;
    CustomArray customArray;

    @BeforeClass
    public void initializeArray() throws CustomArrayException {
        expectedArray = new int[]{-12, -1, 0, 3, 123};
        array = new int[]{0, 123, -12, 3, -1};
        serviceSortCustomArray = new ServiceSortCustomArrayImpl();
        customArray = new CustomArray(array);
    }

    @Test(description = "Test algorithm Shell sort on CustomArray")
    public void shellSortTest() {
        int[] actualArray = serviceSortCustomArray.shellSort(customArray);
        assertEquals(actualArray, expectedArray);
    }

    @Test(description = "Test algorithm bubble sort on CustomArray")
    public void bubbleSortTest() {
        int[] actualArray = serviceSortCustomArray.shellSort(customArray);
        assertEquals(actualArray, expectedArray);
    }

    @Test(description = "Test algorithm quick sort on CustomArray")
    public void quickSortTest() {
        int[] actualArray = serviceSortCustomArray.shellSort(customArray);
        assertEquals(actualArray, expectedArray);
    }

    @AfterClass
    public void tierDown() {
        expectedArray = null;
        array = null;
        serviceSortCustomArray = null;
        customArray = null;
    }
}
