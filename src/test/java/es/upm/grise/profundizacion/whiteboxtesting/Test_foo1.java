package es.upm.grise.profundizacion.whiteboxtesting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class Test_foo1 {

	private Exercises ex = new Exercises();

	@BeforeEach
	public void beforeEach() {
		System.out.println("Nuevo test_foo1:");
	}

	@Test
	@DisplayName("x>5")
	public void foo1_test1() {
		assertEquals(0.5, ex.foo1(10,10), 0);
	}

	@Test
	@DisplayName("x<=5")
	public void foo1_test2() {
		assertEquals(2, ex.foo1(5,10), 0);
	}


}
