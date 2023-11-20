//Esercizio 19: Elenco di Studenti e Voti: Crea una classe Studente con attributi come nome e voto. Scrivi un programma che crea un array di oggetti Studente, assegna nomi e voti a ciascuno, e poi calcola e stampa la media dei voti degli studenti.
package EserciziOggetti;

import java.util.Scanner;

public class Esercizio19 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci nome dello studente");
		Studenti.nome = interceptor.nextLine();
		System.out.println("inserisci voto dello studente");
		Studenti.voto = interceptor.nextInt();
		interceptor.close();
	}

}
