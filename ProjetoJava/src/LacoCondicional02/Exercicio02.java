package LacoCondicional02;
//Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. A senha v�lida � o n�mero 1234. 
//Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja v�lida. 
//ACESSO NEGADO caso a senha seja inv�lida.

import java.util.*;

public class Exercicio02 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int senha;
		
		System.out.printf("\nInforme a senha do usu�rio: ");
		senha = leia.nextInt();
		
		if (senha == 1234) {
			System.out.printf("\nAcesso permitido.");
		}
		else 
			System.out.printf("\nAcesso negado. Senha inv�lida.");
	}

}
