package ExDesafioAbstracao;

public class mainSubOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subOperario op001 = new subOperario();
		
		op001.setNome("Vinícius");
		op001.setEndereco("Rua Tiradentes, 21");
		op001.setTelefone("3455-9800");
		op001.setValorProducao(6700);
		op001.setComissao(0.4);
		
		System.out.println(op001.toString());

	}

}
