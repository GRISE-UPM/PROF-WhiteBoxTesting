package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {


	@Test
	public void test() throws Exception {
		Exercises excercise = new Exercises();
		assertEquals(0.5f, excercise.foo1(10.0f,10.0f), 0);
	}

}
