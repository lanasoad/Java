package ProjetinhoFinal;
/*		Projeto Final - BLoco I - Loja virtual em JAVA de montagem de computadores 		*/
/*			Alana, Alexandre, Erc�lia, Gabriel  e Thiago			*/
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
		/* pedir confirma��o */
		if (cliente.ConfirmarCadastro() == true)
			/* nota */
			System.out.println("Voc� est� quase l�... A pr�xima etapa � a forma de pagamento. Obrigad@ por escolher a nossa loja!!");
		else
			/* nota */
			System.out.println("Voc� cancelou a opera��o... Que pena. Volte sempre!");
	}
}
