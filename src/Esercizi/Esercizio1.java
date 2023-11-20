//Esercizio 1: Verifica Numero Pari o Dispari: Scrivi un programma che chiede all’utente di inserire un 
//numero intero e stampa se il numero è pari o dispari.
package Esercizi;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
				
//		boolean inserimentoAbilitato = true;
//				
//				while(inserimentoAbilitato) {
//					System.out.println("Inserisci il nome o digita Q per uscire");
//					
//					String input = interceptor.nextLine();
//					
//					if(input.equals("Q"))
//						inserimentoAbilitato = false;
//					
//					System.out.println("Hai scritto " + input);
//				}
//				
//				System.out.println("FINE");
//				
		System.out.println("inserisci numero");
		int input = interceptor.nextInt();
		interceptor.close();
		if(input%2==0) {
			System.out.println("Pari");
		}
		else {
			System.out.println("Dispari");
		}
		
	}

}
