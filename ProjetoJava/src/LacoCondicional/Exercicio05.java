package La�oCondicional;
//A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes 
//do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� 
//grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o 
//intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas 
//atividades. Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de 
//empresas.
import java.util.*;
public class Exercicio05 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		leia.useLocale(Locale.US);
		float indice;
		
		System.out.printf("Informe o �ndice de polui��o: ");
		indice = leia.nextFloat();
		
		if (indice >= 0.05 && indice <= 0.25) {
			System.out.printf("\nO �ndice de polui��o est� dentro do par�metro aceit�vel.");
		}
		else if (indice >= 0.3 && indice < 0.4) {
			System.out.printf("\nO grupo 1 est� intimado a suspender as atividades");
		}
		else if (indice >= 0.4 && indice < 0.5) {
			System.out.printf("\nOs grupos 1 e 2 est�o intimados a suspender as atividades.");
		}
		else if (indice >= 0.5) {
			System.out.printf("\nOs grupos 1, 2 e 3 est�o intimados a suspender as atividades.");
		}
		
		else {
			System.out.printf("\n�ndice informado inv�lido.");
		}
	}
}
