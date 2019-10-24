package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

//OSCAR: CC= 4, por lo que sobra un caso

public class Test_foo2 {
	@Ignore
    //Prueba a menor que b
	@Test
	public void testCasoAMenorB() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.5, ejemplo.foo2(0, 3),0);
	}
	
	//Prueba B menor que A
	@Test
	public void testCasoBMenorA() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.5, ejemplo.foo2(3, 0),0);
	}
	//Prueba coseno de A negativo
	@Test
	public void testCosANeg() {
		Exercises ejemplo = new Exercises();
		assertEquals(2.0, ejemplo.foo2(-3, 0),0);
	}
	//Prueba coseno de b menor que 0
	@Test
	public void testCosBMenor0() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.0, ejemplo.foo2(0, 2),0);
	}
	////Prueba coseno de b mayor que 0
	@Test
	public void testCosBMayor0() {
		Exercises ejemplo = new Exercises();
		assertEquals(2.0, ejemplo.foo2(0, 0.1f),0);
	}

}
