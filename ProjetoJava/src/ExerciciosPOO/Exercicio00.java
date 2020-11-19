package ExerciciosPOO;
// Descreva em no máximo 200 palavras o que é um automóvel, uma pessoa e uma casa e o que eles fazem. Liste os substantivos e verbos separadamente. 
//Cada substantivo corresponde a um objeto que precisará ser construído para implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos 
//que você listou e, para cada um, liste vários atributos e comportamentos. Descreva brevemente como esses objetos interagem entre si e com outros 
//objetos na sua descrição. Estes passos que você seguiu são típicos do projeto orientado a objetos.

public class Exercicio00 {
	public static void main (String args [])
	{
		System.out.printf("AUTOMÓVEL:"); //classe (tipagem)
		System.out.printf("Tipos: carro, caminhão, ônibus, van, motocicleta."); //objeto
		System.out.printf("O que é: meio de trasporte motorizado.");
		System.out.printf("Atributos: cor, modelo, placa, buzina, portas, marcha, IPVA."); 
		System.out.printf("Métodos: ligar/desligar, acelerar/freiar, mudar marcha, dar ré.");
		
		System.out.printf("\nPESSOA:"); //classe (tipagem)
		System.out.printf("Tipos: criança, adulto, idoso."); //objeto
		System.out.printf("O que é: indivíduo da espécie humana.");
		System.out.printf("Atributos: nome, CPF, RG, idade, peso, altura, idade, sexo.");
		System.out.printf("Métodos: respirar, piscar, sorrir/chorar, dormir/acordar, correr/andar, sentar/levantar.");
	
		System.out.printf("\nCASA"); //classe (tipagem)
		System.out.printf("Tipos: apartamento, sobrado, casa térrea."); //objeto
		System.out.printf("O que é: espaço para a habitação de pessoas.");
		System.out.printf("Atributos: terreno, paredes, janelas, portas, endereço, IPTU.");
		System.out.printf("Métodos: habitar, proteger.");
	
		System.out.printf("\nCOMO ESSES OBJETOS INTERAGEM ENTRE SI:"); 
		System.out.printf("Uma pessoa que habita em uma casa pode usar um automóvel para realizar percursos diários. Ao final deles, ela pode retornoar à casa e "
				+ "guardar o carro na garagem da casa.");
		
	}
}
