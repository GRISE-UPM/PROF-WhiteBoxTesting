package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	@Test
	public void test() throws Exception {
		Exercises excercise = new Exercises();
		Exercises.convertInt converInt = excercise.new convertInt();
		String textoT = "10345";
		assertEquals(10345, converInt.convert(textoT.toCharArray()));
	}

}
