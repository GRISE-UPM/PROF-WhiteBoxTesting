package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {

	@BeforeAll
	public void beforeAll() {
		System.out.println("--foo1 Tests--");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Nuevo test:");
	}

	@Test
	@DisplayName("x>5 returns y/(x + 10)")
	public void xBigger5() {
		Exercises exercises = new Exercises();
		float x = 6;
		float y = 3;
		float expected = y/(x+10);

		assertEquals(expected, exercises.foo1(x,y), 0);
;	}

	@Test
	@DisplayName("x<5 returns y/x")
	public void xSmaller5() {
		Exercises exercises = new Exercises();
		float x = 4;
		float y = 3;
		float expected = y/x;

		assertEquals(expected, exercises.foo1(x,y), 0);
	}

}
