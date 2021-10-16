package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_foo1 {

	@Test
	public void test() {
		Exercises exercises = new Exercises();
		assertEquals(exercises.foo1(10,40),2f,0.0f);
	}

}
