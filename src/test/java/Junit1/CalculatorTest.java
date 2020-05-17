package Junit1;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void multiplyWith3And4() {
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3,4);
        assertThat(actual, is(expected));
    }

    @Test
    public void multiplyWith5And7() {
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5,7);
        assertThat(actual, is(expected));
    }

    @Test
    public void divideWith3And2() {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3,2);
        assertThat(actual, is(expected));
    }
    @Test(expected = IllegalArgumentException.class)
    public void divideWith5And0IllegalArgumentException() {
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }

}