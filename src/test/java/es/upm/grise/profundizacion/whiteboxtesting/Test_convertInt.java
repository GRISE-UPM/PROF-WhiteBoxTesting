package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;



public class Test_convertInt {
	
	//Estos metodos corresponden a la prueba del metodo convertInt
	
	private Exercises exercise = new Exercises();
	private convertInt convert = exercise.new convertInt();
	
	
	@Test
	public void test_exception_high_6()throws Exception {
		char [] numeros = {'1','2','3','4','5','6','7'};
		assertThrows(Exception.class, () -> convert.convert(numeros));
	}
	
	@Test
	public void test_123() throws Exception {
		char [] numeros = {'1','2','3'};
		assertEquals(123, convert.convert(numeros));
	}
	
	
	@Test
	public void test_minus_higher_than_int() throws Exception {
		char [] numeros = {'3','2','7','6','8'};
		assertThrows(Exception.class, () -> convert.convert(numeros));
	}
	
	
	@Test
	public void test_minus_lower_than_int() throws Exception {
		char [] numeros = {'-','3','2','7','6','9'};
		assertThrows(Exception.class, () -> convert.convert(numeros));
		
	}
	

}