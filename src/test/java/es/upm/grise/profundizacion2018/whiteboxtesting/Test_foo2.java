package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();

	@Test
	public void test_IntercambioYVerdaderoCos1() {
		assertEquals(ex.foo2((float)Math.toRadians(360), (float)Math.toRadians(0)), 2, 0.01);
	}
	
	@Test
	public void test_VerdaderoCos2() {		
		assertEquals(ex.foo2((float)Math.toRadians(180), (float)Math.toRadians(360)), 2, 0.01);
	}
	
	@Test
	public void test_VerdaderoCos3() {		
		assertEquals(ex.foo2((float)Math.toRadians(0), (float)Math.toRadians(-180)), 2, 0.01);
	}
	
	@Test
	public void test_FalsoCos1() {		
		assertEquals(ex.foo2((float)Math.toRadians(-360), (float)Math.toRadians(-180)), (float)-4.71, 0.01);
	}
}
 