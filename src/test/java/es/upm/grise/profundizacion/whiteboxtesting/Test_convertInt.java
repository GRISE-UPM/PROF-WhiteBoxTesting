package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import es.upm.grise.profundizacion.whiteboxtesting.Exercises;


public class Test_convertInt {

	
	//Exercises ex = new Exercises();
	Exercises ex = new Exercises();
	Exercises.convertInt conInt= ex.new convertInt();
	
	@Test
	public void longituExcesiva() {
		Assertions.assertThrows(Exception.class, 
				()->{conInt.convert(new char[] {'1','2','3','4','5','6','7'});
				});
		
	}

	
	@Test
	public void valoresDemasiadoAltos() {
		
		Assertions.assertThrows(Exception.class, 
				()->{conInt.convert(new char[] {'5','2','3','4','5'});
				});
		
	}
	
	@Test
	public void valoresDemasiadoBajos() {
		
		Assertions.assertThrows(Exception.class, 
				()->{conInt.convert(new char[] {'-','5','2','3','4','5'});
				});	
	}
	@Test
	public void iterandoNumeroNegativo() throws Exception{
		Assertions.assertEquals((int)-123, conInt.convert(new char[] {'-','1','2','3'}));
		
	}
	
	
	@Test
	public void iterandoNumeroPositivo() throws Exception{
			Assertions.assertEquals(123, conInt.convert(new char[] {'1','2','3'}));
			
		
	}
	
	
	@Test
	public void arrayConSignoNegativo() throws Exception{
		Assertions.assertEquals(0, conInt.convert(new char[] {'-'}));
		}
	
	@Test
	public void arrayConSignoPositivo() throws Exception{
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, 
				()->{conInt.convert(new char[] {});
				});
		}
}