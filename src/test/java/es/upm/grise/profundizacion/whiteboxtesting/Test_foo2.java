package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_foo2 {

	@Test
	public void aGreaterBtest() {
		Exercises o = new Exercises();
		Assertions.assertEquals(10,o.foo2(15,5));
	}

	@Test
	public void negativecosAtest() {
		Exercises o = new Exercises();
		Assertions.assertEquals(2,o.foo2(400,235));
	}

}
