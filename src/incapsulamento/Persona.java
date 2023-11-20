package incapsulamento;

public class Persona {
	private String nominativo;
	private int eta;
	
	void setNominativo(String varNominativo) {
		nominativo = varNominativo;
	}
	
	void setEta(int varEta) {
		if(varEta < 0)
			eta = varEta * -1;
		else
			eta = varEta;
	}
	
	String getNominativo() {
		return nominativo;
	}
	int getEta() {
		return eta;
	}
	
	void stampaDettaglio() {
		System.out.println(nominativo + ", " + eta);
	}
}
