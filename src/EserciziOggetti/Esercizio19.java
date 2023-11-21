//Esercizio 19: Elenco di Studenti e Voti: Crea una classe Studente con attributi come nome e voto. Scrivi un programma che crea un array di oggetti Studente, assegna nomi e voti a ciascuno, e poi calcola e stampa la media dei voti degli studenti.
package EserciziOggetti;

import java.util.Scanner;

public class Esercizio19 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);		
		
		System.out.println("inserisci numero di studenti");
		int x=interceptor.nextInt();
		interceptor.nextLine();
		Studenti gruppo[]=new Studenti[x];
		
		int votomedio=0;
		for(int i=0; i<x; i++) {
			gruppo[i] = new Studenti();
			System.out.println("inserisci nome dello studente");
			gruppo[i].setNome(interceptor.nextLine());
			System.out.println("inserisci voto dello studente");
			gruppo[i].setVoto(interceptor.nextInt());
			interceptor.nextLine();
			gruppo[i].stampaDati();
			votomedio=votomedio+gruppo[i].getVoto();
		}
		
		interceptor.close();
		
		float media = votomedio/x;
		
		System.out.println("La media è: " + media);

		
		
		
	}

}
