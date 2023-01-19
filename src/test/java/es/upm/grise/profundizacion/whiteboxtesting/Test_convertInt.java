package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class Test_convertInt {
		
		//En línea 49 no se puede comprobar TRUE TRUE
		private Exercises e = new Exercises();

		//Con esta prueba comprobamos el branch de la excepción.
		@Test
		public void length_Mayor_6() throws Exception {
			
			char[] arr = {'1','1','1','1','1','1','1'};
			assertThrows(Exception.class, ()->e.convert(arr));
			
		}
		//Comprobamos branch 2 línea 38.
		//Comprobamos branch 1 línea 41.
		//Comprobamos branch 1 línea 41.
		//Comprobamos branch desbordamiento positivo línea 49 (TRUE FALSE)
		@Test
		public void length_Menor_6_Positivo_DesbordamientoPostivo() throws Exception {
			
			char[] arr = {'3','2','7','6','8'};
			assertThrows(Exception.class, ()->e.convert(arr));
			
		}
		//Comprobamos branch 2 línea 41.
		//Comprobamos branch 2 línea 41.
		//Comprobamos branch desbordamiento negativo línea 49 (FALSE TRUE)
		@Test
		public void FOO_Negativo_DesbordamientoNegativo() throws Exception {
			
			char[] arr = {'-','3','2','7','6','9'};
			assertThrows(Exception.class, ()->e.convert(arr));
			
		}
		
		//Comprobamos branch sin desbordamiento (FALSE,FALSE)
		@Test
		public void FOO_No_Desbordamiento() throws Exception {
			
			char[] arr = {'-','3','2'};
			assertEquals(-32, e.convert(arr));
			
		}
		
		

		
	}
