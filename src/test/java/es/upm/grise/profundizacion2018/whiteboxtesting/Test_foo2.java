package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises exer= new Exercises();
	@Test
	public void foo2_1() {
		assertEquals(2, exer.foo2(0,0));
	}
	
	@Test
	public void foo2_2() {
		assertEquals(1, exer.foo2(2,1));
	}
	
	@Test
	public void foo2_3() {
		assertEquals(2, exer.foo2(10,10));
	}
	
}
