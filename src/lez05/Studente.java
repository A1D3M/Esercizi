package lez05;

public class Studente extends Persona {
	private String matricola;
	
	public Studente() {
		
	}
	
	public Studente (String nome, String cognome, String matricola){
		super.nome = nome;
		super.cognome = cognome;
		this.matricola=matricola;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public void stampaDettaglio() {
		System.out.println("Studente - " + this.nome + ", " + this.cognome + ", " + this.matricola);
	}
}
