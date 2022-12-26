package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_foo1 {
	
	private Exercises e = new Exercises();

	@Test
	public void value0() {
		float x = 0;
		float y = 0;
		assertEquals((float)Double.NaN, e.foo1(x,y));
	}
	
	@Test
	public void numericalValues() {
		float x = 6;
		float y = 8;
		float res = (float) 0.5;
		assertEquals(res, e.foo1(x, y));
	}
	
	//deberia fallar al recibir algo que no es un numero
	@Test
	public void nonNumericalValue() {
		char f = 'a';
		int y = 0;
		assertEquals(0, e.foo1(f, y));
	}

}
