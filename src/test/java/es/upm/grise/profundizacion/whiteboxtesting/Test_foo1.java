package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_foo1 {
    private Exercises toTest;

    @Before
    public void setup() {
        this.toTest = new Exercises();
    }

    @Test
    public void whenXIsSmallerThanFive() {
        assertEquals(10.0f, this.toTest.foo1(5.0f, 50.0f), 0.0f);
    }

    @Test
    public void whenXIsLargerThanFive() {
        assertEquals(10.0f, this.toTest.foo1(10.0f, 200.0f), 0.0f);
    }
}
