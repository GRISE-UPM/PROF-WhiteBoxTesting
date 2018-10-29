package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {
	
	private Exercises exercises;
	
	@Before
	public void beforeTest() {
		this.exercises = new Exercises();
	}
	
	@Test
	public void test1() {
		assertEquals(2f, this.exercises.foo2(1, 5),0f);
	}	
	@Test
	public void test2() {
		assertEquals(2f, this.exercises.foo2(10, 3),0f);
	}	
	@Test
	public void test3() {
		assertEquals(2f, this.exercises.foo2((float)Math.PI, 8),0f);
	}
	@Test
	public void test4() {
		assertEquals((float)Math.PI/2f, this.exercises.foo2(0, (float)Math.PI),0f);
	}

}
