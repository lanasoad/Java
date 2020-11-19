package LacoRepeticao;
//5- Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
//Para sair digitar 0(zero). (DO...WHILE)
import java.util.*; 

public class Exercicio05 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int numero=0, soma=0, contador=0;
		float media=0;
				
		do {
			System.out.println("\nEscreva números inteiros (digite '0' para parar): ");
			numero = leia.nextInt();
				
				if (numero < 0)
					System.out.println("Informe um número maior que zero.");
				else if (numero %3 == 0 && numero > 0) {
					soma += numero; // é o mesmo que SOMA = SOMA + NUMERO
					contador++;
				}
			}
		while (numero != 0);
			
		media = (float) soma/contador; 
		
		System.out.println("\nA media dos números múltiplos de 3 é " + media + ".");
	}
}
