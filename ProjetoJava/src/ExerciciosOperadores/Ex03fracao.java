package ExerciciosOperadores;
//3. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
//D = R+S / 2 onde R = (A+B)� e S = (B+C)�
import java.util.Scanner;

public class Ex03fracao {

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, r, s;
		
		System.out.println("Informe um n�mero inteiro para A: ");
		a = ler.nextInt();
		
		System.out.println("Informe um n�mero inteiro para B: ");
		b = ler.nextInt();
		
		System.out.println("Informe um n�mero inteiro para C: ");
		c = ler.nextInt();
		
		d = ((a+b)/2 + (a+b)/2);
		
		System.out.println("O valor de D � " + d + ".");		
		
	}
		
		
}
