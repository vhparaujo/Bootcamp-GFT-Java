
public class Emprestimo {

	
	public static double getTaxaDuasParcelas() {
		return 0.2;
	}
	
	public static double getTaxaTresParcelas() {
		return 0.3;
	}
	
	
	public static void calcular(double valor, int parcelas) {
		
		if(parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("O valor do emprestimo para duas parcelas e: R$ " + valorFinal);
		} else if(parcelas == 3) {
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			System.out.println("O valor do emprestimo para tres parcelas e: R$ " + valorFinal);
		} else {
			System.out.println("Numero de parcelar nao disponivel.");
		}
		
	}
	
	
	
	
}
