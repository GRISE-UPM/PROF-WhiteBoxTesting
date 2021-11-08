package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo2 {
	private float a;
	private float b;
	Exercises f = new Exercises();
	@Test
	public void testAmayorBcosAMenorQue0() {
		a = 10;
		b = 9;
		assertEquals(f.foo2(a, b), 2, 0);


	}
	@Test
	public void testAmenorBcosAMenorQue0() {
		a = 9;
		b = 10;
		assertEquals(f.foo2(a, b), 2, 0);

	}

	@Test
	public void testAmenorBSinCondCos() {
		a = 21;
		b = 11;
		assertEquals(f.foo2(a, b), (a+b)/2, 0);

	}

	@Test
	public void testCosAMayorQue0CosBMenorQue0() {
		a = 11;
		b = 21;
		assertEquals(f.foo2(a, b), (a+b)/2, 0);

	}
}
