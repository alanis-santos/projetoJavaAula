package pooHeranca;

public class Estudante extends Pessoa {   // Classe Filha ou Classe Derivada de Pessoa
	
	// Atributos da classe
	
    private String matricula;
    private String curso;
    
    //Método construtor
	public Estudante (String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email);		// super => Representa a Classe Mãe | Método COnstrutor da Classe Mãe
		this.matricula = matricula;
		this.curso = curso;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
