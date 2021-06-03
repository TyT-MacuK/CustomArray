package service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomArrayException;
import by.training.array.service.impl.ServiceSortCustomArrayIntStreamImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ServiceSortCustomArrayIntStreamTest {

    @Test(description = "Test intStream sort")
    public void sortTest() throws CustomArrayException {
        ServiceSortCustomArrayIntStreamImpl serviceSortCustomArrayIntStream = new ServiceSortCustomArrayIntStreamImpl();
        CustomArray customArray = new CustomArray(new int[]{0, 123, -12, 3, -1});
        int[] actualArray = serviceSortCustomArrayIntStream.sort(customArray);
        int[] expectedArray = new int[]{-12, -1, 0, 3, 123};
        assertEquals(actualArray, expectedArray);
    }
}
