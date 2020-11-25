package ExCollections;
/* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java 
para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
- Armazenar dados da list; Remover dados da list; - Atualizar dados da list; - Apresentar todos os dados da list.
*/
import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		List <String> produtos = new ArrayList<String>(); /* adicionar bibliotecas List e ArrayList */
		//armazenar produtos/dados na List
		produtos.add("Cuscuz");
		produtos.add("Bolo de fubá");
		produtos.add("Café com leite");
		produtos.add("Café puro");
		produtos.add("Misto quente");
		produtos.add("Suco de laranja");
		produtos.add("Tapioca com goiabada e queijo");
		produtos.add("Vitamina de abacate");
		produtos.add("Água");
		//imprimir produtos armazenados
		System.out.println("Os produtos de hoje da padaria são: " + produtos);
		
		//remover produtos/dados da List
		produtos.remove("Café puro");
		produtos.remove("Misto quente");
		produtos.remove("Bolo de fubá");
		//imprimir List com dados atualizados
		System.out.println("Lista atualizada (sem produtos retirados):" + produtos);
		
		//substituir produtos/dados da List
		for (String substituicao : produtos) {
			System.out.println(produtos.indexOf(substituicao) + "|" + substituicao); //gera uma lista com índices dos produtos/dados para a substituição
		}
		//substituição
		produtos.set(4, "Curau de milho"); 
		System.out.println(produtos);
		
	} 

}
