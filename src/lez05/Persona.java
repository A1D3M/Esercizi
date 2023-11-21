package lez05;

public class Persona {

	protected String nome;
	protected String cognome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void stampaDettaglio() {
		System.out.println("Persona - " + this.nome + ", " + this.cognome);
	}
}
