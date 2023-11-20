package incapsulamento;

public class App {

	public static void main(String[] args) {


		Persona gio = new Persona();
		gio.setNominativo("Giovanni Pace");
		gio.setEta(-25);
		
		System.out.println(gio.getNominativo());
		System.out.println(gio.getEta());
		
		gio.stampaDettaglio();

	}

}
