package br.ifba.edu.basica;

public class Celula {
	private Celula anterior;
	private Celula proxima;
	private Object objeto;
	
	public Celula() {
		super();
	}
	public Celula(Celula anterior, Celula proxima, Object objeto) {
		super();
		this.anterior = anterior;
		this.proxima = proxima;
		this.objeto = objeto;
	}
	
	public Celula (Object objeto) {
		this.objeto = objeto;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Celula getProxima() {
		return proxima;
	}
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	public Object getObjeto() {
		return objeto;
	}
	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
}
	
	