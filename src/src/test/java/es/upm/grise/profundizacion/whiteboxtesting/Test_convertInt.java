package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Test_convertInt {
	private Exercises exer= new Exercises();;
	private Exercises.convertInt con = exer.new convertInt();
	@Test
	public void testConvertInt_1() throws Exception {
		
		char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		assertThrows(Exception.class, () -> {con.convert(ch);});
	}
	@Test
	public void testConvertInt_2() throws Exception {
		
		char[]c = {'a', 'b'};
		assertEquals(540, con.convert(c));
	}
	

}
