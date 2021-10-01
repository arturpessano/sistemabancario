package Colecao;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		//Metodos
		int tamanho = alunos.size();
//		System.out.printf("A coleção tem %d elementos",tamanho);
//		
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("José");
//		
//		tamanho = alunos.size();
//		System.out.printf("Agora a lista tem %d elementos\n", tamanho);
//		
//		String ultimoAluno = alunos.get(tamanho-1);
//		String primeiroAluno = alunos.get(0);
//		System.out.printf("O ultimo aluno é: %s\n", ultimoAluno);
//		System.out.printf("O primeiro aluno é: %s\n", primeiroAluno);
//		
//		//Alterar os elementos
//		alunos.set(2, "Marília");
//		ultimoAluno = alunos.get(tamanho-1);
//		System.out.printf("O ultimo aluno agora é: %s\n", ultimoAluno);
//		
//		
//		//Localizar um elemento
//		boolean localizado = alunos.contains("Maria");
//		int posicao = alunos.indexOf("Maria");
//		if(posicao>=0) {
//			String nome = alunos.get(posicao);
//			
//			System.out.printf("%s foi localizado na posiçõa %d da lista",nome,posicao);
//		}else {
//			System.out.println("Nao foi localizado na lista");
//		}
		
//		//Remoção de elementos
//		int indiceRemocao = alunos.indexOf("Maria");
//		alunos.remove(1); //Remover a Maria
//		System.out.println(alunos.toString());
//		
//		alunos.removeIf((nome)->nome.startsWith("Mar"));
//		
//		System.out.println(alunos.toString());
		
		//-----------------------------------------------------------
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//Adicionar os números
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);                                                                   
		numeros.add(4);
		numeros.add(5);
		
//		System.out.println(numeros.toString());
		// num % 2 == 0 Logo é par
		numeros.removeIf((num)->num % 2!= 0);
		
//		System.out.println(numeros.toString());
		
		//Estrutura de repetição
		
		// Incremental
		for(byte indice=0;indice <10;indice++) {
			System.out.printf("O indice atual é %d\n",indice);
			
		}
//		int tabuada = 4;	
//		for(byte indice=1;indice <11;indice++) {
//				System.out.printf("%d X %d = %d\n",tabuada,indice,tabuada*indice);
//		}
		
		//Decremental
		for(byte indice=9;indice>-1;indice--) {
			System.out.printf("O indice atual é %d\n",indice);
		}
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		numeros2.add(50);
		numeros2.add(12);
		numeros2.add(78);
		numeros2.add(3);
		
		fila(numeros2);
		pilha(numeros2);
		
		//Exclusivo para uso com Coleções
		for(Integer item  : numeros2 ) {
			System.out.println(item);
		}
	}
	
	
	// 2 métodos (fila e uma pilha)
	private static void  fila(ArrayList<Integer> itens) {
		for(byte indice=0;indice < itens.size();indice++) {
			System.out.printf("Processando o item %d\n",itens.get(indice) );
		}
	}
	
	private static void pilha(ArrayList<Integer> itens) {
		for (int indice = itens.size()-1;indice > -1;indice--){
			System.out.printf("Processando o item %d\n",itens.get(indice) );
		}
	}

}
