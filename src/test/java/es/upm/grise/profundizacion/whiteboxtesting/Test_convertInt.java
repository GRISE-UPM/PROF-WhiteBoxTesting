package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class Test_convertInt {

	private Exercises exercises = new Exercises();
	private Exercises.convertInt convertInt = exercises.new convertInt();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Comienzan tests de ConvertInt");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	@Test
	@DisplayName("String demasiado largo - supera 6 char")
	public void convert_LengthTest() throws Exception {
		char[] a = {'0','1','2','3','4','5','6'};
		assertThrows(Exception.class, ()->convertInt.convert(a));
	}
	
	@Test
	@DisplayName("String de char - numero entero positivo")
	public void convert_positiveTest() throws Exception {
		char [] a = {'2','7','9'};
		assertEquals(279, convertInt.convert(a));
	}
	
	@Test
	@DisplayName("String de char - numero entero negativo")
	public void convert_negativeTest() throws Exception {
		char [] a = {'-','7','9'};
		assertEquals(-79, convertInt.convert(a));
	}
	
	@Test
	@DisplayName("El numero positivo pasa limite 32767 - lanza excepcion")
	public void convert_tooBigPositiveTest() throws Exception{
		char [] a = {'4','0','0', '0', '0'};
		assertThrows(Exception.class, ()->convertInt.convert(a));
	}
	
	@Test
	@DisplayName("El numero negativo supera limite - lanza excepcion")
	public void convert_tooBigNegativeTest() throws Exception{
		char [] a = {'-','4','0','0', '0', '0'};
		assertThrows(Exception.class, ()->convertInt.convert(a));
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

