package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {
	
	Exercises object;
	
	@Before
	public void setup() {
		object = new Exercises();
	}

	@Test
	public void primerCamino() {
		float a = 2f;
		float b = 1f;
		assertEquals(object.foo2(a, b), 1.5f,0);
	}
	
	@Test
	public void segundoCamino() {
		float a = 1f;
		float b = 2f;
		assertEquals(object.foo2(a, b), 1.5f,0);
	}

	@Test
	public void tercerCamino() {
		float a = 180f;
		float b = 270f;
		assertEquals(object.foo2(a, b), 2f,0);
	}
	
	@Test
	public void cuartoCamino() {
		float a = 1f;
		float b = 1f;
		assertEquals(object.foo2(a, b), 2f,0);
	}
}
