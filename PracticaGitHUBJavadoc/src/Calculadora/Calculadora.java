package Calculadora;

public class Calculadora {
	/**
	 *  Iniciamos la clase calculadora como se puede observar es una clase publica
	 * @author bogdan
	 *
	 */
	double op1;
	double op2;
	/**
	 * Definimo los dos operadores que usaremos para las operaciones como podemos ver son de tipo doble para ser mas exactos 
	 * en los resultados optenidos. 
	 * @author bogdan
	 *
	 */
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
		/**
		 * Constructor de la clase calculadora con los dos operadores anteriores. 
		 * @author bogdan
		 *
		 */
	}
	
	double suma() {
		return op1+op2;
		/**
		 * Metodo suma muy sencillo se limita a sumar los operadores y a devolver la solucion en el return del metodo. 
		 * @author bogdan
		 *
		 */
	}
	
	
	double resta() {
		return op1-op2;
		/**
		 * Metodo resta similar a la suma pero esta vez con el operando resta este metodo siempre restara el segundo al primero. 
		 * @author bogdan
		 *
		 */
	}
	
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
			/**
			 * Metodo division esta vez algo mas complejo le hemos añadido un mensaje de error que sale en el caso de que 
			 * el divisor sea igual a 0 en caso contrario devuelve la cuenta. 
			 * @author bogdan
			 *
			 */
		}
		return op1/op2;
	}
	double potencia() {
		return Math.pow(op1, op2);
		/**
		 * Metodo potencia eleva el primer operando a la potencia del segundo mediante la calse Math.pow que ya viene definida
		 * en java. 
		 * @author bogdan
		 *
		 */
	}
	
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	public String toString() {
		return "Calculadora de Bogdan Operando1 = "+ op1+ " Operando2 = "+op2;
		/**
		 * Metodo tostring para devolver la oracion Calculadora de 'autor' y los operadores que se utilizan. 
		 * @author bogdan
		 *
		 */
	}
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
