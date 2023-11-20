//Esercizio 7:Inversione di una Stringa: Scrivi un programma che legga una stringa e stampi la sua inversione. Ad esempio, se l’input è “Java”, l’output dovrebbe essere “avaJ”.
package EserciziStringhe;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci la stringa");
		String input = interceptor.nextLine();
		interceptor.close();
		String reverse="";
		char ch;
		
		for(int i=0; i<input.length();  i++) {
			ch= input.charAt(i);
			reverse=ch+reverse;
		}
		System.out.println(reverse);
	}

}
