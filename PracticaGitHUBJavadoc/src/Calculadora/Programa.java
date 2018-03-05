package Calculadora;

public class Programa {
	
	static Calculadora calc = new Calculadora(5,10);
	
	public static void main (String[] args) {
		System.out.println(calc.toString());
		System.out.println("Suma= "+calc.suma());
		System.out.println("Resta= "+calc.resta());
		System.out.println("Division= "+calc.division());
		System.out.println("Potencia= "+calc.potencia());
		
	}
	
	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habr�is a�adido.
	//Ejecutadlo.

}
