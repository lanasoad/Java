package La�oCondicional;
//7)	Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero). 
//Em caso afirmativo, calcular a �rea do tri�ngulo.

import java.util.*;

public class Exercicio07 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		float base, altura, area;
		
		System.out.printf("Informe um valor para a base: ");
		base = leia.nextFloat();
		System.out.printf("Informe um valor para a altura: ");
		altura = leia.nextFloat();
		
		if (base > 0 && altura > 0) {
			area = (base*altura)/2;
			System.out.printf("A �rea do tri�ngulo � igual a " + area + ".");
		}
		else 
			System.out.printf("O valor informado n�o � v�lido. Favor declarar valores positivos maiores que zero.");
	}

}
