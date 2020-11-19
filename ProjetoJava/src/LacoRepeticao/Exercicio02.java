package LacoRepeticao;
//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
import java.util.*;

public class Exercicio02 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int i, par=0, impar=0, numEntrada;
		
		for (i = 1; i < 10; i++) {
			
			System.out.println("Digite os números " + i + ": ");
			numEntrada = ler.nextInt();
						
			if (i % 2 == 0) {
				par = par + 1;
			}
			if (i % 2 != 0) {
				impar = 10 - par;
			}
		}
		
		System.out.println("Dos números informados, " + par + " é(são) pares e " + impar + " é(são) ímpares.");
	}
}
