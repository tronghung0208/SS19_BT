package baitap3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestBT3 {
    @Test
    public void testDivision() {
        double result = BaiTap3.division(10.0, 2.0);
        assertEquals(5.0, result, 0.00001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> BaiTap3.division(10.0, 0.0));
    }
}
