package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {

	private Exercises exercises;

	@Before
	public void setUp() {
		exercises = new Exercises();
	}

	@Test
	public void test_a_is_lower_than_b() {
		float result = exercises.foo2(1,2);
		assertEquals(result,1.5, 0f);
	}

	@Test
	public void test_a_is_greater_than_b_and_cos_a_is_lower_than_Zero_And_cos_b_is_greater_than_0() {
		float result = exercises.foo2(360,180);
		assertEquals(result,2, 0f);
	}

}
