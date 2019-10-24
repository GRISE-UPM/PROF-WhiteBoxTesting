package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//dieste

public class Test_convertInt {
	
	//esta vez lo pongo aqui para que parezca que se Java
	Exercises ejercicio = new Exercises();
	Exercises.convertInt convertir = ejercicio.new convertInt();

	///no se como hacer para esperar excepciones, el test
	//me falla porque hace excepcion, he probado varias cosas pero no se
	//como hacerlo
	
	
	//salimos al principio por array muy largo
	@Test (expected = Exception.class)
	public void salimosPrincipio() throws Exception {
		char[] str = new char[]{ 'a','a','a','a','a','a','a' }; 
		//aqui lo que pasa es que esperamos una excepcion
		convertir.convert(str);
	}
	
	//salimos al final por numero muy grande (otra excepcion)
	@Test (expected = IndexOutOfBoundsException.class)
	public void salimosFinalExcepcion()throws Exception {
		char[] str = new char[]{ 'z','z','z','z','z','z' }; 
		//aqui lo que pasa es que esperamos una excepcion
		convertir.convert(str);
	}
	
	//salimos al final por numero muy grande nefativo (otra excepcion)
	@Test (expected = NullPointerException.class)
	public void salimosFinalExcepcionNeg()throws Exception {
		char[] str = new char[]{ '-','z','z','z','z','z' }; 
		//aqui lo que pasa es que esperamos una excepcion
		convertir.convert(str);
	}
	
	//salimos al final por numero muy grande nefativo (otra excepcion)
	@Test
	public void normal_con_numero_positivo()throws Exception {
		char[] str = new char[]{ 'a','a'}; 
		//esperamos 97*10+97=1067
		//aqui lo que pasa es que esperamos una excepcion
		assertEquals(1067, convertir.convert(str),0.001);
	}
	
	
	////es un poco vergonzoso, porque hasta aqui hay 100%de coverage jeje
	//vamos a hacer ahora el camino que nos falta en realidad
	//que es lo mismo que hemos hecho pero empezando por negativo
	
	@Test
	public void normal_con_numero_negativo()throws Exception {
		char[] str = new char[]{ '-','D','+','*'}; 
		//esperamos - ((68*10)+43)*10+42=-7272
		//aqui lo que pasa es que esperamos una excepcion
		assertEquals(-7272, convertir.convert(str),0.001);
	}
}
