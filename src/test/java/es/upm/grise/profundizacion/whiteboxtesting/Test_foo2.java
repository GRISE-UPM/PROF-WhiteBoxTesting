package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_foo2 {
	
	
	Exercises ex = new Exercises();
	
	
	@Test
	public void aMayorB_CosAMenorCero() {
		Assertions.assertEquals(2.0, ex.foo2(100,0), 0);
	}
	
	
	@Test
	public void aMayorB_CosBMayorCero() {
		Assertions.assertEquals(2.0, ex.foo2(70,0), 0);
	}
	
	
	@Test
	public void aMenorIgualB_CosAMenorCero() {
		Assertions.assertEquals(105.0, ex.foo2(100,110), 0);
	}
	
	
	@Test
	public void aMenorIgualB_CosBMayorCero() {
		Assertions.assertEquals(2.0, ex.foo2(10,20), 0);
	}
	
	
	@Test
	public void aMenorIgualB_CosBMenorIgualCero() {
		Assertions.assertEquals(2.0, ex.foo2(10,110), 0);
	}

}
