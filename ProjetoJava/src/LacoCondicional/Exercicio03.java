package La�oCondicional;
//Desenvolva um sistema em que:
//Leia 4 (quatro) n�meros; Calcule o quadrado de cada um; Se o valor resultante do quadrado do terceiro for >= 1000, 
//imprima-o e finalize; Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
import java.util.*;

public class Exercicio03 {
	public static void main (String args [])
	{
		Scanner leia = new Scanner(System.in);
		double a, b, c, d;
		int rA, rB, rC, rD;
		
			System.out.printf("\nInforme os valores das vari�veis: ");
			System.out.printf("\nA: ");
				a = leia.nextDouble();
			System.out.printf("\nB: ");
				b = leia.nextDouble();
			System.out.printf("\nC: ");
				c = leia.nextDouble();
			System.out.printf("\nD: ");
				d = leia.nextDouble();
							
				rA = (int) Math.pow(a,2);
				rB = (int) Math.pow(b,2);
				rC = (int) Math.pow(c,2);
				rD = (int) Math.pow(d,4);
				
			if (rC >=1000) {
				System.out.printf("\nO resultado do quadrado de " + c + " � superior a 1000, sendo " + rC + ".");
			}
			else 
				System.out.printf("\nO quadrado de " + a + " � " + rA + "; de " + b + " � " + rB + "; de " + c + " � " + rC + " e de " + d + " � " + rD + ".");				
	}
}
