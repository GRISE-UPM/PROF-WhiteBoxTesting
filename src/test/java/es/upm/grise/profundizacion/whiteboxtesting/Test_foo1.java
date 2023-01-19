package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class Test_foo1 {

		//El flowchart nos da 2 casos de pruebas
		private Exercises e = new Exercises();

		//Primera branch
		@Test
		public void DividendoMayorQue5() {
			
				assertEquals(2,e.foo1(20, 60));
			
		}
		//Segunda branch
		@Test
		public void DividendoMenorQue6() {
			
				assertEquals(2,e.foo1(2, 4));
			
		}

}
