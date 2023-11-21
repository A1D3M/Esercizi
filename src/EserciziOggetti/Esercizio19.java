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
			System.out.println("inserisci nome dello studente");
			String nome = interceptor.nextLine();
			System.out.println("inserisci voto dello studente");
			int voto = interceptor.nextInt();
			interceptor.nextLine();
			gruppo[i] = new Studenti(nome, voto);
			gruppo[i].stampaDati();
			votomedio=votomedio+voto;
		}
		
		interceptor.close();
		
		int media = votomedio/x;
		
		System.out.println("La media è: " + media);

		
		
		
	}

}
