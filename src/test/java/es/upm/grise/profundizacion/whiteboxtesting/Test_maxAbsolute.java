package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;


public class Test_maxAbsolute {

private Exercises exercises = new Exercises();
	

	@Test
	@DisplayName ("numbers length mayor de 5")
	public void maxabsolutetest1() {
		
		int numeros[] = {1,2,3,4,5,6,7};
		
		assertEquals(-1,exercises.maxAbsolute(numeros), 0.0);
	}
	
	@Test
	@DisplayName ("Algún elemento menor que 0")
	public void maxabsolutetest2() {
		
		int numeros[] = {1,2,-9,3};
		
		assertEquals(9,exercises.maxAbsolute(numeros), 0.0);
	}
	
	@Test
	@DisplayName ("Todos los elementos mayores que 0")
	public void maxabsolutetest3() {
		
		int numeros[] = {2,3,4,1};
		
		assertEquals(4,exercises.maxAbsolute(numeros), 0.0);
	}
	
	

}
