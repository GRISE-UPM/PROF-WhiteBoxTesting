package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class Test_convertInt {

	private Exercises exercises = new Exercises();
	private Exercises.convertInt convertInt = exercises.new convertInt();
	
	@Test
	@DisplayName ("str length mayor de 6")
	public void convertinttest1() throws Exception {
		
		
		char[] str = {'1','2','3','4','5','6','7','8','9'};
		
		assertThrows(Exception.class, ()->convertInt.convert(str));
	}

	@Test
	@DisplayName ("str length menor de 6, positivo")
	public void convertinttest2() throws Exception {
		
		
		char[] str = {'1','2','3'};
		
		assertEquals(123,convertInt.convert(str), 0.0);
	}
	
	@Test
	@DisplayName ("str length menor de 6, negativo")
	public void convertinttest3() throws Exception {
		
		
		char[] str = {'-','1','2','3'};
		
		assertEquals(-123,convertInt.convert(str), 0.0);
	}
	
	
	
	@Test
	@DisplayName ("str length menor de 6, positivo, mayor de 32767")
	public void convertinttest4() throws Exception {
		
		
		char[] str = {'3','3','0','0','0'};
		
		assertThrows(Exception.class, ()->convertInt.convert(str));
	}
	
	@Test
	@DisplayName ("str length menor o igual de 6, negativo, menor de 32768")
	public void convertinttest5() throws Exception {
		
		
		char[] str = {'-','3','3','0','0','0'};
		
		assertThrows(Exception.class, ()->convertInt.convert(str));
	}
	
	
	
	
	
}
