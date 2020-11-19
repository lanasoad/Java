package LacoRepeticao;
//7- Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e 
//que se encontram no conjunto dos números de 1 até 500. (FOR)
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
			
			System.out.println("\nA soma dos números múltiplos de três e impares é de " + soma + ".");
		}
	}

