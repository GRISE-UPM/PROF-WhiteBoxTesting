package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class Test_foo1 {
	
	Exercises object;
	
	@Before
	public void setup() {
		object = new Exercises();
	}

	@Test
	public void primerCamino() {
		float x = 6f;
		float y = 1f;
		assertEquals(object.foo1(x, y),0.0625,0);
	}
	
	@Test
	public void segundoCamino() {
		float x = 4f;
		float y = 1f;
		assertEquals(object.foo1(x, y),0.25,0);
	}
	


}
