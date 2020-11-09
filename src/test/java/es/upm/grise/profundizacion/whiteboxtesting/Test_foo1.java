package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_foo1 {
	
	@Test
	public void foo1_gt_5() {
		assertEquals(1, new Exercises().foo1(6, 16));
	}
	
	@Test
	public void foo1_lt_5() {
		assertEquals(10, new Exercises().foo1(1, 10));
	}

}
