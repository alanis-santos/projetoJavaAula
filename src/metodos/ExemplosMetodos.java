package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemplosMetodos {

	public static void main(String[] args) {
       
		int resultado = somar(2,5);	// resultado = 7
		
		System.out.println("O primeiro resultado: " + resultado);
		// System.out.println("O primeiro resultado: " + somar(3,3));
		
		mensagem();
		saudacao("Bom dia, turma");
		
		ExemploMetodoExterno.info();
	}

	public static int somar(int num1, int num2) { // Assinatura do Método
		// lógica do método
       return num1 + num2;

	}
	
	public static void mensagem() {
		System.out.println("Esse método não tem retorno (Void)");
	
	}

	public static void saudacao(String msg) {
		System.out.println(msg);
	}
}
