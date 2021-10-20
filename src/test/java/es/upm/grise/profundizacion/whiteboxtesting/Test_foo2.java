package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class Test_foo2 {

	@BeforeAll
	public void beforeAll() {
		System.out.println("--foo2 Tests--");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Nuevo test:");
	}

	@Test
	@DisplayName("a>b returns 2")
	public void aBiggerb() {
		Exercises exercises = new Exercises();
		int a = 5;
		int b = 3;

		assertEquals(2, exercises.foo2(a, b), 0);
	}

	@Test
	@DisplayName("a<b returns 2")
	public void aSmallerb() {
		Exercises exercises = new Exercises();
		int a = 3;
		int b = 10;

		assertEquals(2, exercises.foo2(a, b), 0);
	}

}
