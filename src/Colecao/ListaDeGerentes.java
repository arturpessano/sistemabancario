package Colecao;

import java.util.ArrayList;



public class ListaDeGerentes {
	private ArrayList<Gerente> gerentes = new ArrayList<Gerente>();

	public void cadastrar(Gerente gerente) {
		if (gerente != null) {
			gerentes.add(gerente);
		}
	}

	public void remover(Gerente gerente) {
		gerentes.removeIf((elemento) -> elemento.getCpf().equals(gerente.getCpf()));
	}
	public Gerente buscar(Gerente gerente) {
		for(Gerente elemento : this.gerentes) {
			if(elemento.getCpf() == gerente.getCpf()) {
				return elemento;
			}
		}
		return null;
	}

	public void editar(Gerente gerente) {
		int indice = gerentes.indexOf(this.buscar(gerente));
		if (indice != -1) {
			gerentes.set(indice, gerente);

		}
	}

	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Gerente gerente : this.gerentes) {
			builder.append(gerente.toString());

		}
		return builder.toString();

	}
}
