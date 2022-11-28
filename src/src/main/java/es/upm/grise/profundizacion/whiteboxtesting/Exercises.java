package es.upm.grise.profundizacion.whiteboxtesting;

public class Exercises {

	public float foo1(float x, float y) {     
		if (x > 5)    
			x += 10;
		y = y / x;   
		return y; 
	} 

	public float foo2(float a, float b) {    
		if (a > b) {
			float tmp;
			tmp = b;
			b = a; 
			a = tmp;
		}
		if (Math.cos(a) < 0 || Math.cos(b) > 0) {
			a = 1; b = 3;
		}
		return (a + b) / 2;
	}


	public int maxAbsolute(int[] numbers){
		if(numbers.length > 5)
			return -1;
		int max_value = 0;
		for(int i = 0; i<numbers.length; i++){
			if (numbers[i] < 0 )
				max_value = Math.max(max_value,Math.abs(numbers[i]));
			else	max_value = Math.max(max_value, numbers[i]);
		}
		return max_value;
	}

	public class convertInt {
		public int convert(char[] str) throws Exception{
			if (str.length > 6) 
				throw new Exception(); 
			int number=0;int digit; int i=0;
			if (str[0]=='-') 
				i=1;
			for(; i<str.length; i++){
				digit = str[i] - '0';
				number = number * 10 + digit;
			}     	
			if (str[0]=='-') 
				number =  -number;
			if (number > 32767 || number < -32768) 
				throw new Exception();
			return number;
		}
	}
}
