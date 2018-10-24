package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exer= new Exercises();
	

	@Test
	public void maxAbs1() {
		int[] aux = new int[]{-1};
		assertEquals(1, exer.max_absolute(aux));
	}	
	

	@Test
	public void maxAbs2() {
		int[] aux = new int[]{1};
		assertEquals(1, exer.max_absolute(aux));
	}

	@Test
	public void maxAbs_ErrLength() {
		int[] aux = new int[]{0,0,0,0,0,0,0};
		assertEquals(-1, exer.max_absolute(aux));
	}
}

	

	
	