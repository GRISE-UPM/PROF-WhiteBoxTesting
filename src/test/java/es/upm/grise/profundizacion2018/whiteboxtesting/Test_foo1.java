package es.upm.grise.profundizacion2018.whiteboxtesting;

//import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class Test_foo1 {

	Exercises exer= new Exercises();
	
	@Test
	public void foo1_1() {
		assertEquals(0, exer.foo1(1,0));
	}
	
	@Test
	public void foo1_2() {
		assertEquals(1, exer.foo1(6,16));
	}
	
}
