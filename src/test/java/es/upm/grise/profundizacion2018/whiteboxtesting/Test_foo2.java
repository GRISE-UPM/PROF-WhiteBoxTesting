package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	private Exercises exer =  new Exercises();
	
	@Test
	public void aAndbZero() {
		assertEquals(exer.foo2(0, 0), 2, 0.01);
	}
	
	@Test
	public void aAndbPi(){
		assertEquals(exer.foo2((float)Math.PI, (float)Math.PI), 2, 0.0001);
	}

	@Test
	public void aMenorQuebYNoSeEntraEnSegundoIf(){
		assertEquals(exer.foo2(0, (float)Math.PI), (float)Math.PI/2, 0.01);
	}
	
	@Test
	public void aMayorQuebYNoSeEntraEnSegundoIf(){
		assertEquals(exer.foo2((float)Math.PI, 0), (float)Math.PI/2, 0.01);
	}
	
}
