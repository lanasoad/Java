package ExAbstracao03;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		produtoEletronico categoria = new produtoEletronico();
		
		categoria.setNome("celular");
		categoria.setMarca("Apple - Iphone 12");
		categoria.setPreco(7500);
		categoria.setCor("vermelho");
		
		System.out.println(categoria.toString());
	}

}
