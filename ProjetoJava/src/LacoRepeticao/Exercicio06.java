package LacoRepeticao;
//6- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
//A prefeitura deseja saber: a. média do salário da população; b. média do número de filhos; c. maior salário; d. percentual de pessoas com salário até R$100,00. (FOR)
import java.text.DecimalFormat;
import java.util.*;

public class Exercicio06 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		int filhos, habitante, somaFilhos=0;
		double salario, maiorSalario=0.00, percentualPessoas=0.00, somaSalario=0.00, contadorMenor=0;
		
		for (habitante = 1; habitante <21; habitante++)
		{	//a
			System.out.println("Habitante " + habitante + ", informe o seu salário: R$ ");
			salario = ler.nextDouble();
			somaSalario = salario + somaSalario/20;
			//b
			System.out.println("Habitante " + habitante + ", informe quantos filhos você tem: ");
			filhos = ler.nextInt();
			somaFilhos += filhos;
			//c
				if (maiorSalario < salario) {
					maiorSalario = salario;
				}
			//d
				if (salario <= 100) {
					contadorMenor++;
					percentualPessoas = ((contadorMenor*100)/20);		
				}
		}	
		System.out.println("\na. A média de salário dos habitantes é de R$ " + df.format(somaSalario/2) + ".");
		System.out.println("b. A média do número de filhos por habitante é de " + df.format(somaFilhos/2) + ".");
		System.out.println("c. O maior salário informado foi de R$ " + df.format(maiorSalario)+ ".");
		System.out.println("d. O percentual pessoas com salário de até R$100 foi de " + df.format(percentualPessoas) + "%.");
		}
}
