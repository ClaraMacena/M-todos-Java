package met.dio;

//import java.util.Scanner;

public class aula_metodos {
	double valS;

	public static void main(String[] args) {

		// Primeiro método
		System.out.println("Exercicío Calculadora");
		metodo_calc.soma(5, 3);
		metodo_calc.sub(17, 5);
		metodo_calc.div(6, 2);
		metodo_calc.mult(21, 20);

		// Segundo método
		System.out.println("Exercicío Mensagem");
		metodo_mensagem.mensagem(8);
		metodo_mensagem.mensagem(15);
		metodo_mensagem.mensagem(24);

		/*
		 * Scanner read = new Scanner(System.in);
		 * 
		 * System.out.println("Informe o horário"); int hora = read.nextInt();
		 * 
		 * metodo_mensagem.mensagem(hora);
		 */

		// Terceiro método
		System.out.println("Exercicío Empréstimo");
		
		metodo_emprest.valorEmp(metodo_emprest.getParc2(),2000);
		metodo_emprest.valorEmp(metodo_emprest.getParc3(),1500);
		metodo_emprest.valorEmp(5,1000);
		
	}
}
