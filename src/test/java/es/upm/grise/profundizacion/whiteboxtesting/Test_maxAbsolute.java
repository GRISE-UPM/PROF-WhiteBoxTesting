package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {
	
	private static Exercises exercise;

	@BeforeAll
	public static void before() {
		exercise = new Exercises();
	}

	@Test
	public void test_maxAbsolute_array_3() {
		assertEquals(3,exercise.maxAbsolute(new int [] {1,2,3}));
	}
	
	@Test
	public void test_maxAbsolute_array_vacio() {
		assertEquals(0,exercise.maxAbsolute(new int [] {}));
	}
	
	@Test
	public void test_maxAbsolute_array_negativos() {
		assertEquals(3,exercise.maxAbsolute(new int [] {-1,-2,-3}));
	}
	
	@Test
	public void test_maxAbsolute_array_size6() {
		assertEquals(-1,exercise.maxAbsolute(new int [] {-1,-2,-3,2,3,1}));
	}

}
