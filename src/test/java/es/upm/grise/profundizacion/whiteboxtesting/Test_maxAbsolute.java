package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

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
