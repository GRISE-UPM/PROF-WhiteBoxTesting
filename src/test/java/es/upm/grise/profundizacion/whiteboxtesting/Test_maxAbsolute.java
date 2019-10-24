package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

//OSCAR: En este caso, la CC = 4, por lo que 4 casos de prueba son suficientes (o incluso 
//menos, dependiendo del uso que hagamos del for) para alcanzar una cobertura del 100%. 
// De hecho, no parece que los casos estén diseñados desde un punto de vista estructural, 
// sino funcional

public class Test_maxAbsolute {

	Exercises exercises;
	
	@Before
	public void setUp() {
		exercises = new Exercises();
	}
	
	@Test
	public void testLengthGreaterThan5() {
		assertEquals(-1, exercises.maxAbsolute(new int []{1,5,7,1,5,7}));
	}
	
	
	@Ignore
	@Test
	public void testLength0() {
		assertEquals(0, exercises.maxAbsolute(new int[]{}));
	}
	
	@Ignore
	@Test
	public void testLength1() {
		assertEquals(1, exercises.maxAbsolute(new int[]{-1}));
	}
	
	@Test
	public void testNoNegatives() {
		assertEquals(5, exercises.maxAbsolute(new int []{1,5}));
	}
	
	@Test
	public void testAllNegatives() {
		assertEquals(5, exercises.maxAbsolute(new int []{-1,-5}));
	}
	
	@Ignore
	@Test
	public void testSignedAlterned() {
		assertEquals(8, exercises.maxAbsolute(new int []{-1,5,-3,8,-4}));
	}
}
