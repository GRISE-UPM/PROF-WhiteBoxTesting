package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void test() {
		Exercises excercise = new Exercises();
		float result = excercise.foo2(10.0f,10.0f);
		System.out.println(result);

		assertEquals(2.0f, excercise.foo2(10.0f,10.0f), 0);
	}

}
