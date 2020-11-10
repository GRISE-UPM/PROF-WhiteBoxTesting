package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;


public class Test_foo1 {

	//Estos metodos corresponden a la prueba del metodo foo1
	private Exercises exercise = new Exercises();
	
	@Test
	public void food1_result20() {
		assertEquals(5, exercise.foo1(10,100));
	}
	

	@Test
	public void food1_result2() {
		assertEquals(2, exercise.foo1(5,10));
	}
}
