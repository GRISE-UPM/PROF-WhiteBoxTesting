package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

    private Exercises exercises = new Exercises();

	@Test
	public void shouldReturnMinusOneWhenLengthGtFive(){
        int result = this.exercises.max_absolute(createGtLength());
        assertEquals(result,-1);
    }
    @Test
    public void shouldReturnFloatWhenLengthIsCorrectAndAllPositive(){
        int result = this.exercises.max_absolute(createPositive());
        assertEquals(result,3);
    }

    @Test
    public void shouldReturnFloatWhenLengthIsCorrectAndOneNegative(){
        int result = this.exercises.max_absolute(createNegative());
        assertEquals(result,4);
    }

    @Test
    public void shouldReturnZeroWhenLengthIsZero(){
        int result = this.exercises.max_absolute(createZeroLength());
        assertEquals(result,0);
    }

    private int[] createGtLength() {
	    return new int[]{1,2,3,4,5,6};
    }

    private int[] createZeroLength() {
        return new int[]{};
    }
    private int[] createPositive() {
        return new int[]{1,2,3};
    }
    private int[] createNegative() {
        return new int[]{1,2,3, -4};
    }

}
