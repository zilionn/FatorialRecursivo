package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int num) {
		// condição de parada - quando o número for <= a 1 - não pode ser 0, pois se não o resultado seria 0
		// em todos os resultados possíveis.
		if (num <= 1) {
			return 1;
		}
		// relação de chamada dos passos - N * N(-1) * N(-2) ... * 1.
		return num * fatorial(num - 1);
	}
}