package LacoCondicional02;
//Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.*;

public class Exercicio01 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner(System.in);
		int a, b;
		
		System.out.printf("\nInforme um valor para A: ");
		a = leia.nextInt();
		System.out.printf("\nInforme um valor para B: ");
		b = leia.nextInt();
		
		if (a!=b && a>b) {
			System.out.printf("\nO maior valor informado foi de " + a + ".");
		}
		if (a!=b && b>a) {
			System.out.printf("\nO maior valor informado foi de " + b + ".");
		}
		else if (a==b) {
			System.out.printf("\nOs valores informados são iguais. Favor inserir novos valores.");
		}
	}

}
