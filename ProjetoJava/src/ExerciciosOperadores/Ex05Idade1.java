package ExerciciosOperadores;
//5. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa 
//apenas em dias.
import java.util.Scanner;

public class Ex05Idade1 {

	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, totalDias;
		
		System.out.println("Informe quantos anos completos você tem: ");
		anos = ler.nextInt();
		
		System.out.println("Quantos meses se passaram desde o seu aniversário? ");
		meses = ler.nextInt();
		
		System.out.println("E quantos dias? ");
		dias = ler.nextInt();
		
			totalDias =  ((anos * 365) + (meses * 30) + dias);
		
				System.out.println("A sua idade total em dias é de " + totalDias + ".");
		
	}
}
