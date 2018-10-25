package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void aMayorBcosAMenor0() {
		float b = 8; //cos(8) = 0,99
		float a = 10;
		assertEquals(2,Exercises.foo2(a,b),0.01);
	}
}
