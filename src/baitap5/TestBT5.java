package baitap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBT5 {
    @Test
    public void testFindMin() {
        int[] arr = {5, 2, 9, 1, 7};
        int result = BaiTap5.findMin(arr);
        assertEquals(1, result);
    }
}
