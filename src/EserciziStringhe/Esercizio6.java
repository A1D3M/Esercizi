//Esercizio 6: Conteggio delle Vocali e Consonanti: Scrivi un programma che legga una stringa dall’utente e stampi il numero di vocali e consonanti presenti nella stringa. Ad esempio, per la stringa “Hello World”, il programma dovrebbe stampare il numero di vocali: 3 e il numero di consonanti: 7.

package EserciziStringhe;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci la stringa");
		String input = interceptor.nextLine().toUpperCase();
		interceptor.close();
		int vocali=0;
		int consonanti=0;
		
		for (int i =0 ; i<input.length(); i++) {
//			if (input.charAt(i)== 'A' || input.charAt(i)== 'E' || input.charAt(i)== 'I' || input.charAt(i)== 'O' || input.charAt(i)== 'U') {
//				vocali++;
//			}
//			
//			else if(input.charAt(i)>= 'B' || input.charAt(i)<='Z') {
//				consonanti++;
//			}
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (input.charAt(i)== 'A' || input.charAt(i)== 'E' || input.charAt(i)== 'I' || input.charAt(i)== 'O' || input.charAt(i)== 'U') {
					vocali++;
				} else {
					consonanti++;
				}
			}
		}
		
		System.out.println("Il numero di vocali è " + vocali + ", il numero di consonanti è " + consonanti);
	}

}
