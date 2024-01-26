import java.util.*;

class Solution{
	public static void main(String [] argh){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		// Ingresamos la cantidad de lineas 
		for(int i= 0; i<t; i++){
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		// Se declara un acumulador
		int acu = 1;
		// Declaro un valor de suma que sera igual a el valor total
		int valoSumar = 0;
		for(int j = 0;  j< n; j++){
            /*
            Se declara un a variable que me va a asegurar que se reste el valor de a que ira 				
            aumentando porque se multiplica por j aunque en la primera iteracion es igual a 0
            */
			int valoRestar = a * j;
			/*
            Se declara una variable que guarda el valor base de multiplicar el valor base de a y b 
			pero con el acumulador que ira aumentando en escala de 2, 4 , 8, 16, 32 ... se asegura de 
			que en la primera iteracion sea igual a 1 para que no se aumente el valor del primer
			resultado que necesitamos que de base sea un calculo sencillo
            */
			int valorTo = a +(acu*b); 
			/*
            Se imprime los varoles en conjunto valorSumar que en la primer iteracion no afecta pero
			en las siguiente vendra a valer igual que el valorTo y se resta por el valoRestar que nos
			asegura que los valores vayan acorde al resultado en escala
             */
			System.out.print(valorTo+valoSumar-valoRestar+(" "));
			// Aqui declaramos los valores de valoSumar y acu para que en la primera iteracion no afecte los valores deseados
			valoSumar += valorTo;
			acu *= 2;
			
}
			//Salto de linea
			System.out.println("");
}
			//Cierre del scanner
			in.close();
}
}