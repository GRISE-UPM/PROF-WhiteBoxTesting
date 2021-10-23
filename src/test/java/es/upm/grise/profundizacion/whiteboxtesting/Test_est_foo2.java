package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_est_foo2 {

	// Math.cos(double x) -> x in radians
	// Math.toRadians(double x) -> x in degrees

	@BeforeAll
	public static void setUp() {
		System.out.println("Setting up foo2 structural test...");
	}

	/*
	 * 1 - a > b
	 * 2 - b <= a
	 * 3 - Math.cos(a) < 0
	 * 4 - Math.cos(b) > 0
	 * 5 - Math.cos(a) >= 0 and Math.cos(b) <= 0
	 *
	 *       ___|___
	 *      /       \
	 *     1         2
	 *   / | \     / | \
	 *  3  4  5 | 3  4  5
	 */

	@Test
	@DisplayName("Test in which a > b, a <-> b, and cosine(b) < 0")
	public void a_bigger_b_and_cos_b_less_0() {
		float a = (float) Math.toRadians(125);
		float b = (float) Math.toRadians(115);

		assertEquals(2.0, (new Exercises()).foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test in which a > b, a <-> b, and cosine(a) > 0")
	public void a_bigger_b_and_cos_a_bigger_0() {
		float a = (float) Math.toRadians(50);
		float b = (float) Math.toRadians(45);

		assertEquals(2.0, (new Exercises()).foo2(a, b), 0.01);
	}
	
	@Test
	@DisplayName("Test in which a > b, a <-> b, and cosine(a) < 0 and cosine(b) > 0")
	public void a_bigger_b_and_cos_b_bigger_0_and_cos_a_less_0() {
		float a = (float) Math.toRadians(125);
		float b = (float) Math.toRadians(45);

		assertEquals(1.4835, (new Exercises()).foo2(a, b), 0.01);
	}


	@Test
	@DisplayName("Test in which a > b and cosine(a) < 0")
	public void a_smaller_eq_b_and_cos_a_less_0() {
		float a = (float) Math.toRadians(120);
		float b = (float) Math.toRadians(150);

		assertEquals(2.0, (new Exercises()).foo2(a, b), 0.01);		
	}

	@Test
	@DisplayName("Test in which a > b and cosine(b) > 0")
	public void a_smaller_eq_b_and_cos_b_bigger_0() {
		float a = (float) Math.toRadians(30);
		float b = (float) Math.toRadians(300);

		assertEquals(2.0, (new Exercises()).foo2(a, b), 0.01);		
	}

	@Test
	@DisplayName("Test in which a > b, cosine(a) > 0 and cosine(b) < 0")
	public void a_smaller_eq_b_and_cos_a_bigger_0_and_cos_b_less_0() {
		float a = (float) Math.toRadians(150);
		float b = (float) Math.toRadians(300);

		assertEquals(2.0, (new Exercises()).foo2(a, b), 0.01);		
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("foo2 structural tests done.");
	}
}
