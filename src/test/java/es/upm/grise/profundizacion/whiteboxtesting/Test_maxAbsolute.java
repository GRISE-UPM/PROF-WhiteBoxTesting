package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	
	Exercises ex = new Exercises();
	
	
	@Test
	public void masDeCincoElementos() {
		Assertions.assertEquals(-1, ex.maxAbsolute(new int[]{1,2,5,3,8,9}));
	}
	
	
	@Test
	public void iterandoForElementoMenorCero() {
		Assertions.assertEquals(5, ex.maxAbsolute(new int[]{1,-2,5}));
	}
	
	
	@Test
	public void iterandoForElementoMayorIgualCero() {
		Assertions.assertEquals(7, ex.maxAbsolute(new int[]{1,2,7,5}));
	}
	
	
	@Test
	public void listaVaciaSinIteracion() {
		Assertions.assertEquals(0, ex.maxAbsolute(new int[]{}));
	}
}
