package es.upm.grise.profundizacion.whiteboxtesting;

public class Exercises {

	public float foo1(float x, float y) {     
		if (x > 5)   // nodo 1
			x += 10; // nodo 2
		y = y / x;   // nodo 3 
		return y; 
	} 

	public float foo2(float a, float b) {    
		if (a > b) {	// nodo 1
			float tmp;	// nodo 2
			tmp = b;
			b = a; 
			a = tmp;
		}
		if (Math.cos(a) < 0 || Math.cos(b) > 0) { // nodo 3
			a = 1; b = 3; 	// nodo 4
		}
		return (a + b) / 2; // nodo 5
	}


	public int maxAbsolute(int[] numbers){
		if(numbers.length > 5) 	// nodo 1
			return -1; 			// nodo 2
		int max_value = 0;		// nodo 3
		for(int i = 0; i<numbers.length; i++){ // nodo 4
			if (numbers[i] < 0 ) // nodo 5
				max_value = Math.max(max_value,Math.abs(numbers[i])); // nodo 6
			else	max_value = Math.max(max_value, numbers[i]); // nodo 7
		}
		return max_value; // nodo 8
		// nodo 9 - FIN
	}

	public class convertInt {
		public int convert(char[] str) throws Exception{
			if (str.length > 6)	// nodo 1
				throw new Exception(); // nodo 2
			int number=0;int digit; int i=0; // nodo 3
			if (str[0]=='-')
				i=1; // nodo 4
			for(; i<str.length; i++){ // nodo 5
				digit = str[i] - '0'; // nodo 6
				number = number * 10 + digit;
			}
			if (str[0]=='-') // nodo 7
				number =  -number; // nodo 8
			if (number > 32767 || number < -32768) // nodo 9, nodo 11
				throw new Exception(); // nodo 10
			return number; // nodo 12
			// nodo 13 - FIN
		}
	}
}
