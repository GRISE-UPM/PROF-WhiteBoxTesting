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

public class Test_foo2 {


	private Exercises exercise = new Exercises();
	
	@Test
	public void food2_result2() {
		assertEquals(2, exercise.foo2(10,9));
	}

	//false,false
	@Test
	public void food2_result1_57f() {
		assertEquals(1.57f, exercise.foo2(0,3.14f));
	}

	//true, true
	@Test
	public void food2_result2_using0() {
		assertEquals(2, exercise.foo2(0,0));
	}

}
