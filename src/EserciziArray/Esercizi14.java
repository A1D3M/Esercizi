//Esercizio 14: Verifica Elemento nell’Array: Scrivere un programma che controlla se un determinato elemento è presente in un array. Ad esempio, data una lista di numeri e un numero da cercare, il programma dovrebbe stampare se il numero è presente o meno.
package EserciziArray;

import java.util.Scanner;

public class Esercizi14 {

	public static void main(String[] args) {

		int length = 5;
		int a[]= new int [length];
		for (int i=0; i<length; i++) {
			a[i] = i+1;	
			
		}
		

		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci il numero");
		int input = interceptor.nextInt();
		interceptor.close();
		
		boolean presente=false;
		for (int i=0; i<length; i++) {
			if (a[i]==input) {
				presente=true;
			}
		}
		
		if(presente) {
			System.out.println("Il numero è presente");
		}
		else {
			System.out.println("Il numero non è presente");
		}
	}

}
