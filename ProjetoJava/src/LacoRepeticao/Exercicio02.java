package LacoRepeticao;
//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
import java.util.*;

public class Exercicio02 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int i, par=0, impar=0, numEntrada;
		
		for (i = 1; i < 10; i++) {
			
			System.out.println("Digite os n�meros " + i + ": ");
			numEntrada = ler.nextInt();
						
			if (i % 2 == 0) {
				par = par + 1;
			}
			if (i % 2 != 0) {
				impar = 10 - par;
			}
		}
		
		System.out.println("Dos n�meros informados, " + par + " �(s�o) pares e " + impar + " �(s�o) �mpares.");
	}
}
