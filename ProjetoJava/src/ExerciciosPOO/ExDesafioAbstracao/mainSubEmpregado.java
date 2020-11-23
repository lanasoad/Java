package ExDesafioAbstracao;

public class mainSubEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subEmpregado empregado01 = new subEmpregado();
		empregado01.setNome("Carlos");
		empregado01.setEndereco("Rua Carlos Gomes nº 45");
		empregado01.setTelefone("4567-8790");
		empregado01.setCodigoSetor(3435);
		empregado01.setSalarioBase(4500);
		empregado01.setImposto(0.20);
		empregado01.getCalcularSalario();
		
		System.out.println(empregado01.toString());

	}

}
