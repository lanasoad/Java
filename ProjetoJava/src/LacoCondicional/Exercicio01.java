package LaçoCondicional;
//João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele 
//traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar 
//uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de 
//tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa 
//que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
import java.util.*;

public class Exercicio01 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int P, E, M;
								
		System.out.printf("\nInforme o peso (em kg) do carregamento de tomates: ");
		P = ler.nextInt();
				
		if (P<=50)
		{
			E = 0;
			M = 0;
			System.out.printf("\nO peso do carregamento informado é de " + P + " kg(s).");
			System.out.printf("\n Valor da multa a pagar: R$" + M + " reais.");
		}
		else
		{
			E = (P-50);
			M = (E*4);
			System.out.printf("\nO peso do carregamento informado é de " + P + " kg(s) com " + E + " kg(s) excedente.");
			System.out.printf("\nValor da multa a pagar: R$" + M + " reais.");
		}	
	}

}
