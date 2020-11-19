package LacoRepeticao;
//6- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. 
//A prefeitura deseja saber: a. m�dia do sal�rio da popula��o; b. m�dia do n�mero de filhos; c. maior sal�rio; d. percentual de pessoas com sal�rio at� R$100,00. (FOR)
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
			System.out.println("Habitante " + habitante + ", informe o seu sal�rio: R$ ");
			salario = ler.nextDouble();
			somaSalario = salario + somaSalario/20;
			//b
			System.out.println("Habitante " + habitante + ", informe quantos filhos voc� tem: ");
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
		System.out.println("\na. A m�dia de sal�rio dos habitantes � de R$ " + df.format(somaSalario/2) + ".");
		System.out.println("b. A m�dia do n�mero de filhos por habitante � de " + df.format(somaFilhos/2) + ".");
		System.out.println("c. O maior sal�rio informado foi de R$ " + df.format(maiorSalario)+ ".");
		System.out.println("d. O percentual pessoas com sal�rio de at� R$100 foi de " + df.format(percentualPessoas) + "%.");
		}
}
