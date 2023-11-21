package EserciziOggetti;

public class Studenti {
	
	private String nome;
	private int voto;
	
	public Studenti() {
		
	}
	
	public Studenti(String nome, int voto) {
		this.nome=nome;
		this.voto=voto;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public void stampaDati() {
		System.out.println("Nome: " + nome + ", Voto: " + voto);
	}
	
	
}
