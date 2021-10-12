package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	@Test
	@DisplayName("convert: se cumple la primera condicion")
	public void whenALengthisGreaterThan6ThrowsException() {
		Exercises exercises = new Exercises();
		convertInt convert = exercises.new convertInt();
		char[] a = new char[10];
		assertThrows(Exception.class, () -> convert.convert(a) );
	}

	@Test
	@DisplayName("convert: se convierte a numero positivo")
	public void whenChar0isDifferentFromScript() throws Exception {
		Exercises exercises = new Exercises();
		convertInt convert = exercises.new convertInt();
		char[] a = new char[3];
		a[0] = '1'; 
		a[1] = '3'; 
		a[2] = '9';
		assertEquals(139,convert.convert(a));
	}

	@Test
	@DisplayName("convert: se cumple la primera condicion y se convierte a numero negativo")
	public void whenChar0isAScript() throws Exception  {
		Exercises exercises = new Exercises();
		convertInt convert = exercises.new convertInt();
		char[] a = new char[3];
		a[0] = '-'; 
		a[1] = '5'; 
		a[2] = '7';
		assertEquals(-57,convert.convert(a));
	}

	@Test
	@DisplayName("convert: el numero es mayor que 32767 y lanza excepcion")
	public void whenAisGreaterThan32767ThrowsException(){
		Exercises exercises = new Exercises();
		convertInt convert = exercises.new convertInt();
		char[] a = new char[5];
		a[0] = '5'; 
		a[1] = '0'; 
		a[2] = '0';
		a[3] = '0';
		a[4] = '0';
		assertThrows(Exception.class, () -> convert.convert(a) );
	}


}
