package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_convertInt {
	
	private Exercises e = new Exercises();
	private Exercises.convertInt c = e.new convertInt();
	private char [] arr;

	@Test
	public void numericalValues() {
		arr = new char[2];
		arr[0] = '0';
		arr[1] = '2';
		try {
			assertEquals(2, c.convert(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void nonNumericalValue() {
		arr = new char[2];
		arr[0] = 'r';
		arr[1] = 't';
		try {
			assertEquals(728, c.convert(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void nullValue() {
		try {
			assertThrows(Exception.class, () -> c.convert(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
