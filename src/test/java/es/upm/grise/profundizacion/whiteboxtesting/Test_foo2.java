package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo2 {
	//El flowchart nos da 5 casos de pruebas. Dos del segundo nodo y cuatro del séptimo nodo, se hacer una intersección entre ellos.
	private Exercises e = new Exercises();
	static final float PI = (float) Math.PI;

	//Primera branch de la primera condición. Primera branch de la segunda condición.
	@Test
	public void AmayorB_Y_TRUE_TRUE() {
		
		assertEquals(2,e.foo2(4*PI/3,PI));

	}
	//Segunda branch de la primera condición. Segunda branch de la segunda condición.
	@Test
	public void AmenorB_Y_TRUE_FALSE() {
		
		assertEquals(2,e.foo2(PI, 3* PI));

	}
	//FOO. Tercera branch segunda condición .
	@Test
	public void FOO_Y_FALSE_TRUE() {
		
		assertEquals(2,e.foo2(0, 2* PI));

	}
	//FOO. Cuarta branch segunda condición .
	@Test
	public void FOO_Y_FALSE_FALSE() {
		
		double res = (4*PI/3)/2;
		assertEquals(res,e.foo2(0, 4*PI/3));

	}

}
