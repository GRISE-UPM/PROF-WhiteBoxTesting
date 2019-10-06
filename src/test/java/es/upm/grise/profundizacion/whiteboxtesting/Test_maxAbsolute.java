package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
    //Prueba máximo igual a 4
	@Test
	public void testCasoNormal() {
		Exercises ejemplo = new Exercises();
		int [] arrayPrueba= {0,1,2,3,4};
		assertEquals(4, ejemplo.maxAbsolute(arrayPrueba));
	}
	//Prueba longitud mayor a la permitida
	@Test
	public void testPrimerIf() {
		Exercises ejemplo = new Exercises();
		int [] arrayPrueba= {0,1,2,3,4,5};
		assertEquals(-1, ejemplo.maxAbsolute(arrayPrueba));
	}
	//Prueba con número negativo
	@Test
	public void testNegativo() {
		Exercises ejemplo = new Exercises();
		int [] arrayPrueba= {0,1,2,3,-5};
		assertEquals(5, ejemplo.maxAbsolute(arrayPrueba));
	}

}
