//Esercizio21: Catalogo di Prodotti: Crea una classe Prodotto con attributi come codice, nome e prezzo. Il programma deve gestire un array di Prodotto, consentendo all’utente di aggiungere prodotti all’array e di stampare dettagli di tutti i prodotti presenti.
package EserciziOggetti;

import java.util.Scanner;

public class Esercizio21 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);	
		
		int x=3;
		Prodotto[] elenco = new Prodotto[x];
		
		elenco[0]= new Prodotto();
		elenco[0].setNome("fsa");
		elenco[0].setCodice("231b");
		elenco[0].setPrezzo("55$");
		elenco[0].stampaDati();
		
		elenco[1]= new Prodotto();
		elenco[1].setNome("adfa");
		elenco[1].setCodice("543d");
		elenco[1].setPrezzo("12$");
		elenco[1].stampaDati();
		
		elenco[2]= new Prodotto();
		elenco[2].setNome("gfdgfs");
		elenco[2].setCodice("644c");
		elenco[2].setPrezzo("103$");
		elenco[2].stampaDati();
		
		Boolean continua=true;
		while(continua) {
			x++;
			elenco[x-1]=new Prodotto();
			System.out.println("Inserisci nome del nuovo prodotto");
			elenco[x-1].setNome(interceptor.nextLine());
			System.out.println("Inserisci codice del nuovo prodotto");
			elenco[x-1].setCodice(interceptor.nextLine());
			System.out.println("Inserisci prezzo del nuovo prodotto");
			elenco[x-1].setPrezzo(interceptor.nextLine());
			elenco[x-1].stampaDati();
			System.out.println("Se desidera inserire un nuovo prodotto prema Y, se desidera uscire prema un altro tasto");
			String input=interceptor.nextLine();
			if(!input.equalsIgnoreCase("Y")) {
				continua=false;
			}

		}
		interceptor.close();
	}

}
