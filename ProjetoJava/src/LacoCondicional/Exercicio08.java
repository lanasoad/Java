package LaçoCondicional;
//Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
//caso contrário imprimi-la com o valor zero.

import java.util.*;

public class Exercicio08 {

	public static void main (String args [])
	{
		Scanner ler = new Scanner(System.in);
		int num, zero;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();
		
		if (num > 100)
		{
			System.out.printf("O número informado foi " + num + " e é maior que 100.");
		}
		else 
		{
			zero = 0;
			System.out.printf("O número informado foi " + num + ". Ele não é maior que 100 e corresponde a " + zero + ".");
		}
	}
}
