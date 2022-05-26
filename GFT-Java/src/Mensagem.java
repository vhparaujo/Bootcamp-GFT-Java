
public class Mensagem {

	public static void horario(int h) {
		if (h >= 0 || h < 12) {
			System.out.println("Bom dia!!");
		} else if(h >= 12 || h < 18) {
			System.out.println("Boa tarde!!");
		} else if (h >= 18 || h < 24) {
			System.out.println("Boa noite!!");
		} else {
			System.out.println("Hora invalida");
		}
	
	}
		
}
