package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {

	Exercises ex = new Exercises();
	ConvertInt con = ex.new ConvertInt();
	
	@Test(expected = Exception.class)
	public void test_LongitudMayor6() throws Exception {
		char[] values = {'d', 'e', 'm', 'a', 's', 'i', 'a', 'd', 'o'};
		con.convert(values);		
	}

	@Test
	public void test_ValorPositivo() throws Exception {
		char[] values2 = {'1','0','0'};
		assertEquals(con.convert(values2), 5428); //ASCII
	}
	
	@Test
	public void test_ValorNegativo() throws Exception {
		char[] values3 = {'-','1','0','0'};
		assertEquals(con.convert(values3), -5428); //ASCII
	}
	
	@Test (expected = Exception.class)
	public void test_ValorMayorMax() throws Exception {
		char[] values4 = {'3','2','7','6','9'}; //> 32767
		con.convert(values4);
	}
	
	@Test (expected = Exception.class)
	public void testValorMenorMin() throws Exception {
		char[] values5 = {'-','3','2','7','6','9'}; //> 32767
		con.convert(values5);
	}

}
