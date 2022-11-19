package es.upm.grise.profundizacion.whiteboxtesting;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Test_foo1 {
	
	private Exercises e = new Exercises();

	@Test
	public void DividendoMayorQue5() {
		
			assertEquals(2,e.foo1(20, 60));
		
	}
	
	@Test
	public void DividendoMenorQue6() {
		
			assertEquals(2,e.foo1(2, 4));
		
	}
	
	
}
