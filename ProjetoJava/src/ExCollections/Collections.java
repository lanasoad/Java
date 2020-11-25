package ExCollections;
/* Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com Collection do tipo List do Java 
para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:
- Armazenar dados da list; Remover dados da list; - Atualizar dados da list; - Apresentar todos os dados da list.
*/
import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		List <String> produtos = new ArrayList<String>(); /* adicionar bibliotecas List e ArrayList */
		//armazenar produtos/dados na List
		produtos.add("Cuscuz");
		produtos.add("Bolo de fub�");
		produtos.add("Caf� com leite");
		produtos.add("Caf� puro");
		produtos.add("Misto quente");
		produtos.add("Suco de laranja");
		produtos.add("Tapioca com goiabada e queijo");
		produtos.add("Vitamina de abacate");
		produtos.add("�gua");
		//imprimir produtos armazenados
		System.out.println("Os produtos de hoje da padaria s�o: " + produtos);
		
		//remover produtos/dados da List
		produtos.remove("Caf� puro");
		produtos.remove("Misto quente");
		produtos.remove("Bolo de fub�");
		//imprimir List com dados atualizados
		System.out.println("Lista atualizada (sem produtos retirados):" + produtos);
		
		//substituir produtos/dados da List
		for (String substituicao : produtos) {
			System.out.println(produtos.indexOf(substituicao) + "|" + substituicao); //gera uma lista com �ndices dos produtos/dados para a substitui��o
		}
		//substitui��o
		produtos.set(4, "Curau de milho"); 
		System.out.println(produtos);
		
	} 

}
