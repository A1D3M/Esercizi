//Esercizio 18 Registro delle Automobili: Definisci una classe Automobile con attributi come marca, modello e anno. Il tuo programma dovrebbe creare un array di oggetti Automobile e permettere all’utente di inserire dati per ciascuna automobile, stampando poi tutti i dettagli (usa lo Scanner se puoi).
package EserciziOggetti;

import java.util.Scanner;

public class Esercizio18 {

	public static void main(String[] args) {
		
		Scanner interceptor = new Scanner(System.in);
		
		System.out.println("inserisci numero di macchine");
		int x= interceptor.nextInt();
		interceptor.nextLine();
		
		Automobile[] elenco = new Automobile[x];
		
		for(int i=0; i<x; i++) {
			System.out.println("inserisci marca");
			String marca = interceptor.nextLine();
			System.out.println("inserisci modello");
			String modello = interceptor.nextLine();
			System.out.println("inserisci anno");
			int anno = interceptor.nextInt();
			interceptor.nextLine();
			
			elenco[i]=new Automobile(marca, modello, anno);
			elenco[i].stampaDettaglio();
		}
		
		
		interceptor.close();		
	}

}
