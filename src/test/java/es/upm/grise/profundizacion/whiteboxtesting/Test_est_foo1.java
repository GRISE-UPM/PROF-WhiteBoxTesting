package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_est_foo1 {

	@BeforeAll
	public static void setUp() {
		System.out.println("Setting up foo1 structural test...");
	}

	/* 1 - x > 5
	 * 2 - x <= 5
	 *    _._
	 *   /   \
	 *  1     2
	 */

	@Test
	@DisplayName("Coverage test when a is greater than 5 (a > 5)")
	public void x_bigger5() {
		int x = 10, y = 40;
		assertEquals(2.0, (new Exercises()).foo1(x, y), 0);
	}

	@Test
	@DisplayName("Coverage test when a is less or equals than 5 (a <= 5)")
	public void x_smaller_or_eq_5() {
		int x = 5, y = 30;
		assertEquals(6.0, (new Exercises()).foo1(x, y), 0);
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("foo1 structural tests done.");
	}
}
