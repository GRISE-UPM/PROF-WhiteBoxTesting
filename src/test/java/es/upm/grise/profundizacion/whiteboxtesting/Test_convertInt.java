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
	
	@Test
	public void testConvertInt_Negativo() throws Exception{
		assertEquals(-12345,con.convert(new char[] {'-','1','2','3','4','5'}));
	}
	
	
	@Test
	public void testConvertInt_mayor() throws Exception{
		assertThrows(Exception.class,()->con.convert(new char[]{'9','9','9','9','9','9' }));
	}
	@Test
	public void testConvertInt_menor() throws Exception{
		assertThrows(Exception.class,()->con.convert(new char[]{'-','9','9','9','9','9' }));
	}
}
