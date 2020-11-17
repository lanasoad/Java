package LaçoCondicional;
//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um 
//operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder 
//a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
//A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário 
//excedente.
import java.util.*;

public class Exercicio02 {
	public static void mains (String args [])
	{
		Scanner ler = new Scanner(System.in);
		int N, E, S;
		String C;
		
		System.out.printf("Informe o código de registro ou o nome do(a) operário(a): ");
		C = ler.nextLine();
		System.out.printf("Informe a quantidade de horas trabalhadas por ele(a): ");
		N = ler.nextInt();
		
		if (N<=50)
		{
			E = 0;
			S = N*10;
			System.out.printf("\nO salário total de " + C + " é R$ " + S + ".");
		}
		
		else 
		{
			E = (N-50)*20;
			S = 10*50;
			System.out.printf("\n O salário total de " + C + " é R$ " + (S+E) + ", com excedente de " + E + ".");
			System.out.printf("\nValor total: R$ " + ((S+E)+E) + ".");
		}
	}

}
