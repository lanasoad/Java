package ExAbstracao02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Aviao Boing73 = new Aviao();
		
		Boing73.setModelo("V093");
		Boing73.setTamanho(50.5);
		Boing73.setCapacidadePassageiros(150);
		Boing73.setCompanhiaArea("Latam");
		
		System.out.println(Boing73.toString());		
	}

}
