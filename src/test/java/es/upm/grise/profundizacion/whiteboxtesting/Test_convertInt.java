package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//diente

public class Test_convertInt {
	
	Exercises exercises= new Exercises();
	Exercises.ConvertInt convertClass= exercises.new ConvertInt();

	//OSCAR: A menos que tengas que testear el mensaje, no hace falta complicar la
	// aserción
	//Caso 1 str.length>6
	@Test()
	public void test_caso1_Convert() throws Exception{
		char[] str= {'a','b','c','d','e','f','g','h'};
		assertThrows(Exception.class, ()->convertClass.convert(str));
	}
	//Caso 2 str.length<6 str={- w h t l r }
	@Test()
	public void test_caso2_Convert() throws Exception {
		
		char[] str= {'-','w','h','t','l','r'};
		Exception excepcion=assertThrows(Exception.class, ()->convertClass.convert(str));
		assertEquals(null, excepcion.getMessage());
	}
	
	//Caso 3 str.length<6 str={a w h t l r }
	@Test()
	public void test_caso3_Convert() throws Exception {
		
		char[] str= {'a','w','h','t','l','r'};
		Exception excepcion=assertThrows(Exception.class, ()->convertClass.convert(str));
		assertEquals(null, excepcion.getMessage());
	}
	
	//Caso 4 str.length<6 str={-,b,c}
	@Test()
	public void test_caso4_Convert() throws Exception {	
		char[] str= {'-','-','-','-'};
		int resultado = -4995;
		assertEquals(resultado,convertClass.convert(str));
	}
		
	//Caso 5 str.length<6 str={a,b,c}
	@Test()
	public void test_caso5_Convert() throws Exception {
		char[] str= {'a','b','c'};
		int resultado = 10779;
		assertEquals(resultado,convertClass.convert(str));
	}
}
