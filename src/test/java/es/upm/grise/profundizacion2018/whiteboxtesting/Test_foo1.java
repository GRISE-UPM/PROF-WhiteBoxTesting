package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class Test_foo1 {
	
	private Exercises ex;
	
	@Before
	public void loadClass() {
		ex = new Exercises();
	}

	@Test
	public void xGreaterThanFive() {
		assertEquals(ex.foo1(10, 100), 5, 0.001);
	}
	
	@Test
	public void xLessThanFive() {
		assertEquals(ex.foo1(2, 24), 12, 0.001);
	}

}
