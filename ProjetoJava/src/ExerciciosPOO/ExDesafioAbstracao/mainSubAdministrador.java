package ExDesafioAbstracao;

public class mainSubAdministrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subAdministrador adm01 = new subAdministrador();
		
		adm01.setNome("Claúdia");
		adm01.setEndereco("Rua 14 de maio, 67");
		adm01.setTelefone("5647-1235");
		adm01.setAjudaDeCusto(400);
		
		System.out.println(adm01.toString());
		

	}

}
