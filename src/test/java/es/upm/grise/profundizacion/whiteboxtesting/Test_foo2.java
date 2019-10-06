package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void testCasoAMenorB() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.5, ejemplo.foo2(0, 3),0);
	}
	@Test
	public void testCasoBMenorA() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.5, ejemplo.foo2(3, 0),0);
	}
	@Test
	public void testCosANeg() {
		Exercises ejemplo = new Exercises();
		assertEquals(2.0, ejemplo.foo2(-3, 0),0);
	}
	@Test
	public void testCosBMenor0() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.0, ejemplo.foo2(0, 2),0);
	}
	@Test
	public void testCosBMayor0() {
		Exercises ejemplo = new Exercises();
		assertEquals(2.0, ejemplo.foo2(0, 0.1f),0);
	}

}
