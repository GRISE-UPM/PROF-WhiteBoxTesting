package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Assert;
import org.junit.Test;

public class Test_convertInt {

	Exercises.convertInt convertInt = new Exercises().new convertInt();


	@Test
	public void testConvertirIntOverflow() {
		try {
			convertInt.convert(new char[] {'8','8','8','8','8','8', '8'});
			Assert.fail("Exception was not thrown when converting an overflow!");

		}
		catch (Exception e) {
			// We would normally throw an actual exception with information and perform checks over e here but alas we suck
		}

	}

	@Test
	public void testConvertirIntPositive() {
		try {
			Assert.assertEquals(123, convertInt.convert(new char[] {'1','2','3'}));

		}
		catch (Exception e) {
			Assert.fail(String.format("Unexpected exception thrown! {}", e));

		}

	}

	@Test
	public void testConvertirIntNegative() {
		try {
			Assert.assertEquals(-123, convertInt.convert(new char[] {'-', '1','2','3'}));

		}
		catch (Exception e) {
			Assert.fail(String.format("Unexpected exception thrown! {}", e));

		}

	}


	@Test
	public void testConvertirIntNumberTooLarge() {
		try {
			convertInt.convert(new char[] {'9','9','9','9','9'});
			Assert.fail("Exception was not thrown when converting a number OOB!");

		}
		catch (Exception e) {
			// We would normally throw an actual exception with information and perform checks over e here but alas we suck

		}

	}

	@Test
	public void testConvertirIntNumberTooSmall() {
		try {
			convertInt.convert(new char[] {'-', '9','9','9','9','9'});
			Assert.fail("Exception was not thrown when converting a number OOB!");

		}
		catch (Exception e) {
			// We would normally throw an actual exception with information and perform checks over e here but alas we suck

		}

	}

	@Test
	public void testConvertirIntNaN() {
		try {
			// Are we sure this class functions correctly? Why are we able to convert non numbers? It's just grabbing the ASCII code and taking away the code of 0 with no bounds check???
			Assert.assertEquals(-49, convertInt.convert(new char[] {'-', 'a'}));

		}
		catch (Exception e) {
			Assert.fail("Unexpected (?) exception was thrown when converting a non number string!!");

			// We would normally throw an actual exception with information and perform checks over e here but alas we suck

		}

	}


}
