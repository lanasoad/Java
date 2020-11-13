package ExerciciosOperadores;
//3. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
//D = R+S / 2 onde R = (A+B)² e S = (B+C)²
import java.util.Scanner;

public class Ex03fracao {

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, r, s;
		
		System.out.println("Informe um número inteiro para A: ");
		a = ler.nextInt();
		
		System.out.println("Informe um número inteiro para B: ");
		b = ler.nextInt();
		
		System.out.println("Informe um número inteiro para C: ");
		c = ler.nextInt();
		
		d = ((a+b)/2 + (a+b)/2);
		
		System.out.println("O valor de D é " + d + ".");		
		
	}
		
		
}
