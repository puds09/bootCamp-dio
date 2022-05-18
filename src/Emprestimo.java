
public class Emprestimo {

	public static void getValorFinal( int valor,   int parcela) {
		switch (parcela) {
		case (2): 
			System.out.println("valor final é: " + valor*1.3);
			break;
		case (3): 
			System.out.println("valor final é: " + valor*1.45);
			break;
		}
	}
}
