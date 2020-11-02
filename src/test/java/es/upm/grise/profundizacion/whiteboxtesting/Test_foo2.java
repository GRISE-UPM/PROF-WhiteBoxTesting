package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {

	Exercises e1;
	
	@Before
	public void conf() {
		e1 = new Exercises();
	}
	
	@Test
	public void testBBigerThanA() {
		assertEquals(2F,e1.foo2(0F, 1F));
	}
	
	@Test
	public void testCheckingCos1() {
		assertTrue(e1.foo2((float)Math.PI/2, 0F)>0.7);
	}
	
	@Test
	public void testCheckingCos2() {
		assertEquals(2F,e1.foo2(5F, 4F));
	}

}
