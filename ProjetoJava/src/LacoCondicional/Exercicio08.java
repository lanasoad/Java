package La�oCondicional;
//Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100, 
//caso contr�rio imprimi-la com o valor zero.

import java.util.*;

public class Exercicio08 {

	public static void main (String args [])
	{
		Scanner ler = new Scanner(System.in);
		int num, zero;
		
		System.out.printf("Digite um n�mero: ");
		num = ler.nextInt();
		
		if (num > 100)
		{
			System.out.printf("O n�mero informado foi " + num + " e � maior que 100.");
		}
		else 
		{
			zero = 0;
			System.out.printf("O n�mero informado foi " + num + ". Ele n�o � maior que 100 e corresponde a " + zero + ".");
		}
	}
}
