package EserciziOggetti;

public class Prodotto {
	private String codice;
	private String nome;
	private String prezzo;
	
	public Prodotto() {
		
	}
	public Prodotto(String codice, String nome, String prezzo) {
		this.codice=codice;
		this.nome=nome;
		this.prezzo=prezzo;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	public void stampaDati() {
		System.out.println("Codice: " + codice + ", nome: " + nome + ", prezzo: " + prezzo);
	}
	
}
