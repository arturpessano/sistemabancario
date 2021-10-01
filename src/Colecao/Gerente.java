package Colecao;

public class Gerente {
	private String cpf;
	private String nome;
	
	public Gerente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
		
    public String getCpf() {
		return cpf;
	}

	public Gerente(String cpf) {
    	this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("Nomde do gerente: %s\n CPF do gerente: %s\n", this.nome,this.cpf);
		
	}
	

}
