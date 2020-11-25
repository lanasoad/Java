package ExHerancaPolimorfismo;

public class subCavalo extends Animal {

	public subCavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String deveEmitirSom () {
		return "pocotó... pocotó... pocotó...";
	}
	
	public String deveCorrer () {
		return "o cavalinho vem trotando...";
	}

	@Override
	public String toString() {
		return "O cavalo se chama " + getNome() + " e tem " + getIdade() + " anos.";
	}
	
	
}
