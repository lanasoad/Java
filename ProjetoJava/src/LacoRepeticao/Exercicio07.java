package LacoRepeticao;
//7- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s e 
//que se encontram no conjunto dos n�meros de 1 at� 500. (FOR)
import java.util.*;

public class Exercicio07 {
		public static void main (String args []) 
		{
			Scanner leia = new Scanner (System.in);
			int soma=0, impar=0, calculo=0;
			
			for (int i = 1; i <= 500; i++)
			{
				if ((i % 3) == 0 && (i % 2) != 0)
					soma += i;
					impar = soma;
			}
			
			System.out.println("\nA soma dos n�meros m�ltiplos de tr�s e impares � de " + soma + ".");
		}
	}

