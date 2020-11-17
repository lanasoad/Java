package LacoCondicional02;
//Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). 
//Calcular e imprimir o seguinte: - Se o número de lados for igual a 3 escrever TRIANGULO e o valor da área. − Se o número de 
//lados for igual a 4 escrever QUADRADO e o valor da sua área. − Se o número de lados for igual a 5 escrever PENTÁGONO.

//− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
//− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. 

import java.util.*;

public class Exercicio04e05 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner (System.in);
		leia.useLocale(Locale.US);
		int numeroLados, medidaLado;
		double area;
		
		System.out.printf("Informe o número de lados de um polígono regular: ");
		numeroLados = leia.nextInt();
		System.out.printf("Informe a medida do lado em centímetros: ");
		medidaLado = leia.nextInt();
		
		if (numeroLados == 3) {
			area = (medidaLado*2)/2;
			System.out.printf("Polígono: Triângulo. Área: " + area + ".");
		}
		if (numeroLados == 4) {
			area = (medidaLado*2);
			System.out.printf("Polígono: Quadrado. Área: " + area + ".");
		}
		if (numeroLados == 5) {
			System.out.printf("Polígono: Pentágono.");
		}
		else if (numeroLados < 3) {
			System.out.printf("Não é um polígono.");
		}
		else if (numeroLados > 5) {
			System.out.printf("Polígono não identificado.");
		}
	}

}
