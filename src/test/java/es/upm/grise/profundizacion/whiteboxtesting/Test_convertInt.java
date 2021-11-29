package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_convertInt {


	Exercises excercise = new Exercises();
	Exercises.convertInt converInt = excercise.new convertInt();

	@Test
	public void test() throws Exception {

		String textoT = "10345";
		assertEquals(10345, converInt.convert(textoT.toCharArray()));

	}

	@Test
	public void test2() throws Exception {
		String textoT = "1034534324234";
		assertThrows(Exception.class, ()-> converInt.convert(textoT.toCharArray()));
	}

	@Test
	public void test3() throws Exception {
		String textoT = "-1";
		assertEquals(-1, converInt.convert(textoT.toCharArray()));
	}

	@Test
	public void test4() throws Exception {
		String textoT = "32999";
		assertThrows(Exception.class, ()-> converInt.convert(textoT.toCharArray()));
	}




}
