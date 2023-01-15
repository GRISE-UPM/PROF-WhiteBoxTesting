package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();

    @Test
    public void testFoo2_a_greater_than_b_2() {
        float a = 2;
        float b = 1;
        float expected = 2;
        float result = ex.foo2(a, b);
        assertEquals(expected, result);
    }
		
    @Test
    public void testFoo2_a_lower_than_b_2() {
        float a = 1;
        float b = 5;
        float expected = 2;
        float result = ex.foo2(a, b);
        assertEquals(expected, result);
    }

	@Test
	public void testFoo2_a_b_zero() {
        float a = 0;
        float b = 0;
        float expected = 2;
        float result = ex.foo2(a, b);
        assertEquals(expected, result);
	}
	
	@Test
	public void testFoo2_a_non_zero_b_zero() {
        float a = 6;
        float b = 0;
        float expected = 3;
        float result = ex.foo2(a, b);
        assertEquals(expected, result);
	}
}
