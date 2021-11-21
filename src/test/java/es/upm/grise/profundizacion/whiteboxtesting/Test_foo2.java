package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_foo2 {

	@Test
	public void testBmayorA() {
		Exercises exercises = new Exercises();
		assertEquals(exercises.foo2(10,40),2f,0.0f);
	}
	@Test
	public void testAmayorB() {
		Exercises exercises = new Exercises();
		assertEquals(exercises.foo2(40,10),25f,0.0f);
	}

}
