package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_convertInt {

	@Test
	public void convertInt() throws Exception {
		char[] arr = {'1', '2', '3'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertEquals(123, aux2.convert(arr));
	}
	
	@Test
	public void convertInt_lt_0() throws Exception {
		char[] arr = {'-', '1', '2', '3'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertEquals(-123, aux2.convert(arr));
	}
	
	@Test
	public void convertInt_len_gt_6() throws Exception {
		char[] arr = {'-', '1', '2', '3', '4', '5','6'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertThrows(Exception.class, () -> aux2.convert(arr));
	}
	
	@Test
	public void convertInt_gt_32767() throws Exception {
		char[] arr = {'3', '2', '7', '6', '8'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertThrows(Exception.class, () -> aux2.convert(arr));
	}
	
	@Test
	public void convertInt_lt_neg32768() throws Exception {
		char[] arr = {'-', '3', '2', '7', '6', '9'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertThrows(Exception.class, () -> aux2.convert(arr));
	}


}
