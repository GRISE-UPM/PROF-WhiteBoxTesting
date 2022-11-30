package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo2 {

	// Variables usadas para el testing
	private static Exercises exs;
	private float a, b;
	
	// Error de redondeo permitido para las comparaciones
	private float delta = (float) 0.001;
	
	@BeforeAll
	public static void setUp() {
		exs = new Exercises();
	}
	
	@Test
	public void aGreaterThanBAndCosALessThan0() {
		
		// Inicializacion
		a = (float) (0.7*2*Math.PI);
		b = (float) (0.5*2*Math.PI);
		
		// Aseccion
		assertEquals(exs.foo2(a, b), 2);
	}
	
	@Test
	public void aLessOrEqualBAndCosALessThan0() {
		
		// Inicializacion
		a = (float) (0.7*2*Math.PI);
		b = (float) (0.8*2*Math.PI);
		
		// Aseccion
		assertEquals(exs.foo2(a, b), 2);
	}
	
	@Test
	public void aGreaterThanBAndCosAGreaterOrEqual0() {
		
		// Inicializacion
		a = (float) (1.3*2*Math.PI);
		b = (float) (1.2*2*Math.PI);
		
		// Aseccion
		assertEquals(exs.foo2(a, b), (2.5/2)*2*Math.PI, delta);
	}
	
	@Test
	public void aLessOrEqualBAndCosAGreaterOrEqual0() {
		
		// Inicializacion
		a = (float) (0.8*2*Math.PI);
		b = (float) (1.3*2*Math.PI);
		
		// Aseccion
		assertEquals(exs.foo2(a, b), (2.1/2)*2*Math.PI, delta);
	}
}
