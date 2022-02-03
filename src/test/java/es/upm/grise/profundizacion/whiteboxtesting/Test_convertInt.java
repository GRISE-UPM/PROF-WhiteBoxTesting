package es.upm.grise.profundizacion.whiteboxtesting;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_convertInt {

	
	static Exercises exercises;

 	@BeforeEach
 	void setup() {
 		exercises = new Exercises();
 	}

 	@Test
 	public void testNumberElementsGreaterThanFive() {
 		assertEquals(-1, exercises.maxAbsolute(new int[]{1,2,3,4,5,6}));
 	}

 	@Test
 	public void testMaxValuesIs10() {
 		assertEquals(10, exercises.maxAbsolute(new int[]{10,2,3,4}));
 	}
}
