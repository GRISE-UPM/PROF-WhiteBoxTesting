package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_convertInt {
	private char[] str;
	private Exercises c= new Exercises();
	//OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	private Exercises.convertInt f= c.new convertInt();
	@Test
	public void testLenMayor6() {
		str=new char[]{'1','2','3','4','5','6','7'};
		Assertions.assertThrows(Exception.class, () -> {
			f.convert(str); });
	}

	@Test
	public void testPositivo() throws Exception{
		str=new char[]{'1','2'};
			assertEquals(12, f.convert(str));
	}

	@Test
	public void testNegativo() throws Exception{
		str=new char[]{'-','1','2'};
		assertEquals(-12, f.convert(str));
	}

	@Test
	public void testNegativoUnElemento() throws Exception{
		str=new char[]{'-','1'};
		assertEquals(-1, f.convert(str));
	}
	//No es necesario
	@Test
	public void testPositivoUnElemento() throws Exception{
		str=new char[]{'1'};
		assertEquals(1, f.convert(str));
	}

	@Test
	public void testFueraRangoPositivo() throws Exception{
		str=new char[]{'3','2','7','6','8'};
		Assertions.assertThrows(Exception.class, () -> {
			f.convert(str); });
	}

	@Test
	public void testFueraRangoNegativo() throws Exception{
		str=new char[]{'-','3','2','7','6','9'};
		Assertions.assertThrows(Exception.class, () -> {
			f.convert(str); });
	}

}
