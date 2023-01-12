package es.upm.grise.profundizacion.whiteboxtesting;

public class Exercises {

	public float foo1(float x, float y) { // Path: 1
		if (x > 5) 		// 2
			x += 10; 	// 3
		y = y / x; 		// 4
		return y; 		// 5
	}

	public float foo2(float a, float b) { // Path: 1
		if (a > b) {	// 2
			float tmp;	// 3
			tmp = b;	// 4
			b = a;		// 5
			a = tmp;	// 6
		}
		if (Math.cos(a) < 0 || Math.cos(b) > 0) { // 7
			a = 1; 		// 8
			b = 3; 		// 9
		}
		return (a + b) / 2; // 10
	}

	public int maxAbsolute(int[] numbers) { // Path: 1
		if (numbers.length > 5)		// 2
			return -1;				// 3
		int max_value = 0;			// 4
		for (int i = 0; i < numbers.length; i++) { // 5
			if (numbers[i] < 0)		// 6
				max_value = Math.max(max_value, Math.abs(numbers[i]));	// 7
			else
				max_value = Math.max(max_value, numbers[i]);	// 8
		}
		return max_value;			// 9
	}

	public class convertInt {
		public int convert(char[] str) throws Exception { // Path: 1
			if (str.length > 6)		// 2
				throw new Exception();	// 3
			int number = 0;			// 4
			int digit;				// 5
			int i = 0;				// 6
			if (str[0] == '-')		// 7
				i = 1;				// 8
			for (; i < str.length; i++) {	// 9
				digit = str[i] - '0';		// 10
				number = number * 10 + digit; // 11
			}
 			if (str[0] == '-')		// 12
				number = -number;	// 13
			if (number > 32767 || number < -32768) // 14
				throw new Exception(); 	// 15
			return number;			// 16
		}
	}
}
