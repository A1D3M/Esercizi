//Esercizio 17: Gestione di un Negozio di Libri: Crea una classe Libro con attributi come titolo e autore. Poi, scrivi un programma che crea un array di oggetti Libro e stampa i dettagli di ogni libro. Ad esempio, un array potrebbe contenere libri come “Il Signore degli Anelli” di J.R.R. Tolkien e “1984” di George Orwell.
package EserciziOggetti;

public class Esercizio17 {

	public static void main(String[] args) {

		Libro[] elenco = new Libro[3];
		
		elenco[0]=new Libro();
		elenco[0].setTitolo("Il Signore degli Anelli");
		elenco[0].setAutore("J.R.R. Tolkien");
		elenco[0].setData(1984);
		elenco[0].stampaDati();
		
		elenco[1]=new Libro();
		elenco[1].setTitolo("bla");
		elenco[1].setAutore("ba");
		elenco[1].setData(3001);
		elenco[1].stampaDati();
		
		elenco[2]=new Libro();
		elenco[2].setTitolo("asd");
		elenco[2].setAutore("fda");
		elenco[2].setData(1900);
		elenco[2].stampaDati();
	}

}
