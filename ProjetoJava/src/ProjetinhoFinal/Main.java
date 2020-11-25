package ProjetinhoFinal;
/*		Projeto Final - BLoco I - Loja virtual em JAVA de montagem de computadores 		*/
/*			Alana, Alexandre, Ercília, Gabriel  e Thiago			*/
public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("\nSeja bem-vind@ a nossa loja! :)");
		/* mostrar armazenamento e pedir lista ao cliente */
		Pedido pedido = new Pedido();
		pedido.AdicionarItem();
		/* confirmar pedido com cliente */
		pedido.Confirmar();
		/* entrada de dados do cliente */
		Cliente cliente = new Cliente();
		cliente.Cadastro();
		/* pedir confirmação */
		if (cliente.ConfirmarCadastro() == true)
			/* nota */
			System.out.println("Você está quase lá... A próxima etapa é a forma de pagamento. Obrigad@ por escolher a nossa loja!!");
		else
			/* nota */
			System.out.println("Você cancelou a operação... Que pena. Volte sempre!");
	}
}
