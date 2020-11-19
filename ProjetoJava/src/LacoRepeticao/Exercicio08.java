package LacoRepeticao;
//Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o total do somat�rio, a m�dia e o total de 
//valores lidos. O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o programa 
//deve parar quando o usu�rio fornecer um valor negativo. (WHILE)
import java.util.*;

public class Exercicio08 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int numero=0, quantidade=0, soma=0;
		
		while (numero >= 0) 
		{
			System.out.println("Insira um n�mero: ");
			numero = ler.nextInt();
			
			if (numero >= 0) {
				soma += numero;
				quantidade++;
			}
			else {
				break;
			}
		}
		System.out.println("A soma dos n�meros informados � de " + soma + ".");
		System.out.println("A quantidade de n�meros informados foi " + quantidade + ".");
		System.out.println("A m�dia dos valores informados � de " + soma/quantidade + ".");
	}
}
