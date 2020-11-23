package ExDesafioAbstracao;
/* Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada inst�ncia da classe Empregado 
 * tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase 
 * (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com m�todos seletores e 
 * modificadores e um m�todo calcularSalario. Escreva um programa adequado para a classe Empregado. 
 */
public class subEmpregado extends Pessoa {
	
	public subEmpregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public subEmpregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double calcularSalario;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getCalcularSalario() {
		return salarioBase - (salarioBase*imposto);
	}

	public void setCalcularSalario(double calcularSalario) {
		this.calcularSalario = calcularSalario;
	}

	@Override
	public String toString() {
		return "subEmpregado [nome = " + super.getNome() + "; endereco = " + super.getEndereco() + "; telefone = " + super.getTelefone() + "; codigoSetor = " + codigoSetor + 
				"; salarioBase = RS" + salarioBase + "; imposto = %" + imposto + "; calcularSalario = RS" + getCalcularSalario() + "]";
	}
	
	
}
