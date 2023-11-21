package EserciziOggetti;

public class Camera {

	private int numero;
	private String stato;
	
	public Camera () {
		
	}
	
	public Camera (int numero, String stato) {
		this.numero=numero;
		this.stato=stato;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	
	public void stampaDati() {
		System.out.println("Numero camera: " + numero + ", Stato: " + stato);
	}
	
	
}
