package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista {

	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}

	public void competicoesConcluidas() {
		System.out.println("Competições Concluídas: " + this.competicoes);
	}

	// Plimorfismo de Sobrecarga (Sobrecarga de método)
	public void competicoesConcluidas(int numero) {
		System.out.println("Competicões Concluídas: " + numero);
	}

	// Polimorfismo de Sobrescrita (Sobrescrita de Método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competicões: " + this.competicoes);
	}

	// Métodos Implementados das Interfaces
	public void pedalar() {
		System.out.println("Estou pedalando...");
	}

	@Override   // Anotação - Etiqueta de Dados/Info
	public String aquecer() {
		
		return "Estou me aquecendo...";
	}
	
}
