package baitap2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
Calculator calculator=new Calculator();
@Test
    public void testMultiplication(){
    double result=Calculator.multiplication(3.0,4.0);
    assertEquals(12.0,result,0.000000001);
}
}
