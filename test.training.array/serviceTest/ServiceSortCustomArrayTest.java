package serviceTest;

import by.training.array.entity.CustomArray;
import by.training.array.service.impl.ServiceSortCustomArrayImpl;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ServiceSortCustomArrayTest {
    ServiceSortCustomArrayImpl serviceSortCustomArray = new ServiceSortCustomArrayImpl();

    private final int[] expectedArray = new int[]{-12, -1, 0, 3, 123};

    @Test(description = "Test algorithm Shell sort on CustomArray")
    public void positiveShellSortTest() {
        CustomArray array = new CustomArray(new int[]{0, 123, -12, 3, -1});
        serviceSortCustomArray.shellSort(array);
        int[] actualArray = array.getCustomArray();
        assertEquals(actualArray, expectedArray);
    }

    @Test(description = "Test algorithm bubble sort on CustomArray")
    public void positiveBubbleSortTest() {
        CustomArray array = new CustomArray(new int[]{0, 123, -12, 3, -1});
        serviceSortCustomArray.bubbleSort(array);
        int[] actualArray = array.getCustomArray();
        assertEquals(actualArray, expectedArray);
    }

    @Test(description = "Test algorithm quick sort on CustomArray")
    public void positiveQuickSortTest() {
        CustomArray array = new CustomArray(new int[]{0, 123, -12, 3, -1});
        serviceSortCustomArray.quickSort(array);
        int[] actualArray = array.getCustomArray();
        assertEquals(actualArray, expectedArray);
    }
}
