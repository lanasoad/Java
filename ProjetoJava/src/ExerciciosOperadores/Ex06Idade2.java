package ExerciciosOperadores;
// 6. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
import java.util.Scanner;

public class Ex06Idade2 {
	
	public static void main(String args [])
	{
		Scanner leia = new Scanner(System.in);
		int dias, totalAnos, totalMeses, totalDias;
		
		System.out.println("Quantos dias voc� j� viveu at� hoje? ");
		dias = leia.nextInt();
		
		totalAnos = dias / 365;
		totalMeses = (dias % 365)/30;
		totalDias = dias % 30;
		
			System.out.println("Voc� j� viveu " + totalAnos + " anos, " + totalMeses + " meses e " + totalDias + " dias.");
				
	}

}
