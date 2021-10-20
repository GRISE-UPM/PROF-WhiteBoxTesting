package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_maxAbsolute {

	@Test
	@DisplayName("numbers lenght smaller or equals 5 returns 8")
	public void numbersLenghtBiggerEquals5(){
		Exercises exercises = new Exercises();
		int[] numbers = new int[]{4,5,2,8};

		assertEquals(8, exercises.maxAbsolute(numbers), 0);
	}
}
