package ExAbstracao01;
/* Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Cliente { //atributos
	private String nome;
	private int idade;
	private String CPF;
	private String RG;
	// source > get e set
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
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	} // source > toString
	@Override
	public String toString() {
		return "Cliente [nome = " + nome + ", idade = " + idade + ", CPF = " + CPF + ", RG = " + RG + "]";
	}
	
	

	
}
