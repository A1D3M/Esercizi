//Esercizio 17: Gestione di un Negozio di Libri: Crea una classe Libro con attributi come titolo e autore. Poi, scrivi un programma che crea un array di oggetti Libro e stampa i dettagli di ogni libro. Ad esempio, un array potrebbe contenere libri come “Il Signore degli Anelli” di J.R.R. Tolkien e “1984” di George Orwell.
package EserciziOggetti;

public class Esercizio17 {

	public static void main(String[] args) {

		Libro lotr = new Libro();
		
		lotr.autore="J.R.R Tolkien";
		lotr.titolo="Il Signore degli Anelli";
		lotr.data=1984;
		
		System.out.println("Titolo: " + lotr.titolo);
		System.out.println("Autore: " + lotr.autore);
		System.out.println("Anno di uscita: " + lotr.data);
	}

}
