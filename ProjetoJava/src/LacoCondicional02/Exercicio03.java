package LacoCondicional02;
//As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra.

import java.util.*;

public class Exercicio03 {
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		leia.useLocale(Locale.US);
		int numeroMacas;
		
		System.out.printf("Quantas ma��s foram compradas? ");
		numeroMacas = leia.nextInt();
		
		if (numeroMacas < 12) {
			System.out.printf("O valor total da compra � de R$ " + (numeroMacas*0.30) + ".");
		}
		else 
			System.out.printf("O valor total da compra � de R$ " + (numeroMacas*0.25) + ".");
	}

}
