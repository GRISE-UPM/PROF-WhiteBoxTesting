package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_convertInt {

	private Exercises e = new Exercises();
	private Exercises.convertInt ci = e.new convertInt();

	@Test
	public void onStrLengthGreaterThan6() {
		assertThrows(Exception.class, () -> ci.convert(new char[]{ '1','2','3','4','5','6','7' }));
 	}
	
	@Test
	public void onPositiveNumber() throws Exception {
		assertEquals(23456, ci.convert(new char[]{ '2','3','4','5','6' }));
 	}
	
	@Test
	public void onNegativeNumber() throws Exception {
		assertEquals(-23456, ci.convert(new char[]{ '-','2','3','4','5','6' }));
 	}
	
	@Test
	public void onNoCharNumbers() throws Exception {
		/* This fails because it tries to access str[0] without checking there is actually
		 * a value at position 0 (that is, that length is at least 1).
		 * And because there is no throw new Exception(); I assume this was not considered
		 * and I shouldn't use assertThrows but assertEquals and let the test fail
		 * to alert something is not right */
		assertEquals(0, ci.convert(new char[]{ }));
	}
	
	@Test
	public void onDashCharNumber() throws Exception {
		/* Here we pass '-' which sets i = 1 so we won't go through
		 * our for loop (i=1;i<1;i++) given we have length 1
		 * so we return 0 */
		assertEquals(0, ci.convert(new char[]{ '-' }));
	}
	
	@Test
	public void onGreaterThanAllowed() {
		/* 666666 */
		assertThrows(Exception.class, () -> ci.convert(new char[]{ '6','6','6','6','6','6' }));
 	}
	
	@Test
	public void onLowerThanAllowed() {
		/* This should be tested too in my opinion, as we want to know not only that the exception
		 * is correctly thrown, but that it is thrown when it should be thrown (> or <)
		 * The code is equivalent to:
		 * if (number > 32767) 
				throw new Exception();
		 * if (number < -32768) 
			    throw new Exception();
		 */
		/* -66666 */
		assertThrows(Exception.class, () -> ci.convert(new char[]{ '-','6','6','6','6','6' }));
 	}
	
}
