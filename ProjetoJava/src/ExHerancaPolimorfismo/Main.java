package ExHerancaPolimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	subCachorro dog1 = new subCachorro ("Harry Patas", 11);
	subCavalo horse1 = new subCavalo ("Pé de Pano", 4);
	subPreguica sloth1 = new subPreguica ("Sid", 6);
	
	System.out.println(dog1.toString());
	System.out.println(dog1.deveEmitirSom());
	System.out.println(dog1.deveCorrer());
	
	System.out.println("\n" + horse1.toString());
	System.out.println(horse1.deveEmitirSom());
	System.out.println(horse1.deveCorrer());
	
	System.out.println("\n" + sloth1.toString());
	System.out.println(sloth1.deveEmitirSom());
	System.out.println(sloth1.deveSubirEmArvores());		
	
	}
}
