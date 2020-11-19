package ExerciciosVetoresMatrizes;
//2. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
// a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
// b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

import java.util.*;

public class Exercicio02 {
	public static void main (String args [])
	{	//variáveis
		Scanner leia = new Scanner(System.in);
		float [][] N1=new float[4][6], N2=new float[4][6], M1=new float[4][6], M2=new float[4][6];
		
		for (int linha = 0; linha < 4; linha++)
			for(int coluna = 0; coluna < 6; coluna++)
			{
				System.out.println("Informe um elemento N1[" + (linha+1) +"][" + (coluna+1) + "]: ");
				N1[linha][coluna] = leia.nextFloat();
			}
		for (int linha = 0; linha < 4; linha++)
			for(int coluna = 0; coluna < 6; coluna++)
			{
				System.out.println("Informe um elemento N2[" + (linha+1) +"][" + (coluna+1) + "]: ");
				N2[linha][coluna] = leia.nextFloat();
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		//a - somando as matrizes N1 E N2:
		System.out.println("\nA soma dos elementos das Matrizes 1 e 2 é (M1):");
		for (int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
				System.out.print("\t[" + M1[linha][coluna] +"]\t");
			System.out.println(); //pula linhas
		}
		//b - subtraindo os elementos das matrizes N1 e N2:
		System.out.println("\nA subtração/diferença entre os elementos das Matrizes 1 e 2 é (M2):");
		for (int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
				System.out.print("\t[" + M2[linha][coluna] +"]\t"); 
			System.out.println();
		}
	}
}
