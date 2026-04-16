package introducao;

public class VariaveisConstantes {

	public static void main(String[] args) {
		
		// Variaveis
		int idade = 25;
		String nome = "Alanis";
		float graus = 20.0f;	// float => ponto flutuante
		boolean resposta;		// boolean -> logico true/false 
		
		// Constantes
		final int QUANTIDADE = 50;
		final String TURMA = "84";
		final double AREA = 3.1415;
		
		System.out.println(nome);	// não pula linha
		System.out.println(QUANTIDADE);	// pula linha 
		System.out.println(graus);
	}
}

