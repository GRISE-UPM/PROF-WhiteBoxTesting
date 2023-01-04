package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

class TestEcl {

	Exercises ex = new Exercises();


	//Foo1
	@Test
	public void test_foo1_1() {
			assertEquals(0.5, ex.foo1(8, 9), 0.0);
	}
	
	@Test
	public void test_foo1_2() {
			assertEquals(0.5, ex.foo1(4, 2), 0.0);
	}
	//Foo2

	@Test
	public void test_foo2_1() {
			assertEquals(2, ex.foo2(6, 4), 0.0);
	}

	@Test
	public void test_foo2_2() {
			assertEquals(194, ex.foo2(198, 190), 0.0);
	}
	
	@Test
	public void test_foo2_3() {
			assertEquals(2, ex.foo2(186, 3), 0.0);
	}
	
	@Test
	public void test_foo2_4() {
			assertEquals(194, ex.foo2(190, 198), 0.0);
	}
	
	//maxAbsolute
	@Test
	public void test_max_1() {
		int[] a1 = {1,2,3,4,5,6};
		assertEquals(-1, ex.maxAbsolute(a1));
	}
	
	@Test
	public void test_max_2() {
		int[] a1 = {123,4,6,7};
		assertEquals(123, ex.maxAbsolute(a1));
	}

	@Test
	public void test_max_3() {
		int[] a1 = {-123,4,6,7};
		assertEquals(123, ex.maxAbsolute(a1));
	}


	//ConvertInt
	@Test
	public void test_convert_1() throws Exception {
		char[] str1 = {'1','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		assertEquals(12345, conv.convert(str1));

	}

	@Test
	public void test_convert_2() throws Exception {
		char[] str1 = {'1','2','3','4','5', '6', '7'};
		Exercises.convertInt conv = ex. new convertInt();
		Assertions.assertThrows(Exception.class, () -> conv.convert(str1));
	}

	@Test
	public void test_convert_3() throws Exception {
		char[] str1 = {'-', '1','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		assertEquals(-12345, conv.convert(str1));
	}

	@Test
	public void test_convert_4() throws Exception {
		char[] str1 = {'7','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		Assertions.assertThrows(Exception.class, () -> conv.convert(str1));

	}

	@Test
	public void test_convert_5() throws Exception {
		char[] str1 = {'-','7','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		Assertions.assertThrows(Exception.class, () -> conv.convert(str1));

	}
}