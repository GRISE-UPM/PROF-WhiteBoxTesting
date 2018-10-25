package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {
	
	private Exercises exercises;
	
	@Before
	public void beforeTest() {
		exercises = new Exercises();
	}

	@Test
	public void test1() {
		assertEquals((float)2/3,this.exercises.foo1(3, 2),0);
	}
	
	@Test
	public void test2() {
		assertEquals((float)-1/16,this.exercises.foo1(6, -1),0);
	}

}
