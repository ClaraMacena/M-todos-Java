package met.dio;

public class metodo_emprest {
	
	public static double getTx2() {
		return 0.3;
	}


	public static double getTx3() {
		return 0.5;
	}


	public static int getParc2() {
		return 2;
	}


	public static int getParc3() {
		return 3;
	}


	public static void valorEmp(double quantP, double valS) {
		if(quantP == 2) {
			double valF =  valS + (valS * getTx2());
			System.out.println("O valor do empréstimo para duas parcelas é de: R$" + valF);
		}else {
			if(quantP == 3) {
				double valF = valS + (valS * getTx3());
				System.out.println("O valor do empréstimo para três parcelas é de: R$" + valF);
			}else {
				System.out.println("Quantidade de parcelas indisponível");
			}
		}
	}
}

	
	
