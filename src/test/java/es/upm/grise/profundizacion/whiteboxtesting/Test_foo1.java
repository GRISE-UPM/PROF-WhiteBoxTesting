package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_foo1 {
	
	Exercises ex = new Exercises();
	
    @Test
    public void testFoo1_x_greater_than_5() {
        float x = 6;
        float y = 16;
        float expected = 1;
        float result = ex.foo1(x, y);
        assertEquals(expected, result);
    }
	
    @Test
    public void testFoo1_x_less_than_five() {
        float x = 5;
        float y = 20;
        float expected = 4;
        float result = ex.foo1(x, y);
        assertEquals(expected, result);
    }
	
    @Test
    public void testFoo1_equals_zero() {
        float x = 5;
        float y = 0;
        float expected = 0;
        float result = ex.foo1(x, y);
        assertEquals(expected, result);
    }

}
