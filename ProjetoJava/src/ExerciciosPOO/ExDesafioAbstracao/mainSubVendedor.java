package ExDesafioAbstracao;

public class mainSubVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subVendedor vend01 = new subVendedor();
		
		vend01.setNome("Aniel");
		vend01.setEndereco("Rua Gravieiras, 88");
		vend01.setTelefone("4972-3885");
		vend01.setValorVendas(3150);
		vend01.setComissao(0.3);
		
		System.out.println(vend01.toString());

	}

}
