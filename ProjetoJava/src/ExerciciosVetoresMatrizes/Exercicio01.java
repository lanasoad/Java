package ExerciciosVetoresMatrizes;
//1. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
import java.util.*;

public class Exercicio01 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int [] dado = new int [10]; 
		int vezes=0, maiorPontuacao=0, i=0;
		int media=0; 
		//leitura - entrada de valores para o c�lculo
		for (i=0; i<10; i++) 
		{
			System.out.printf("Entre com os 10 valores para os lan�amentos: ");
			dado[i] = ler.nextInt();
			media += dado[i];
				if (dado[i] > maiorPontuacao)
				maiorPontuacao = dado[i];
		}
		//c�lculo
		for (i = 0; i < 10; i++) 
		{
			System.out.printf("\nO valor do lan�amento " + (i+1) + " foi de " + dado[i] + ".");
				if (dado[i] == maiorPontuacao)
				vezes++;
		}
		//sa�da
		System.out.printf("\nA m�dia de todos os valores dos lan�amentos � de " + media/10 + ".");	
		System.out.printf("\nO maior valor informado foi " + maiorPontuacao + ", aparecendo um total de " + vezes + " vezes.");
	}
}
