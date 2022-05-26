
public class Calculadora {
	
	public static void soma(double a, double b) {
		
		double resultado = a + b;
		
		System.out.println("A soma de " + a + " mais " + b + " e: " + resultado);
	}
	
	public static void subtracao(double a, double b) {
			
			double resultado = a - b;
			
			System.out.println("A subtracao de " + a + " menos " + b + " e: " + resultado);
		}
		
	public static void multiplicacao(double a, double b) {
		
		double resultado = a * b;
		
		System.out.println("A multiplicacao de " + a + " vezes " + b + " e: " + resultado);
	}
	
	public static void divisao(double a, double b) {
		
		double resultado = a / b;
		
		System.out.println("A divisao de " + a + " por " + b + " e: " + resultado);
	}
	
}
