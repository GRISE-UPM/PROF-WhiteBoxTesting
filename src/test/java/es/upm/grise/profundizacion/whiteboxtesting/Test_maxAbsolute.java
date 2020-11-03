package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_maxAbsolute {
	
	@Test
	public void maxAbsolute_gt_5() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(-1, new Exercises().maxAbsolute(arr));
	}
	
	@Test
	public void maxAbsolute_lt_5() {
		int[] arr = {-1,2,3};
		assertEquals(3, new Exercises().maxAbsolute(arr));
	}

}
