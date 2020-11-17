package LaçoCondicional;
//6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos

import java.util.*;

public class Exercicio06 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.printf("\nQual a idade do(a) nadador(a)? ");
		idade = leia.nextInt();
		
		if (idade >=5 && idade <=7){
			System.out.printf("\nCategoria: Infantil A");
		}
		if (idade >=8 && idade <=11){
			System.out.printf("\nCategoria: Infantil B");
		}
		if (idade >=12 && idade <=13){
			System.out.printf("\nCategoria: Juvenil A");
		}
		if (idade >=14 && idade <=17){
			System.out.printf("\nCategoria: Juvenil B");
		}
		if (idade >=18){
			System.out.printf("\nCategoria: Adulto");
		}
		if (idade < 5){
			System.out.printf("\nIdade inválida. Não se adequa a nenhuma categoria.");
		}
	}
}
