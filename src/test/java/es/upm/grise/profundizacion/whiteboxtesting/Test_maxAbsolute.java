package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_maxAbsolute {

	@Test
	@DisplayName("maxAbsolute: se cumple la primera condicion")
	public void whenALengthisGreaterThan5() {
		Exercises maxAbsolute = new Exercises();
		int[] a = new int[10];
		assertEquals(-1, maxAbsolute.maxAbsolute(a));
	}

	@Test
	@DisplayName("maxAbsolute: se cumple la segunda condicion")
	public void whenAllAreNegative() {
		Exercises maxAbsolute = new Exercises();
		int[] a = new int[2];
		a[0]=-1;
		a[1]=-2;
		assertEquals(2, maxAbsolute.maxAbsolute(a));
	}

	@Test
	@DisplayName("maxAbsolute: se cumple la tercera condicion")
	public void whenAllArePositive() {
		Exercises maxAbsolute = new Exercises();
		int[] a = new int[2];
		a[0]=10;
		a[1]=20;
		assertEquals(20, maxAbsolute.maxAbsolute(a));
	}



}
