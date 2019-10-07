package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises excercises = new Exercises();

	//Ejecuta la rama (X <= 5)
	@Test
	public void test1() {
		assertEquals(5,excercises.foo1(2,10),0.0);
	}
	
	//Ejecuta la rama (X > 5)
	@Test
	public void test2() {
		assertEquals(1,excercises.foo1(10,20),0.0);
	}

}
