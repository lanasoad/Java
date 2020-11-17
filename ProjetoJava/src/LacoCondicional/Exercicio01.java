package La�oCondicional;
//Jo�o TOMATEIRO, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. Toda vez que ele 
//traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar 
//uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de 
//tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa 
//que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.printf("\nO peso do carregamento informado � de " + P + " kg(s).");
			System.out.printf("\n Valor da multa a pagar: R$" + M + " reais.");
		}
		else
		{
			E = (P-50);
			M = (E*4);
			System.out.printf("\nO peso do carregamento informado � de " + P + " kg(s) com " + E + " kg(s) excedente.");
			System.out.printf("\nValor da multa a pagar: R$" + M + " reais.");
		}	
	}

}
