package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test_foo1 {

	@Test
	public void Xmenor5() {
		float x = 3;
		float y = 9;
		assertEquals(3,Exercises.foo1(x,y),0.01);
	}
	@Test
	public void Xmayor5() {
		float x = 8;
		float y = 18;
		assertEquals(1,Exercises.foo1(x,y),0.01);
	}
}
