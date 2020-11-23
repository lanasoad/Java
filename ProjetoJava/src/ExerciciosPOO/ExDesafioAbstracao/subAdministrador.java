package ExDesafioAbstracao;
/* Implemente a classe Administrador como subclasse da classe pessoa. Um determinado administrador tem como atributos da classe Pessoa 
 * e também os atributos próprios como ajudaDeCusto (ajudas referentes a viagens, estadias).
 */
public class subAdministrador extends Pessoa{

	public subAdministrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public subAdministrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "subAdministrador [subEmpregado [nome = " + super.getNome() + "; endereco = " + super.getEndereco() + "; telefone = " + super.getTelefone() + "; "
				+ "ajudaDeCusto = R$" + getAjudaDeCusto() + "]";
	}
	
	
	
}
