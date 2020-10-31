package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {
    private Exercises toTest;

    @Before
    public void setup() {
        this.toTest = new Exercises();
    }

    @Test
    public void whenArraysIsLargerThanFive_returnsNegativeOne() {
        assertEquals(-1.0f, this.toTest.maxAbsolute(new int[]{1, 2, 3, 4, 5, 6}), 0.0f);
    }

    @Test
    public void whenAbsoluteMaximumIsPositive_returnMaximumPositiveValue() {
        assertEquals(5, this.toTest.maxAbsolute(new int[]{1, -2, 3, -4, 5}));
    }

    @Test
    public void whenAbsoluteMaximumIsNagative_returnMinimumNegativeValue() {
        assertEquals(5, this.toTest.maxAbsolute(new int[]{-1, 2, -3, 4, -5}));
    }
}
