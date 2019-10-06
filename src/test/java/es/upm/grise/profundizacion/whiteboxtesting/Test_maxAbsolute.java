package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {
	
	Exercises object;
	
	@Before
	public void setup() {
		object = new Exercises();
	}

	@Test
	public void primerCamino() {
		int [] numeros = {0,1,2,3,4,5};
		assertEquals(object.maxAbsolute(numeros),-1,0);
	}
	
	@Test
	public void segundoCamino() {
		int [] numeros = {0,1,2,3,4};
		assertEquals(object.maxAbsolute(numeros),4,0);
	}
	
	@Test
	public void tercerCamino() {
		int [] numeros = {0,1,2,3,-4};
		assertEquals(object.maxAbsolute(numeros),4,0);
	}
	



}
