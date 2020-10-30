package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises claseExercises = new Exercises();
	
	@Test
	public void testXMayorCinco() {
		//1-2-3
		assertEquals(0.5,claseExercises.foo1(10,10),0);
	}
	
	@Test	
	public void testXMenorCinco() {
		//1-3
		assertEquals(10.0,claseExercises.foo1(1,10),0);
	}
}
