package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_foo1 {

	@Test
	public void Xbigger5test() {
		Exercises o = new Exercises();
		Assertions.assertEquals(4,o.foo1(15,100));
	}

	@Test
	public void Xsmaller5test() {
		Exercises o = new Exercises();
		Assertions.assertEquals(25,o.foo1(4,100));
	}

}
