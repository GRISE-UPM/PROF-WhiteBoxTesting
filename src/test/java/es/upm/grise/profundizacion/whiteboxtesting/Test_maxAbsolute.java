package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

public class Test_maxAbsolute {
	private int[] a;
	Exercises f = new Exercises();
	@Test
	public void testMasDeCincoIntems() {
		int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		assertEquals(f.maxAbsolute(a),-1);

	}

	@Test
	public void testMaximoValorNegativo() {
		a= new int[]{1,2,4,5,-6};
		assertEquals(f.maxAbsolute(a),6);

	}

	@Test
	public void testMaximoValorPositivo() {
		a=new int[]{1,2,4,7,-6};
		assertEquals(f.maxAbsolute(a),7);

	}

	@Test
	public void testMaximoUnValorPositivo() {
		a=new int[]{1};
		assertEquals(f.maxAbsolute(a),1);

	}

	@Test
	public void testMaximoUnValorNegativo() {
		a=new int[]{-1};
		assertEquals(f.maxAbsolute(a),1);

	}


}