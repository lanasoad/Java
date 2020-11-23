package ExAbstracao01;
// criar a classe "main", marcando "public static void..."
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// instanciar o objeto: demonstra os atributos da classe com as entradas do objeto (no caso, "Maria")
	Cliente Maria = new Cliente();
	//
	Maria.setNome("Maria");
	Maria.setIdade(50);
	Maria.setCPF("454.657.321-78");
	Maria.setRG("54.646.452");
	// source > toString()
	System.out.println(Maria.toString());
	

	}

}
