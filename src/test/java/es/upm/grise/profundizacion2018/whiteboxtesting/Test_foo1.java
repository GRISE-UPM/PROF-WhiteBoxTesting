package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	private Exercises exer = new Exercises();
	@Test
	public void xHigherThanFive() {
		assertEquals(Math.round(exer.foo1(10, 20)), 1);
	}
	
	@Test
	public void xLowerThanFiveOrEqual() {
		assertEquals(exer.foo1(4, 4), 1, 0.001);
	}

}
