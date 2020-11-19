package LacoRepeticao;
//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
import java.util.*;

public class Exercicio03 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int idade=0, idadeMaior=0, idadeMenor=0;
		
		System.out.println("Este programa dividirá as idades que você inserir entre 'menor que 21 anos' e 'maior que 50 anos'.");
		System.out.println("Portanto, informe as idades (para encerrar, digite '-99'): "); 
		
		while (idade != -99) {
				
				idade = leia.nextInt();
				
			if (idade > 0 && idade < 21) {
				idadeMenor++;
				}
				else if (idade > 50) {
				idadeMaior++;
				}
		}			
			System.out.println("\nO total de pessoas com menos de 21 anos é de " + idadeMenor + " e com mais de 50 é " + idadeMaior + ".");
			
		}
	}
