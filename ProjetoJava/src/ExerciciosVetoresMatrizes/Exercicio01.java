package ExerciciosVetoresMatrizes;
//1. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
import java.util.*;

public class Exercicio01 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int [] dado = new int [10]; 
		int vezes=0, maiorPontuacao=0, i=0;
		int media=0; 
		//leitura - entrada de valores para o cálculo
		for (i=0; i<10; i++) 
		{
			System.out.printf("Entre com os 10 valores para os lançamentos: ");
			dado[i] = ler.nextInt();
			media += dado[i];
				if (dado[i] > maiorPontuacao)
				maiorPontuacao = dado[i];
		}
		//cálculo
		for (i = 0; i < 10; i++) 
		{
			System.out.printf("\nO valor do lançamento " + (i+1) + " foi de " + dado[i] + ".");
				if (dado[i] == maiorPontuacao)
				vezes++;
		}
		//saída
		System.out.printf("\nA média de todos os valores dos lançamentos é de " + media/10 + ".");	
		System.out.printf("\nO maior valor informado foi " + maiorPontuacao + ", aparecendo um total de " + vezes + " vezes.");
	}
}
