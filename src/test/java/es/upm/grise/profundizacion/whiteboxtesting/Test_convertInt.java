package es.upm.grise.profundizacion.whiteboxtesting;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test_convertInt {

	@Test
	public void testNumberPositive() {
		Exercises exercises = new Exercises();
		convertInt convertInt = exercises.new convertInt();
		char [] a = new char[1];
		a[0] = '5';
		try {
			assertEquals(convertInt.convert(a),5);
		} catch (Exception e) {
			fail("Salto excepcion");
			e.printStackTrace();
		}

	}
	@Test
	public void testNumberNegative() {
		Exercises exercises = new Exercises();
		convertInt convertInt = exercises.new convertInt();
		char [] a = new char[2];
		a[0] = '-';
		a[1] = '5';
		try {
			assertEquals(convertInt.convert(a),-5);
		} catch (Exception e) {
			fail("Salto excepcion");
			e.printStackTrace();
		}

	}
	@Test
	public void testNumberLengthException() {
		Exercises exercises = new Exercises();
		convertInt convertInt = exercises.new convertInt();
		char [] a = new char[7];
		a[0] = '-';
		a[1] = '5';
		a[2] = '4';
		a[3] = '6';
		a[4] = '7';
		a[5] = '9';
		a[6] = '3';
			assertThrows(Exception.class, () -> convertInt.convert(a));
	}

	@Test
	public void testNumberBigException() {
		Exercises exercises = new Exercises();
		convertInt convertInt = exercises.new convertInt();
		char [] a = new char[6];
		a[0] = '-';
		a[1] = '5';
		a[2] = '4';
		a[3] = '6';
		a[4] = '7';
		a[5] = '9';
		assertThrows(Exception.class, () -> convertInt.convert(a)
		);
	}

}
