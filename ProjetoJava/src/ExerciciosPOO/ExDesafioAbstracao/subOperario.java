package ExDesafioAbstracao;
/* Implemente a classe Operario como subclasse da classe Pessoa. Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os 
 * atributos pr�prios como valorProducao (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e comissao 
 * (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio). 
 */
public class subOperario extends Pessoa{

	public subOperario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public subOperario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private double valorProducao;
	private double comissao;
	private double valorFinal;
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getValorFinal() {
		return valorProducao + (valorProducao*comissao);
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		return "subOperario [nome = " + super.getNome() + "; endereco = " + super.getEndereco() + "; telefone = " + super.getTelefone() + "; valorProducao = R$" + valorProducao + 
				"; comissao = %" + comissao + "; valorFinal = R$" + getValorFinal() + "]";
	}
	
	
	

}
