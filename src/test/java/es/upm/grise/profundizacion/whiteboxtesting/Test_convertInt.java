package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//dieste

public class Test_convertInt {
    //Prueba sin if
	@Test
	public void testCasoNormal() throws Exception {
		Exercises ejemplo = new Exercises();
		Exercises.convertInt ejemplo1 = ejemplo.new convertInt();
		char [] arrayPrueba= {'a','b'};
		assertEquals(1068, ejemplo1.convert(arrayPrueba));
	}
	//Prueba primer carácter -
	@Test
	public void testCasoPrimerMenos() throws Exception {
		Exercises ejemplo = new Exercises();
		Exercises.convertInt ejemplo1 = ejemplo.new convertInt();
		char [] arrayPrueba= {'-','a','b'};
		assertEquals(-1068, ejemplo1.convert(arrayPrueba));
	}
	
	//OSCAR: Las assertions en jUnit se prueban de otra forma. Ya lo veremos.
	//Prueba mas de seis carácteres
	@Test
	public void testCasoMasSeisCaracteres(){
		Exercises ejemplo = new Exercises();
		Exercises.convertInt ejemplo1 = ejemplo.new convertInt();
		char [] arrayPrueba= {'-','a','b','-','a','b','-','a','b'};
		try {
			assertEquals(0, ejemplo1.convert(arrayPrueba));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertTrue("Exception detected", true);
		}
	}
	//Prueba número mayor que 32767
	@Test
	public void testCasoMas32767(){
		Exercises ejemplo = new Exercises();
		Exercises.convertInt ejemplo1 = ejemplo.new convertInt();
		char [] arrayPrueba= {'z','a','b','z'};
		try {
			assertEquals(0, ejemplo1.convert(arrayPrueba));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertTrue("Exception detected", true);
		}
	}
	//Prueba número mayor que 32767
		@Test
		public void testCasoMenosNeg32767(){
			Exercises ejemplo = new Exercises();
			Exercises.convertInt ejemplo1 = ejemplo.new convertInt();
			char [] arrayPrueba= {'-','z','a','b','z'};
			try {
				assertEquals(0, ejemplo1.convert(arrayPrueba));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				assertTrue("Exception detected", true);
			}
		}


}
