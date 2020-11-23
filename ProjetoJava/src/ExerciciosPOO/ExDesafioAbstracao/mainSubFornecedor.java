package ExDesafioAbstracao;

public class mainSubFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subFornecedor nome001 = new subFornecedor();
		nome001.setNome("Maria Fernandes");
		nome001.setEndereco("Rua Brasil, 65");
		nome001.setTelefone("3210-9089");
		nome001.setValorCredito(1450.0);
		nome001.setValorDivida(450.0);
		nome001.getObterSaldo();
		
		System.out.println(nome001.toString());
		
	}

}
