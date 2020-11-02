package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {

	Exercises e1;
	@Before
	public void conf() {
		e1 = new Exercises();
	}
	
	@Test
	public void testXbig() {
		assertEquals(2,e1.foo1(6, 32));
	}
	
	@Test
	public void testXsmall() {
		assertEquals(32,e1.foo1(1, 32));
		
	}
	
	

}
