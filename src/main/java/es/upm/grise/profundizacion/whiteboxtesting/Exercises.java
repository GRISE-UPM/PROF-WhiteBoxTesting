package es.upm.grise.profundizacion.whiteboxtesting;

public class Exercises {

	public float foo1(float x, float y) {     
		if (x > 5) // 1
			x += 10; // 2
		y = y / x; // 3
		return y; 
	} 

	public float foo2(float a, float b) {    
		if (a > b) { // 1
			float tmp; // 2
			tmp = b;
			b = a; 
			a = tmp;
		} 
		if (Math.cos(a) < 0 || Math.cos(b) > 0) { // 3 | 4
			a = 1; b = 3; // 6
		}
		return (a + b) / 2; // 5
	}


	public int maxAbsolute(int[] numbers){
		if(numbers.length > 5) // 1
			return -1; // 2
		int max_value = 0;
		for(int i = 0; i<numbers.length; i++){ // 3
			if (numbers[i] < 0 ) // 4
				max_value = Math.max(max_value,Math.abs(numbers[i])); // 5
			else	max_value = Math.max(max_value, numbers[i]); // 6
		} // 7
		return max_value; // 8
	}

	public class convertInt {
		public int convert(char[] str) throws Exception{
			if (str.length > 6)  // 1
				throw new Exception(); // 2
			int number=0;int digit; int i=0;
			if (str[0]=='-')  // 3
				i=1; // 4
			for(; i<str.length; i++){ // 5
				digit = str[i] - '0'; // 6
				number = number * 10 + digit;
			}     	
			if (str[0]=='-') // 7
				number =  -number; // 8
			if (number > 32767 || number < -32768) // 9 | 10
				throw new Exception(); // 11
			return number; // 12
		}
	}
}
