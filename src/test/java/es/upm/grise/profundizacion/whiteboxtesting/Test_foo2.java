package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import java.lang.Math;

import org.junit.Test;

public class Test_foo2 {
	Exercises ej1 = new Exercises();
	@Test
	public void test1() { // Caso a > b
		float a1 = 1;
		float b1 = 0;
		assertEquals(ej1.foo2(a1, b1), 2, 0);
	}
	@Test
	public void test2(){ // Caso a < b
		float a2 = 3;
		float b2 = 4;
		assertEquals(ej1.foo2(a2,b2), 2,0);
		assertNotEquals(3,ej1.foo2(a2,b2));
	}
	@Test
	public void test3(){ // Caso de no entrar en el if de los cosenos
		double a3 = (-60 * Math.PI /180);
		double b3 = (180 * Math.PI /180);
		assertEquals(ej1.foo2(a3,b3), 1.0471975511965979,0);
	}

}
