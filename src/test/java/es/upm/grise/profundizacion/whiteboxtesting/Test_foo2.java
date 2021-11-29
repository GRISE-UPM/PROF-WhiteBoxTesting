package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {


	Exercises excercise = new Exercises();

	@Test
	public void test1() {


		assertEquals(2.0f, excercise.foo2(10.0f,10.0f), 0);
	}

	@Test
	public void test2() {

		assertEquals(2.0f, excercise.foo2(10.0f,8.0f), 0);
	}

}
