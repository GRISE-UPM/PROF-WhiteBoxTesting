package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_foo1 {
	
	private Exercises e = new Exercises();

	@Test
	public void testXMenor5() {
		float x = 0;
		float y = 0;
		assertEquals(Float.NaN, e.foo1(x, y));
	}
	
	@Test
	public void testXIgual5() {
		float x = 5;
		float y = 2;
		assertEquals((float)0.4, e.foo1(x, y));
	}
	
	@Test
	public void testXMayor5() {
		float x = 6;
		float y = 8;
		assertEquals((float)0.5, e.foo1(x, y));
	}

}
