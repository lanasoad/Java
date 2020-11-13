package ExerciciosOperadores;
//1. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
import java.util.Scanner;

public class Ex01Media {
	
	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, media, total;
		
		System.out.println("Digite a sua nota 1: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite a sua nota 2: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Digite a sua nota 3: ");
		nota3 = ler.nextFloat();
		
		total = (nota1*2)+(nota2*3)+(nota3*5);
		media = total/10;
				
		System.out.println("A média final dx alunx é de " + media);
		
	}
	
	

}
