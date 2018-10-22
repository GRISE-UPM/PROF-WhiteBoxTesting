package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

/**
 * Complejidad Ciclomática de 5:
 * para los caminos bastarían con 5 tests, 
 * para evaluar todas las condiciones hacen falta 5 tests
 * (Añadido 1 test extra para la comprobación de array vacío por 0)
 */
public class Test_convertInt {

	private Exercises exercises = new Exercises();
	private ConvertInt convertInt = exercises.new ConvertInt();
	
	@Test(expected = Exception.class)
	public void convert_LengthGreaterThan6() throws Exception {
		convertInt.convert(new char[7]);
	}
	
	@Test //(ASCII de 5 = 53)*10 + (ASCII de 4 = 52) = 582
	public void convert_LengthLessOrEqualsThan6AndValue54() throws Exception {
		assertEquals((int)convertInt.convert(new char[] {'5', '4'}), 582);
	}
	
	@Test //(ASCII de 3 = 51)*10 + (ASCII de 2 = 50) = 560
	public void convert_LengthLessOrEqualsThan6AndNegative() throws Exception {
		assertEquals((int)convertInt.convert(new char[] {'-', '3', '2'}), -560);		
	}
	
	@Test(expected = Exception.class)
	public void convert_LengthGreaterThan6AndNumberGreaterThan32767() throws Exception {
		convertInt.convert(new char[] {'3', '2', '7', '6', '8'});
	}
	
	@Test(expected = Exception.class)
	public void convert_LengthGreaterThan6AndNumberLessThanMinus32768() throws Exception {
		convertInt.convert(new char[] {'-', '3', '2', '7', '6', '9'});
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void convert_LengthEquals0() throws Exception {
		convertInt.convert(new char[0]);
	}
}
