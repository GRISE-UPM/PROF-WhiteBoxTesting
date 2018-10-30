package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {

	private Exercises exercises;

	@Before
	public void setUp(){
		exercises = new Exercises();
	}

	@Test
	public void test_x_greater_than_5_and_y_any() {
		float result = exercises.foo1(6, 16);
		assertEquals(result,1, 0f);
	}

	@Test
	public void test_x_lower_than_5_and_y_any() {
		float result = exercises.foo1(1, 1);
		assertEquals(result,1, 0f);
	}



}
