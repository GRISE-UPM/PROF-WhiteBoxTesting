package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class Test_convertInt {
    private Exercises.convertInt toTest;

    @Before
    public void setup() {
        this.toTest = new Exercises().new convertInt();
    }

    @Test
    public void whenIsPositiveNumber_happyPath() throws Exception {
        this.toTest.convert("12345".toCharArray());
    }

    @Test
    public void whenIsNegativeNumber_happyPath() throws Exception {
        this.toTest.convert("-12345".toCharArray());
    }

    @Test
    public void whenIsLargerThenSixCharacters_throwsException() {
        assertThrows(Exception.class, () -> this.toTest.convert("-123456".toCharArray()));
    }

    @Test
    public void whenIsLargerThanUpperBound_throwsException() {
        assertThrows(Exception.class, () -> this.toTest.convert("50000".toCharArray()));
    }

    @Test
    public void whenIsSmallerThanLowerBound_throwsException() {
        assertThrows(Exception.class, () -> this.toTest.convert("-50000".toCharArray()));
    }
}
