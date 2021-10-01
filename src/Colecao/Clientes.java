package Colecao;

import java.util.ArrayList;

public class Clientes {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void cadastrar(Cliente cliente) {
		clientes.add(cliente);

	}

	public void remover(Cliente cliente) {
		clientes.removeIf((elemento) -> elemento.getnome().equalsIgnoreCase(cliente.getnome()));
	}

	public Cliente buscar(Cliente cliente) {
		for (Cliente elemento : clientes) {
			if (elemento.getnome().equalsIgnoreCase(cliente.getnome())) {
				return elemento;
			}
		}
		return null;

	}

	public void editar(Cliente novoCliente) {
		int indice = clientes.indexOf(this.buscar(novoCliente));
		if (indice != -1) {
			clientes.set(indice, novoCliente);
		}

	}

	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Cliente cliente : this.clientes)
			builder.append("Nome: " + cliente.getnome()+"\n");
		return builder.toString();
	}

}
