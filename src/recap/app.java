package recap;

public class app {

	public static void main(String[] args) {


		Automobile uno = new Automobile();
		uno.setMarca("Renault");
		uno.setModello("Clio");
		uno.setCilindrata(1500);
		uno.stampaDettaglio();
		
		Automobile due = new Automobile ("Peugeot", "208", 1200);
		due.stampaDettaglio();
		
		Automobile tre = new Automobile ("Mercedes", "SLK");
		tre.stampaDettaglio();
	}

}
