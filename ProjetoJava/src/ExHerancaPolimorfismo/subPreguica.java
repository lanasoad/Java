package ExHerancaPolimorfismo;

public class subPreguica extends Animal {

	public subPreguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String deveEmitirSom () {
		return "ZzZzZzzZzZZzZzZz";
	}
	
	public String deveSubirEmArvores () {
		return "escalando a 5 km/h...";
	}

	@Override
	public String toString() {
		return "A preguiça se chama " + getNome() + " e tem " + getIdade() + " anos.";
	}
		
}
