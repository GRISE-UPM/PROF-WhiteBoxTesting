package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {


	@Test
	@DisplayName("foo1: cuando x es menor que 5 e y=10")
	public void whenXis4AndYvalues10_thenReturn2() {
		Exercises foo1 = new Exercises();
		assertEquals(2.5, foo1.foo1(4, 10) );
	}

	@Test
	@DisplayName("foo1: cuando x es mayor que 5 e y=10")
	public void whenXis6AndYvalues10_thenReturn0625() {
		Exercises foo1 = new Exercises();
		assertEquals(0.625, foo1.foo1(6, 10) );
	}

}
