package es.upm.grise.profundizacion2018.whiteboxtesting;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {
	
	private Exercises exercises;
	
	@Before
	public void beforeTest() {
		this.exercises = new Exercises();
	}
	
	@Test
	public void test_LessThanFive() {
		assertEquals(2/3f, this.exercises.foo1(3, 2),0f);
	}
	
	@Test
	public void test_MoreThanFive() {
		assertEquals(-1/16f, this.exercises.foo1(6, -1),0f);
	}
}
