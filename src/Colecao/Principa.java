package Colecao;

public class Principa {

	public static void main(String[] args) {
		Clientes clientes = new Clientes();
		// Criar os Clientes
		Cliente paulo = new Cliente("Paulo", "1111");
		Cliente maria = new Cliente("Maria", "2222");

		// Adicionar a lista
		clientes.cadastrar(paulo);
		clientes.cadastrar(maria);

		// Listar elementos
		System.out.println(clientes.listar());

		// Modificar maria
		Cliente novaMaria = new Cliente("Maria", "3333");
		clientes.editar(novaMaria);

		// Listar elementos
		System.out.println(clientes.listar());
		
		
		//Remoção
		clientes.remover(maria);
		//Listar elementos
				System.out.println(clientes.listar());
				
				
				ListaDeContas banco = new ListaDeContas();
				Conta conta1 = new Conta(1,200);
				Conta conta2 = new Conta(2,1000);
				Conta contaEditada = new Conta(1,500);
				
				//Cadastrar as contas
				banco.cadastrar(conta1);
				banco.cadastrar(conta2);
				
				//Listar contas
				System.out.println(banco.listar());
				
				banco.editar(contaEditada);
				
				//Listar contas
				System.out.println(banco.listar());
				
				
	}
	
	
	
}
