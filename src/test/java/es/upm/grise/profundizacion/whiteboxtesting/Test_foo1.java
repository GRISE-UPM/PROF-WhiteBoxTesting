package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.Test;


public class Test_foo1 {

	@Test
	public void xmayorquecinco() {
		Exercises ex = new Exercises();
		float result = ex.foo1(10,40);
		assertEquals(2.0f, result,0.0f);
	}
	
	@Test
	public void xmenorquecinco() {
		Exercises ex = new Exercises();
		float result = ex.foo1(4, 2);
		assertEquals(0.5f,result,0.0f);	
	}
	
	@Test
	public void yescero() {
		Exercises ex = new Exercises();
		float result = ex.foo1(6, 0);
		assertEquals(0.0f,result,0.0f);	
	}
	

}
