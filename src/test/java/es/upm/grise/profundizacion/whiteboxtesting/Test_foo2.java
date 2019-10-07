package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	
	Exercises exercises = new Exercises();

	
	// No ejecuta ninguna rama
	// 
	// cos(30) = 0.15
	// cos(60) = -0.95
	@Test
	public void test_nobranch() {
		float a = 30, b = 60;
		
		assertEquals(45,exercises.foo2(a, b),0.0); 
	}

	
	// Ejecuta la rama: (a>b)
	//
	// cos(2) = -0.41
	// cos(0) = 1.0
	@Test
	public void test_branch2() {
		float a = 2, b = 0;

		assertEquals(1,exercises.foo2(a, b),0.0);
	}
	
	
	// Ejecuta la rama: (Math.cos(a) < 0)
	// 
	// cos(2) = -0.41
	@Test
	public void test_branch3() {
		float a = 2, b = 2;
		
		assertEquals(2,exercises.foo2(a,b),0.0);
	}
	
	
	// Ejecuta las ramas: (a > b) y (Math.cos(b) > 0)
	//
	// cos(0) = 1.0
	// cos(30) = 0.15
	@Test
	public void test_branch4() {
		Exercises exercises = new Exercises();
		float a = 30, b = 0;
		
		assertEquals(2,exercises.foo2(a,b),0.0);
	}
}
