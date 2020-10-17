package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises claseExercises = new Exercises();
	float pi = (float)Math.PI;
	
	@Test
	public void testAMayorB() {
	//a mayor que b: 1-2-3
		assertEquals(2,claseExercises.foo2(pi/3,0),0.001);
	}
	
	@Test
	public void testAMenorB() {
	//a menor que b: 1-3
		assertEquals(2,claseExercises.foo2(0,pi/3),0.001);
	}

	@Test
	public void testCosAMenor0yCosBMayorCero() {
	//V || V = V: 1-3(-4)-5-6
		assertEquals(2,claseExercises.foo2(pi,2*pi),0.001); 
	}	
	
	@Test
	public void testCosAMenor0yCosBMenorCero() {
	//V || F = V : 1-3(-4)-5-6
		assertEquals(2,claseExercises.foo2(pi,pi),0.001); 
	}
	
	@Test
	public void testcosAMayorCeroyCosBMayorCero() {
	//F || V = V : 1-3-4-5-6
		assertEquals(2,claseExercises.foo2(0,2*pi),0.001);
	}	

	@Test
	public void testcosAMayorCeroyCosBMenorCero() {
	//F || F = F : 1-3-4-6
		assertEquals(pi/2,claseExercises.foo2(0,pi),0.001);
	}		
		
}
