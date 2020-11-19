package ExerciciosPOO;
// Descreva em no m�ximo 200 palavras o que � um autom�vel, uma pessoa e uma casa e o que eles fazem. Liste os substantivos e verbos separadamente. 
//Cada substantivo corresponde a um objeto que precisar� ser constru�do para implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos 
//que voc� listou e, para cada um, liste v�rios atributos e comportamentos. Descreva brevemente como esses objetos interagem entre si e com outros 
//objetos na sua descri��o. Estes passos que voc� seguiu s�o t�picos do projeto orientado a objetos.

public class Exercicio00 {
	public static void main (String args [])
	{
		System.out.printf("AUTOM�VEL:"); //classe (tipagem)
		System.out.printf("Tipos: carro, caminh�o, �nibus, van, motocicleta."); //objeto
		System.out.printf("O que �: meio de trasporte motorizado.");
		System.out.printf("Atributos: cor, modelo, placa, buzina, portas, marcha, IPVA."); 
		System.out.printf("M�todos: ligar/desligar, acelerar/freiar, mudar marcha, dar r�.");
		
		System.out.printf("\nPESSOA:"); //classe (tipagem)
		System.out.printf("Tipos: crian�a, adulto, idoso."); //objeto
		System.out.printf("O que �: indiv�duo da esp�cie humana.");
		System.out.printf("Atributos: nome, CPF, RG, idade, peso, altura, idade, sexo.");
		System.out.printf("M�todos: respirar, piscar, sorrir/chorar, dormir/acordar, correr/andar, sentar/levantar.");
	
		System.out.printf("\nCASA"); //classe (tipagem)
		System.out.printf("Tipos: apartamento, sobrado, casa t�rrea."); //objeto
		System.out.printf("O que �: espa�o para a habita��o de pessoas.");
		System.out.printf("Atributos: terreno, paredes, janelas, portas, endere�o, IPTU.");
		System.out.printf("M�todos: habitar, proteger.");
	
		System.out.printf("\nCOMO ESSES OBJETOS INTERAGEM ENTRE SI:"); 
		System.out.printf("Uma pessoa que habita em uma casa pode usar um autom�vel para realizar percursos di�rios. Ao final deles, ela pode retornoar � casa e "
				+ "guardar o carro na garagem da casa.");
		
	}
}
