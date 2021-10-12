package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo2 {


	@Test
	@DisplayName("foo2: a es mayor que b, se cumplen las dos condiciones")
	public void whenAisGreaterThanBAndACosenNegative_thenReturns2() {
		Exercises foo2 = new Exercises();
		int a = 6;
		int b = 4;
		assertEquals(2, foo2.foo2(a, b));
	}

	@Test
	@DisplayName("foo2: a es menor que b, no se cumple ninguna condicion")
	public void whenAisLessThanB_thenReturns15() {
		Exercises foo2 = new Exercises();
		int a = 14;
		int b = 16;
		assertEquals(15, foo2.foo2(a, b));
	}

	@Test
	@DisplayName("foo2: a es menor que b, se cumple la segunda condicion")
	public void whenAisLessThanBAndACosenNegative_thenReturns2() {
		Exercises foo2 = new Exercises();
		int a = 2;
		int b = 3;
		assertEquals(2, foo2.foo2(a, b));
	}

}
