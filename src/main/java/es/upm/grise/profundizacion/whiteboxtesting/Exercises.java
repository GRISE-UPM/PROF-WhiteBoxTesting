package es.upm.grise.profundizacion.whiteboxtesting;

public class Exercises {

	public float foo1(float x, float y) {     
		//nodo 1
		if (x > 5)  
			//nodo 2
			x += 10;
		//nodo 3
		y = y / x;   
		return y; 
	} 

	public float foo2(float a, float b) {    
		//nodo 1
		if (a > b) {
			//nodo 2: swap (a,b)
			float tmp;
			tmp = b;
			b = a; 
			a = tmp;
		}
		//nodo 3: Math.cos(a) < 0
		//nodo 4: Math.cos(b) > 0
		if (Math.cos(a) < 0 || Math.cos(b) > 0) {
			//nodo 5
			a = 1; b = 3; 
		}
		//nodo 6
		return (a + b) / 2;
	}


	public int maxAbsolute(int[] numbers){
		//nodo 1
		if(numbers.length > 5)
			//nodo 2
			return -1;
		int max_value = 0;
		
		for(int i = 0; i<numbers.length; i++){
			//nodo 3
			if (numbers[i] < 0 )
				//nodo 4
				max_value = Math.max(max_value,Math.abs(numbers[i]));
			else	
				//nodo 5
				max_value = Math.max(max_value, numbers[i]);
		}
		//nodo 6
		return max_value;
	}

	public class convertInt {
		public int convert(char[] str) throws Exception{
			//nodo 1
			if (str.length > 6) 
				//nodo 2
				throw new Exception(); 
			int number=0;int digit; int i=0;
			//nodo 3
			if (str[0]=='-')
				//nodo 4
				i=1;
			//nodo 5
			for(; i<str.length; i++){
				digit = str[i] - '0';
				number = number * 10 + digit;
			}
			//nodo 6
			if (str[0]=='-') 
				//nodo 7
				number =  -number;
			//nodo 8: number > 32767  y nodo 9: number < -32768
			if (number > 32767 || number < -32768) 
				//nodo 10
				throw new Exception();
			//nodo 11
			return number;
		}
	}
}
