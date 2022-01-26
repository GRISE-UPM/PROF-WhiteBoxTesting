package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class Test_foo2 {

	private Exercises ex = new Exercises();

	@BeforeEach
	public void beforeEach() {
		System.out.println("Nuevo test_foo2:");
	}


	@Test
	@DisplayName("a>b")
	public void foo2_test1() {
		assertEquals(7.5, ex.foo2(10,5), 0);
	}

	@Test
	@DisplayName("a<b, segundo if se cumple")
	public void foo2_test2() {
		assertEquals(2, ex.foo2(-1, 5), 0);
	}

	@Test
	@DisplayName("a<b, segondo if no se cumple")
	public void foo2_test3() {
		assertEquals(7.5, ex.foo2(5, 10), 0);
	}


}
