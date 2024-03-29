package fila;

public class Contato {
	private String nome;
	private String fone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public Contato() {
		super();
	}
	public Contato(String nome, String fone) {
		super();
		this.nome = nome;
		this.fone = fone;
	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", fone=" + fone + "]";
	}	
}
