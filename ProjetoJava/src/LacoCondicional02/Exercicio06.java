package LacoCondicional02;
//Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.

import java.util.*;

public class Exercicio06 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int valor1, valor2, valor3;
		
		System.out.printf("Informe o Valor 1: ");
		valor1 = leia.nextInt();
		System.out.printf("Informe o Valor 2: ");
		valor2 = leia.nextInt();
		System.out.printf("Informe o valor 3: ");
		valor3 = leia.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor informado foi o " + valor1 + ".");
		}
		else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor informado foi o " + valor2 + ".");
		}
		else if (valor3 > valor2 && valor3 > valor1) {
			System.out.println("O maior valor informado foi o " + valor3 + ".");
		}
	}

}
