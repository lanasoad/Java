package ExerciciosOperadores;
// 4. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o 
//expresso em horas, minutos e segundos
import java.util.Scanner;

public class Ex04Evento {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Informe o tempo total do evento em segundos: ");
		tempoSegundos = ler.nextInt();
		horas = tempoSegundos/3600;
		minutos = (tempoSegundos%3600)/60;
		segundos = (tempoSegundos%3600)/60;
		
		System.out.println("O evento durou, ao total, " + horas + " horas, " + minutos + " minutos e " + segundos + 
				" segundos.");
	}
	
	

}
