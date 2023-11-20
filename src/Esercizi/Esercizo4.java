//Calcolo del Fattoriale: Scrivere un programma che calcola il fattoriale di un numero intero non negativo inserito
//dall’utente. Il fattoriale di n (indicato come n!) è il prodotto di tutti i numeri interi positivi fino a n.
package Esercizi;

import java.util.Scanner;

public class Esercizo4 {
	
	public static void main(String[] args) {
		
		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci numero");
		int input = interceptor.nextInt();
		interceptor.close();
		int risultato= 1;
		for (int i=1; i<=input; i++) {
			risultato=risultato*i;
		}
		System.out.println("Il fattoriale di " + input + " è " + risultato);
		
	}

}
