package LaçoCondicional;
//A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes 
//do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º 
//grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são 
//intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas 
//atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de 
//empresas.
import java.util.*;
public class Exercicio05 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		leia.useLocale(Locale.US);
		float indice;
		
		System.out.printf("Informe o índice de poluição: ");
		indice = leia.nextFloat();
		
		if (indice >= 0.05 && indice <= 0.25) {
			System.out.printf("\nO índice de poluição está dentro do parâmetro aceitável.");
		}
		else if (indice >= 0.3 && indice < 0.4) {
			System.out.printf("\nO grupo 1 está intimado a suspender as atividades");
		}
		else if (indice >= 0.4 && indice < 0.5) {
			System.out.printf("\nOs grupos 1 e 2 estão intimados a suspender as atividades.");
		}
		else if (indice >= 0.5) {
			System.out.printf("\nOs grupos 1, 2 e 3 estão intimados a suspender as atividades.");
		}
		
		else {
			System.out.printf("\nÍndice informado inválido.");
		}
	}
}
