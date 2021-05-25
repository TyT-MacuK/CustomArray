import by.training.array.entity.CustomArray;
import by.training.array.service.impl.ServiceSortCustomArrayImpl;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ServiceSortCustomArrayTest {
    ServiceSortCustomArrayImpl serviceSortCustomArray = new ServiceSortCustomArrayImpl();

    private final int[] expectedArray = new int[]{-12, -1, 0, 3, 123};

    @Test
    public void shellSortTest() {
        CustomArray array = new CustomArray(new int[]{0, 123, -12, 3, -1});
        serviceSortCustomArray.shellSort(array);
        int[] actualArray = array.getCustomArray();
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void bubbleSortTest() {
        CustomArray array = new CustomArray(new int[]{0, 123, -12, 3, -1});
        serviceSortCustomArray.bubbleSort(array);
        int[] actualArray = array.getCustomArray();
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void quickSortTest() {
        CustomArray array = new CustomArray(new int[]{0, 123, -12, 3, -1});
        serviceSortCustomArray.quickSort(array);
        int[] actualArray = array.getCustomArray();
        assertEquals(actualArray, expectedArray);
    }
}
