package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
	Exercises ej1 = new Exercises();

	@Test
	public void test1() { //Caso x < 5
		float x1 = 4;
		float y1 = 2;
		Exercises ej1 = new Exercises();
		assertEquals(ej1.foo1(x1, y1), 0.5, 0);
	}
	@Test
	public void test2(){ //Caso x > 5
		float x2 = 6;
		float y2 = 2;
		assertEquals(ej1.foo1(x2,y2), 0.125,0);
	}

}
