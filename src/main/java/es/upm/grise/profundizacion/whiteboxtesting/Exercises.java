package es.upm.grise.profundizacion.whiteboxtesting;

public class Exercises {
	
	
/*
 * foo1(x,y) si x > 5, x = x + 10
 * y = y/x
 */
	public float foo1(float x, float y) {     
		if (x > 5)    
			x += 10;
		y = y / x;   
		return y; 
	} 
/*
 * foo2(a,b) si a > b -> intercambia los valores de a y b
 * si (cos(a) < 0 o cos(b) > 0) -> a = 1 y b=3
 * Devuelve a + b / 2
 * Esta en radianes
 */
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


	/*
	 * Devuelve el valor más alto en valor absoluto de un vector
	 */
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

	/*
	 * Convierte un string en un numero. da error si la longitud del string es > 6
	 */
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
