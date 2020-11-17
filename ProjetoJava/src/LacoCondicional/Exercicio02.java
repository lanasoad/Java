package La�oCondicional;
//Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um 
//oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder 
//a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. 
//A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio 
//excedente.
import java.util.*;

public class Exercicio02 {
	public static void mains (String args [])
	{
		Scanner ler = new Scanner(System.in);
		int N, E, S;
		String C;
		
		System.out.printf("Informe o c�digo de registro ou o nome do(a) oper�rio(a): ");
		C = ler.nextLine();
		System.out.printf("Informe a quantidade de horas trabalhadas por ele(a): ");
		N = ler.nextInt();
		
		if (N<=50)
		{
			E = 0;
			S = N*10;
			System.out.printf("\nO sal�rio total de " + C + " � R$ " + S + ".");
		}
		
		else 
		{
			E = (N-50)*20;
			S = 10*50;
			System.out.printf("\n O sal�rio total de " + C + " � R$ " + (S+E) + ", com excedente de " + E + ".");
			System.out.printf("\nValor total: R$ " + ((S+E)+E) + ".");
		}
	}

}
