package its.lez01;

public class Persona {
	
	String nome;
	String cognome;
	
	void saluta() {
		System.out.println("Ciao Giovanni");
	}
	
	void salutaConFrase(String varFrase) {
		System.out.println("Ciao " + varFrase);
	}
	
	void salutaConFrasiMul(String varUno, String varDue) {
		System.out.println("Frase uno: " + varUno);
		System.out.println("Frase due: " + varDue);
	}

}
