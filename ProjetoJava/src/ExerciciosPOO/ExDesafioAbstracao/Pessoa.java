package ExDesafioAbstracao;
/* 1. Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), 
 * e ainda o construtor padr�o e pelo menos mais duas op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o; String telefone;
 */
public class Pessoa { //atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) { // construtor padr�o (op��o 01)
	super();
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
	}
	
	public Pessoa() { // construtor vazio [demanda get e set] (op��o 02)
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", endereco = " + endereco + ", telefone = " + telefone + "]";
	}
	
	
}
