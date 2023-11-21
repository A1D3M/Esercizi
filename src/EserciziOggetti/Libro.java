package EserciziOggetti;

public class Libro {

	private String titolo;
	private String autore;
	private int data;
	
	public Libro() {
		
	}
	
	public Libro(String titolo, String autore, int data) {
		this.titolo=titolo;
		this.autore=autore;
		this.data=data;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public void stampaDati() {
		System.out.println("Titolo: " + titolo + ", autore: " + autore + ", data: " + data);
	}
}
