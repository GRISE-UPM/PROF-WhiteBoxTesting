package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {


	Exercises ex = new Exercises();

	@Test
	public void aMajorbCosaTrue(){
		assertEquals(2,ex.foo2(300,180),0.00);
	}

	@Test
	public void aMajorbCosbTrue(){
		assertEquals(2,ex.foo2(45,0),0.00);
	}

	@Test
	public void bMajoraCosaTrue(){
		assertEquals(2,ex.foo2(180,300),0.00);
	}

	@Test
	public void bMajoraCosbTrue(){
		assertEquals(2,ex.foo2(0,45),0.00);
	}

	@Test
	public void aequalsbAllFalse(){
		assertEquals(90,ex.foo2(0,180),0.00);
	}


}
