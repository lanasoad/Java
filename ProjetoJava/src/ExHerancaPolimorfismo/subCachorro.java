package ExHerancaPolimorfismo;

public class subCachorro extends Animal{

	public subCachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	//heran�a (extends) - polimorfismo (overrides)
	// m�todo deveEmitirSom
	public String deveEmitirSom() {
		return "au... auuuuuu... auuuu...";
	}
	//m�todo deveCorrer
	public String deveCorrer() {
		return "o doguinho corre muito r�pido!!!!";
	}
	@Override
	public String toString() {
		return "O cachorruinho se chama " + getNome() + " e sua idade � " + getIdade() + " anos.";
	}
	
}
