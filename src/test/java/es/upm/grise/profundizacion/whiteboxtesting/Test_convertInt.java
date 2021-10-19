package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class Test_convertInt {

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Comienzan tests de ConvertInt");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	@Test
	@DisplayName("String demasiado largo, más de 6 char")
	public void convert_LengthTest() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();
		
		char[] a = {'0','1','2','3','4','5','6'};
		
		assertThrows(Exception.class, () -> convertInt.convert(a) );
	}
	
	@Test
	@DisplayName("String de char se convierte en numero entero positivo")
	public void convert_positiveTest() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();
		
		char [] a = {'2','7','9'};

		assertEquals(279, convertInt.convert(a));
	}
	
	@Test
	@DisplayName("String de char se convierte a numero entero negativo")
	public void convert_negativeTest() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();
	
		char [] a = {'-','7','9'};
		
		assertEquals(-79, convertInt.convert(a));
	}
	
	@Test
	@DisplayName("El numero es mayor que 32767 y lanza excepcion")
	public void convert_maxTest() throws Exception{
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();
		char [] a = {'4','0','0', '0', '0'};
		
		assertThrows(Exception.class, () -> convertInt.convert(a) );
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("ConvertInt test terminados");
	}
	
}
