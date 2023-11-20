//Esercizio 10: Conteggio delle Parole: Scrivere un programma che conti il numero di parole in una frase inserita dall’utente. Ad esempio, per l’input “Java è divertente”, il programma dovrebbe rilevare 3 parole.
package EserciziStringhe;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci la stringa");
		String input = interceptor.nextLine();
		interceptor.close();
		
		int counter=1;
		
		if (input=="") {
			counter = 0;
		}
		else {
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i) == ' ' && input.charAt(i-1)!=' ') {
					counter++;
				}
				
				if(i==input.length()-1 && input.charAt(i)==' ') {
					counter--;
				}
			}
		}
		
		System.out.println("Hai scritto " + counter + " parole");
	}

}
