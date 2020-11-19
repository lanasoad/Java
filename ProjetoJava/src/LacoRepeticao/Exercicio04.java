package LacoRepeticao;
// 4- Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números 
//digitados.(DO...WHILE)
import java.util.*;

public class Exercicio04 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner(System.in);
		int numero=0, soma=0;
		
			do {
				System.out.println("Digite números para serem somados (para parar, digite '0'): ");
				numero = leia.nextInt();
				
				soma += numero; 
				}
			while (numero != 0); 
			
			System.out.println("A soma dos números é: " + soma + ".");
		}
	}

