package LacoCondicional02;
//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
//Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida. 
//ACESSO NEGADO caso a senha seja inválida.

import java.util.*;

public class Exercicio02 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int senha;
		
		System.out.printf("\nInforme a senha do usuário: ");
		senha = leia.nextInt();
		
		if (senha == 1234) {
			System.out.printf("\nAcesso permitido.");
		}
		else 
			System.out.printf("\nAcesso negado. Senha inválida.");
	}

}
