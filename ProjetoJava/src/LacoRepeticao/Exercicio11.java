package LacoRepeticao;
//11-	Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
//Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
import java.util.*;

public class Exercicio11 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int i=0, soma=0, num;
		
		System.out.println("Insira um número para ser somado aos seus anteriores: ");
		num = leia.nextInt ();
		
		do {
			i++;
			soma = soma+i;
			System.out.println(i + "+" + i + " = " + soma);
		}
		while (i<num); {
			System.out.println("\n A soma dos números anteriores a " + num + ", com ele, é de " + soma + ".");
		}
	}
}
