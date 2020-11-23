package ExDesafioAbstracao;
/* Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. Considere que cada inst�ncia da classe 
 * Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) 
 * e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, 
 * um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, 
 * crie um programa adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa. 
 */
public class subFornecedor extends Pessoa {
	
	//source > "generate constructors from SuperClass" = traz os atributos da superclasse
	public subFornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public subFornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	// atribui��es da subclasse Fornecedor
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getObterSaldo() {
		return valorCredito - valorDivida;
	}
	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = valorCredito - valorDivida;
	}
	@Override
	public String toString() {
		return "Fornecedor [nome = " + super.getNome() + "; endereco = " + super.getEndereco() + "; telefone = " + super.getTelefone() + "; valorCredito = R$" 
	+ valorCredito + "; valorDivida = R$" + valorDivida + "; obterSaldo = R$" + getObterSaldo() + "]";
	}
	
}
