//Esercizio 9: Sostituzione dei Caratteri: Scrivi un programma che sostituisca tutti gli spazi in una stringa con un carattere specifico, come un trattino (‘-‘). Ad esempio, “Java Programming” diventerebbe “Java-Programming”.
package EserciziStringhe;

import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci la stringa");
		String input = interceptor.nextLine();
		interceptor.close();
		
		char lettera;
		
		for(int i=0; i<input.length(); i++) {
			
			if(input.charAt(i)==' ') {
				lettera='-';
			}
			else {
				lettera=input.charAt(i);
			}
			System.out.print(lettera);
		}
	}

}
