package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {
	
	Exercises exer= new Exercises();
	ConvertInt conv= exer.new ConvertInt();
	
	@Test
	public void convertInt1() throws Exception {
		char[] aux = new char[]{'0'};
		assertEquals(48, conv.convert(aux));}	
	
	@Test
	public void convertInt2() throws Exception {
		char[] aux = new char[]{'-'};
		assertEquals(0, conv.convert(aux));}
	
	@Test (expected = Exception.class)
	public void convertInt3() throws Exception {
		char[] aux = new char[]{'-','0','0','0','0','0'};
		conv.convert(aux);} //if(number < -32768)
	
	@Test (expected = Exception.class)
	public void convertInt4() throws Exception {
		char[] aux = new char[]{'a'};
		assertEquals(97, conv.convert(aux));}
	
	@Test (expected = Exception.class)
	public void convertInt5() throws Exception {
		char[] aux = new char[]{'0','0','0','0'};
		conv.convert(aux);} //if(number > 32768)
	
	
	@Test (expected = Exception.class)
	public void convertInt6() throws Exception{
		char[] aux = new char[]{'0','0','0','0','0','0','0'};
	    conv.convert(aux);}//if(str.length > 6) 


}
