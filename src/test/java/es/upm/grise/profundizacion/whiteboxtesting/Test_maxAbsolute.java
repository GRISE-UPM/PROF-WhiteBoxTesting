
package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {


	Exercises ex = new Exercises();

	@Test
	public void arrayVacio() {
		Assertions.assertEquals(0, ex.maxAbsolute(new int[]{}));
	}

	@Test
	public void masDeCincoElementos() {
		Assertions.assertEquals(-1, ex.maxAbsolute(new int[]{1,2,3,4,5,6}));
	}

	@Test
	public void elementosPositivos() {
		Assertions.assertEquals(4, ex.maxAbsolute(new int[]{1,2,3,4}));
	}

	@Test
	public void elementosNegativos() {
		Assertions.assertEquals(2, ex.maxAbsolute(new int[]{-2,0,1}));
	}
}