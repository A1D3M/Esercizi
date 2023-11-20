//Esercizio 8: Verifica Palindromo: Crea un esercizio in cui gli studenti devono scrivere un programma che determini se una stringa è un palindromo (una parola che si legge allo stesso modo in entrambe le direzioni, come “radar” o “anna”).
package EserciziStringhe;

import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci la stringa");
		String input = interceptor.nextLine();
		interceptor.close();
		
		int x = input.length()-1;
		boolean check = true;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)!=input.charAt(x)) {
				check = false;
			}
			x--;
		}
		if (check) {
			System.out.println(input + " è palindromo");
		}
		else {
			System.out.println(input + " non è palindromo");
		}
	}

}
