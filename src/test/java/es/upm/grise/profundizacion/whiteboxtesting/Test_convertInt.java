package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_convertInt {

	// Variables usadas para el testing
	private static Exercises exs;
	private static Exercises.convertInt ci;
	private char[] str;
	
	@BeforeAll
	public static void setUp() {
		exs = new Exercises();
		ci = exs.new convertInt();
	}
	
	@Test
	public void strLengthGreaterThan6() {
		
		// Inicializacion
		str = new char[]{'1', '2', '3', '4', '5', '6', '7'};
		
		// Asercion
		assertThrows(Exception.class, () ->{
			ci.convert(str);
		});
	}
	
	@Test
	public void positiveNumber() {
		
		// Inicializacion
		str = new char[]{'1', '2', '3', '4', '5'};
		
		// Asercion
		try {
			assertEquals(ci.convert(str), 12345);
		} catch (Exception e) {
			fail("No debería haber lanzado la excepción " + e.toString());
		}
	}
	
	@Test
	public void negativeNumber() {
		
		// Inicializacion
		str = new char[]{'-', '1', '2', '3', '4', '5'};
		
		// Asercion
		try {
			assertEquals(ci.convert(str), -12345);
		} catch (Exception e) {
			fail("No debería haber lanzado la excepción " + e.toString());
		}
	}
	
	@Test
	public void veryBigNumber() {
		
		// Inicializacion
		str = new char[]{'3', '2', '7', '6', '8'};
		
		// Asercion
		assertThrows(Exception.class, () ->{
			ci.convert(str);
		});
	}
	
	@Test
	public void verySmallNumber() {
		
		// Inicializacion
		str = new char[]{'-', '3', '2', '7', '6', '9'};
		
		// Asercion
		assertThrows(Exception.class, () ->{
			ci.convert(str);
		});
	}
}
