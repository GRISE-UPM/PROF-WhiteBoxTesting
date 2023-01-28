package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Test_convertInt {

	@Test
	public void null_array_test() {
		Exercises e = new Exercises();
		assertThrows(NullPointerException.class,()->e.convert(null));
	}
	
	@Test
	public void empty_array_test(){
		Exercises e = new Exercises();
		char[] str = {};
		assertThrows(Exception.class,()->e.convert(str));
	}

	
	@Test
	public void long_array_test() {
		Exercises e = new Exercises();
		char[] str = {'a','b','c','f','p','e','3','r','p'};
		assertThrows(Exception.class,()->e.convert(str));
	}

	
	@Test
	public void positive_in_range_test() throws Exception {
		Exercises e = new Exercises();
		char[] str = {'h','e'};
		assertEquals(613,e.convert(str));
	}

	
	@Test
	public void negative_in_range_test() throws Exception{
		Exercises e = new Exercises();
		char[] str = {'-','h','e'};
		assertEquals(-613,e.convert(str));
	}

	
	@Test
	public void higer_than_range_test(){
		Exercises e = new Exercises();
		char[] str = {'{','{','}','?','[','|'};
		assertThrows(Exception.class,()->e.convert(str));
	}

	
	@Test
	public void lower_than_range_test(){
		Exercises e = new Exercises();
		char[] str = {'-','{','}','?','[','|'};
		assertThrows(Exception.class,()->e.convert(str));
	}


}
