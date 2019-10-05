package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class Test_convertInt {

	////////////////////////////////////////////////// RANDOMIZATION ///////////////////////////////////////////////////

	private static final Random random = new SecureRandom();

	///////////////////////////////////////////////////// TESTING //////////////////////////////////////////////////////

	private Exercises.convertInt convertInt = new Exercises().new convertInt();

	@Test
	public void test_exception() {
		char[] str = new char[7 + random.nextInt(Short.MAX_VALUE - 6)];
		try {
			convertInt.convert(str);
		} catch (Exception e) {
			assertEquals(e.getClass(), Exception.class);
		}
	}

	@Test
	public void test_out_of_bounds() {
		char[] str = new char[0];
		try {
			convertInt.convert(str);
		} catch (Exception e) {
			assertTrue(e instanceof ArrayIndexOutOfBoundsException);
		}
	}

	@Test
	public void test_sum_too_big() {
		char min_pos = ( Short.MAX_VALUE / 6) + 1;
		char min_neg = (-Short.MIN_VALUE / 5) + 1;
		char[] pos = new char[6];
		char[] neg = new char[6];
		for (int i = 0; i < pos.length; i++) {
			pos[i] = min_pos;
			neg[i] = min_neg;
		}
		neg[0] = '-';
		// Testing logic
		try {
			convertInt.convert(pos);
			fail("An exception should be thrown");
		} catch (Exception e) {
			assertEquals(e.getClass(), Exception.class);
		}
		try {
			convertInt.convert(neg);
			fail("An exception should be thrown");
		} catch (Exception e) {
			assertEquals(e.getClass(), Exception.class);
		}
	}

	// (((((x)*10+x)*10+x)*10+x)*10+x)*10+x > 2^31-1 => 111111x > Integer.MAX_VALUE
	// x > Integer.MAX_VALUE / 111111 => Guaranteed integer overflow
	@Test
	public void test_overflow() {
		char min = Integer.MAX_VALUE / 111111 + 1;
		char[] str = new char[]{ min, min, min, min, min, min };
		try {
			convertInt.convert(str);
		} catch (Exception e) {
			assertEquals(e.getClass(), Exception.class);
		}
	}

	@Test
	public void test_valid() {
		char[] positivos = new char[] {  Short.MAX_VALUE, (char) random.nextInt(Short.MAX_VALUE)     };
		char[] negativos = new char[] { -Short.MIN_VALUE, (char) random.nextInt(Short.MAX_VALUE + 1) };
		try {
			for (char pos : positivos) {
				int result = convertInt.convert(new char[]{pos});
				assertEquals((int) pos, result);
			}
			for (char neg : negativos) {
				int result = convertInt.convert(new char[]{'-', neg});
				assertEquals(-1 * neg, result);
			}
		} catch (Exception e) {
			fail("An exception should not be thrown when the number is in the numeric range of a Short.");
		}
	}

}
