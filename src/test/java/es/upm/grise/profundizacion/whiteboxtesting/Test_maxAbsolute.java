package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

// OSCAR: De nuevo, CC = 4, aunque 3 casos son suficientes. Los 3 casos adicionales son
// innecesarios, ya que se basan en consideraciones de prueba distintas de los caminos 
// básicos. Esto no quiere decir que sean inútiles, ya que se pueden probar muchas cosas (por
// ejemplo, se podrían hacer pruebas funcionales, o de otro tipo).

public class Test_maxAbsolute {

	//salimos al principio por array muy largo
	@Test
	public void salimosPrincipio() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{ 1,1,1,1,1,1,1 }; 
		
		assertEquals(-1, ejercicio.maxAbsolute(numbers),0.001);	
	}
	
	//llegamos al bucle pero no ejecutamos lo de dentro
	@Test
	public void salimosBucle() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{ }; 
		
		assertEquals(0, ejercicio.maxAbsolute(numbers),0.001);	
	
	}
	
	//llegamos al bucle y ejecutamos solo lo del if
	@Test
	public void bucleIf() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{-1 }; 
		
		assertEquals(1, ejercicio.maxAbsolute(numbers),0.001);	
	}
	
	//llegamos al bucle y ejecutamos solo lo del else
	@Test
	public void bucleElse() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{ 8}; 
		
		assertEquals(8, ejercicio.maxAbsolute(numbers),0.001);	
	}
	/////////////hasta aqui 100% de coverage/////////////
	
	
	
	//con esto esta 100%coverage (cubierto) pero voy a hacer 3 pruebas de verdad
	//porque me da un poco de risa dejarlo asi
	//vamos a probar que efectivamente coge el mayor
	//vamos a hacer 3 pruebas, una en la que son todos positivos, 
	//(es como la ultima pero con un array) 
	//y otras 2 en la que son mezcla, en una saldra uno de los positivos y en la 
	//otra un negativo
	@Ignore
	@Test
	public void arrayPositivo() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{ 5,7,9,2}; 
		
		assertEquals(9, ejercicio.maxAbsolute(numbers),0.001);	
	}
	
	@Ignore
	@Test
	public void arrayMezclaNeg() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{ 5,-7,6,2}; 
		
		assertEquals(7, ejercicio.maxAbsolute(numbers),0.001);	
	}
	
	@Ignore
	@Test
	public void arrayMezclaPos() {
		Exercises ejercicio = new Exercises();
		int[] numbers = new int[]{ 5,-7,8,2}; 
		
		assertEquals(8, ejercicio.maxAbsolute(numbers),0.001);	
	}
	
	
	
}
