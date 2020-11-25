package ExHerancaPolimorfismo;

public class Animal { 
	//ATRIBUTOS
	private String nome;
	private int idade;
	//construtor para "Animal"
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//outros métodos
	
	public String deveEmitirSom() {
		return null;
	}
	
	
}