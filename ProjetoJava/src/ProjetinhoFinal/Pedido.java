package ProjetinhoFinal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pedido
{
	public void AdicionarItem() {
		/* mapeamento das pe�as */
		Map<String, Pe�as> mapa = new TreeMap<String, Pe�as>();
		Pe�as A1 = new Pe�as ("A1","I9 10� Gera��o",3000);
		Pe�as A2 = new Pe�as ("A2","I7 10� Gera��o",4000);
		Pe�as A3 = new Pe�as ("A3","I5 10� Gera��o",1500);
		Pe�as A4 = new Pe�as ("A4","RTX 3090TI",5000);
		Pe�as A5 = new Pe�as ("A5","RTX 2080TI",1200);
		Pe�as A6 = new Pe�as ("A6","RTX 2060TI",2000);
		Pe�as A7 = new Pe�as ("A7","HDD 500GB + SSD nvme 500GB",1000);
		Pe�as A8 = new Pe�as ("A8","HDD 1T + SDD nvme 1T",3000);
		mapa.put("A1", A1);
		mapa.put("A2", A2);
		mapa.put("A3", A3);
		mapa.put("A4", A4);
		mapa.put("A5", A5);
		mapa.put("A6", A6);
		mapa.put("A7", A7);
		mapa.put("A8", A8);
		/* op��es de pe�as */
		Collection<Pe�as> estoque = mapa.values();
		System.out.println("\nLista de pe�as:\n");
		for(Pe�as x:estoque)
			System.out.println(x);
		/* vari�veis */
		Scanner ler = new Scanner(System.in);
		int num, i=1;
		String item;
		double total=0;
		/* entrada do pedido pelo cliente */
		Collection<Pe�as> compra = new HashSet<Pe�as>();
		while(i == 1) {
		System.out.println("Dentre as pe�as disponiveis, digite o ID da pe�as que deseja comprar:");
		item = ler.next();
		System.out.println("Quantas unidades");
		num = ler.nextInt();
		Pe�as pe�a = mapa.get(item) ;
		pe�a.setUnidades(num);
		compra.add(pe�a);	
		System.out.println("Deseja adicionar outro item? Se sim, digite 1; se n�o, digite 0: ");
		i = ler.nextInt();
		}
		/* mostrar escolhas do cliente */
		for(Pe�as x:compra) {
			System.out.println(x + "\tQuantidade: " + x.getUnidades());
			total += x.getValor()*x.getUnidades();
		}
		/* mostrar valor total da compra */
		System.out.println("Valor total da compra: " + total + " R$.");
		}
		/* m�todo para confirmar a compra */
		public void Confirmar() {
	    Scanner ler = new Scanner(System.in);
		System.out.println("Se voc� deseja confirmar lista de compras, pressione 1; caso contr�rio, 0: ");
		int i = ler.nextInt();
    	if(i == 1) 
    		System.out.println("CADASTRO CONFIRMADO:");
    	else 
    		System.out.println("CADASTRO NEGADO");
    	}
}