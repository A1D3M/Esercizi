//Esercizio 2: Calcolo della Somma dei Numeri: Scrivere un programma che legge 
//cinque numeri interi dall’utente e stampa la loro somma.
package Esercizi;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		int[] elenconumeri = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("inserisci numero");
			
			elenconumeri[i] = interceptor.nextInt();
			
		}
		interceptor.close();
		int totale=0;
		
		for (int i=0; i<elenconumeri.length; i++) {
			totale=totale+elenconumeri[i];
		}
		
		System.out.println("il totale è " + totale);
		
		

	}

}
