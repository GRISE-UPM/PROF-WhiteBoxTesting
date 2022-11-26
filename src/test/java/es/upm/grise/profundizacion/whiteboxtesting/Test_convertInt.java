package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;



public class Test_convertInt {

	//resultado: debe lanzar excepción porque se pasa de la longitud
	@Test
	public void longitud_mayor__que_6() {
		Exercises ejercicio = new Exercises();
		convertInt convertInt = ejercicio.new convertInt();
		
		char [] str = { '6','5','3','4','2','1','9'};
		assertThrows(Exception.class,() -> convertInt.convert(str));
			
	}
	
	
	@Test
	public void test_1() throws Exception {
		Exercises ejercicio = new Exercises();
		convertInt convertInt = ejercicio.new convertInt();
		
		char [] str = { '6','5','3','4'};
		assertEquals(6534, convertInt.convert(str));
			
	}
	
	
	@Test
	public void test_num_negativo() throws Exception {
		Exercises ejercicio = new Exercises();
		convertInt convertInt = ejercicio.new convertInt();
		
		char [] str = { '-', '9','3','3','2'};
		assertEquals(-9332, convertInt.convert(str));
			
	}
	


}
