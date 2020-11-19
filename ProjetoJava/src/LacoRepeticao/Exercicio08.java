package LacoRepeticao;
//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de 
//valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa 
//deve parar quando o usuário fornecer um valor negativo. (WHILE)
import java.util.*;

public class Exercicio08 {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int numero=0, quantidade=0, soma=0;
		
		while (numero >= 0) 
		{
			System.out.println("Insira um número: ");
			numero = ler.nextInt();
			
			if (numero >= 0) {
				soma += numero;
				quantidade++;
			}
			else {
				break;
			}
		}
		System.out.println("A soma dos números informados é de " + soma + ".");
		System.out.println("A quantidade de números informados foi " + quantidade + ".");
		System.out.println("A média dos valores informados é de " + soma/quantidade + ".");
	}
}
