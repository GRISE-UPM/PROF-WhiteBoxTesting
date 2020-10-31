package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_foo2 {
    private Exercises toTest;

    @Before
    public void setup() {
        this.toTest = new Exercises();
    }

    @Test
    public void whenAIsSmallerThanB() {
        assertEquals(7.0f, this.toTest.foo2(6.0f, 8.0f), 0.0f);
    }

    @Test
    public void whenAIsLargerThanB() {
        assertEquals(7.0f, this.toTest.foo2(8.0f, 6.0f), 0.0f);
    }

    @Test
    public void whenCosAIsSmallerThanZero_returnsTwo() {
        assertEquals(2.0f, this.toTest.foo2(4.0f, 8.0f), 0.0f);
    }

    @Test
    public void whenCosBIsLargerThanZero_returnsTwo() {
        assertEquals(2.0f, this.toTest.foo2(5.0f, 11.0f), 0.0f);
    }
}
