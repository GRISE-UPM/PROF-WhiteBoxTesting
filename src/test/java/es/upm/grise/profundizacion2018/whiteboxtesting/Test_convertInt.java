package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

    private Exercises exercises = new Exercises();

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenLengthIsGT() throws Exception {
        this.exercises.convert(createGTLength());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenNumGTLimit() throws Exception {
        this.exercises.convert(createGTNumber());
    }

    @Test
    public void shouldReturnNumberWhenIsNegative() throws Exception {
        int result = this.exercises.convert(createNegative());
        assertTrue(result < 0);
    }
    @Test
    public void shouldReturnNumberWhenIsPositive() throws Exception {
        int result = this.exercises.convert(createPositive());
        assertTrue(result > 0);
    }

    private char[] createGTLength() {
        String number = "1234567";
        return number.toCharArray();
    }
    private char[] createGTNumber() {
        String number = "32768";
        return number.toCharArray();
    }
    private char[] createNegative() {
        String number = "-123";
        return number.toCharArray();
    }
    private char[] createPositive() {
        String number = "123";
        return number.toCharArray();
    }
}
