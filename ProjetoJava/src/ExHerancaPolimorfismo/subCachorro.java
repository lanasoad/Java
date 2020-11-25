package ExHerancaPolimorfismo;

public class subCachorro extends Animal{

	public subCachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	//herança (extends) - polimorfismo (overrides)
	// método deveEmitirSom
	public String deveEmitirSom() {
		return "au... auuuuuu... auuuu...";
	}
	//método deveCorrer
	public String deveCorrer() {
		return "o doguinho corre muito rápido!!!!";
	}
	@Override
	public String toString() {
		return "O cachorruinho se chama " + getNome() + " e sua idade é " + getIdade() + " anos.";
	}
	
}
