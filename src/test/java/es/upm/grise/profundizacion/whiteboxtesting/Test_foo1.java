package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_foo1 {

	//el assert equal le he puesto el parametro delta porque si no
	//dice que esta deprecado
	@Test
	public void test1() {
		Exercises ejercicio = new Exercises();
		assertEquals(1, ejercicio.foo1(2, 2),0.001);	}
	
	@Test
	public void test2() {
		Exercises ejercicio = new Exercises();
		assertEquals(1, ejercicio.foo1(6, 16),0.001);	}

}
