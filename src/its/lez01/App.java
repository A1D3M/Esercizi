package its.lez01;

public class App {

	public static void main(String[] args) {
		
//		Pennarello trattoNero = new Pennarello();
//		trattoNero.colore = "Nero";
//		trattoNero.marca = "Tratto Video";
//		trattoNero.lunghezza = 12.5f;
//		trattoNero.diametro = 1.3f;
//		trattoNero.prezzo= 2.5f;
//		System.out.println(trattoNero.colore);
//		
//		trattoNero = null;
//		
//		Pennarello trattoBlu = new Pennarello();
//		trattoBlu.colore = "Blu";
//		trattoBlu.marca = "Pigna";
//		trattoBlu.lunghezza = 13.5f;
//		trattoBlu.diametro = 2.3f;
//		trattoBlu.prezzo= 3.5f;
//		System.out.println(trattoBlu.marca);
//		
//		trattoBlu = null; //elimina l'oggetto trattoBLu dopo che l'abbiamo usato, liberando la memoria
		
		//--------------------------------------
		
		Persona gio = new Persona ();
		
		gio.saluta();
		gio.saluta();
		gio.saluta();
		
		gio.salutaConFrase("Paolo");
		gio.salutaConFrase("Mario");
		gio.salutaConFrase("Valeria");
		
		gio.salutaConFrasiMul("Uno", "due");
		
		Calcolatrice cal = new Calcolatrice();
		
		float ris = cal.effettuaMoltiplicazione(4.3f, 1.2f);
		System.out.println(ris);
	}

}
