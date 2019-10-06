package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test_convertInt {
	
	Exercises exercises= new Exercises();
	Exercises.ConvertInt convertClass= exercises.new ConvertInt();
	
	
	//Caso 1 str.length>6
	@Test()
	public void test_caso1_Convert() throws Exception  {
		char[] str= {'a','b','c','d','e','f','g','h'};
		Exception thrown=assertThrows(Exception.class,()->convertClass.convert(str));
		assertEquals(null, thrown.getMessage());

	}
	//Caso 2 str.length<6 str={-,b,c}
	@Test()
	public void test_caso2_Convert() throws Exception {
		
		char[] str= {'-','b','c'};
		int resultado = -1079;
		assertEquals(resultado,convertClass.convert(str));
	}
		
	//Caso 3 str.length<6 str={z,w,h,t}
	@Test()
	public void test_caso3_Convert() throws Exception {
		
		char[] str= {'z','w','h','t'};
		Exception thrown=assertThrows(Exception.class, ()->convertClass.convert(str));
		assertEquals(null, thrown.getMessage());
	}
	
	//Caso 4 str.length<6 str={- w h t l r }
	@Test()
	public void test_caso4_Convert() throws Exception {
		
		char[] str= {'-','w','h','t','l','r'};
		int resultado = -13056;
		Exception thrown=assertThrows(Exception.class, ()->convertClass.convert(str));
		assertEquals(null, thrown.getMessage());
		}
	
	//Caso 4 str.length<6 str={y,w}
	@Test()
	public void test_caso5_Convert() throws Exception {
		
		char[] str= {'y','w'};
		int resultado = 1329;
		assertEquals(resultado,convertClass.convert(str));
		}
}
