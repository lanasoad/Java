package ExDesafioAbstracao;
/* Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor tem como atributos da classe Pessoa e também 
 * os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem 
 * do valorVendas que será adicionado ao vencimento base do Vendedor). 
 */
public class subVendedor extends Pessoa{

	public subVendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public subVendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private double valorVendas;
	private double comissao;
	private double valorFinal;
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getValorFinal() {
		return valorVendas + (valorVendas*comissao);
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		return "subVendedor [nome = " + super.getNome() + "; endereco = " + super.getEndereco() + "; telefone = " + super.getTelefone() + "; valorVendas = RS" 
				+ valorVendas + "; comissao = %" + comissao + "; valorFinal = R$" + getValorFinal() + "]";
	}
	
	

}
