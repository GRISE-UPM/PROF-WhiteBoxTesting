package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

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
