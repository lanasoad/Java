package LacoRepeticao;
//5- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
//Para sair digitar 0(zero). (DO...WHILE)
import java.util.*; 

public class Exercicio05 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int numero=0, soma=0, contador=0;
		float media=0;
				
		do {
			System.out.println("\nEscreva n�meros inteiros (digite '0' para parar): ");
			numero = leia.nextInt();
				
				if (numero < 0)
					System.out.println("Informe um n�mero maior que zero.");
				else if (numero %3 == 0 && numero > 0) {
					soma += numero; // � o mesmo que SOMA = SOMA + NUMERO
					contador++;
				}
			}
		while (numero != 0);
			
		media = (float) soma/contador; 
		
		System.out.println("\nA media dos n�meros m�ltiplos de 3 � " + media + ".");
	}
}
