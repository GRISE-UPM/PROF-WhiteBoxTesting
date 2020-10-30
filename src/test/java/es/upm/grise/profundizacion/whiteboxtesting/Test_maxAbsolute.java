package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises claseExercises = new Exercises();

	@Test
	//Testeo 1-2
	public void testVectorMasCincoElementos() {
		int[] vectorSeisElementos={1,2,3,4,5,6};
		assertEquals(-1,claseExercises.maxAbsolute(vectorSeisElementos));
	}
	
	@Test
	//Testeo 1-3-5-6
	public void testNrosPositivos() {
		int[] vector={1,2,5,4,3};
		assertEquals(5,claseExercises.maxAbsolute(vector));
	}

	@Test
	//Testeo 1-3-4-5-6
	public void testNrosNegativos() {
		int[] vector={1,-2,-5,4,3};
		assertEquals(5,claseExercises.maxAbsolute(vector));
	}
	
}
