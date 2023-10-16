package baitap4;

import org.junit.Assert;
import org.junit.Test;

public class TestBT4 {
    @Test
    public void testFindMax() {
      Baitap4 baitap4=new Baitap4();
        int max = Baitap4.findMax(new int[]{1, 5, -6, 1, 5, 6, 11});
        System.out.println("Find max value in array [1, 5, -6, 1, 5, 6, 11]:");
        Assert.assertEquals(11, max);
    }
}
