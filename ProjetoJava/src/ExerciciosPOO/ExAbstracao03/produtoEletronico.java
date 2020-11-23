package ExAbstracao03;
/* 3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida 
 * crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class produtoEletronico {
	private String nome;
	private String marca;
	private int preco;
	private String cor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "produtoEletronico [nome = " + nome + ", marca = " + marca + ", preco = " + preco + ", cor = " + cor + "]";
	}
	
	
}
