package ExerciciosOperadores;
//2. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
//e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e 
//os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
import java.util.Scanner;

	public class Ex02Carro {

		public static void main(String args [])
		{
			Scanner ler = new Scanner(System.in);
			float custoFabrica; 
			double custoFinal;
			
			System.out.println("Informe qual o valor de f�brica do carro: ");
			custoFabrica = ler.nextFloat();
			
			custoFinal = custoFabrica * 1.73;
			System.out.println("O valor total do carro (com impostos) � de: " + custoFinal);
	
		}
}
