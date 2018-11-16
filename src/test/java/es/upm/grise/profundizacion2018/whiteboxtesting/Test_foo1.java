package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises ex = new Exercises();



	@Test
	public void xMinor5(){
		assertEquals(5,ex.foo1(2,10),0.00);
	}

	@Test
	public void xMajor5(){
		float a = 10f;
		float b = 16f;
		//assertEquals(a/b, ex.foo1(6,10),0.00);
		assertEquals(10f/16f, ex.foo1(6,10),0.00);
	}

}
