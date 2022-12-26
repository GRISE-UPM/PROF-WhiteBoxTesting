package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_foo2 {
	
	private Exercises e = new Exercises();

	@Test
	public void valoresNumericos() {
		float a = 8;
		float b = 5;
		assertEquals((float) 6.5, e.foo2(a, b));
	}

	@Test
	public void valoresNoNumericos() {
		char a = 'r';
		char b = 't';
		assertEquals(115, e.foo2(a, b));
	}
}
