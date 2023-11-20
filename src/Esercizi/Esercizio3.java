//Esercizio 3: Generatore di Numeri Casuali: Scrivere un programma che genera un numero casuale tra 1 e 100
//e chiede all’utente di indovinarlo.
//Il programma dovrebbe dare suggerimenti se il numero indovinato è troppo alto o troppo basso.
package Esercizi;

import java. util. Random;
import java.util.Scanner;


public class Esercizio3 {

	public static void main(String[] args) {

		Random numero = new Random();
		
		int result=numero.nextInt(100-1)+1;
		
		Scanner interceptor = new Scanner(System.in);
		int input = interceptor.nextInt();
		
//		if(input==result) {
//			System.out.println("Giusto!");
//		}
//		else {
//			if(input<result) {
//				System.out.println("Troppo basso");
//			}
//			else {
//				System.out.println("Troppo alto");
//			}
//		}
		while(result!=input) {
			if(input<result) {
				System.out.println("Troppo basso");
				input = interceptor.nextInt();
			}
			else {
				System.out.println("Troppo alto");
				input = interceptor.nextInt();
			}
		}
		interceptor.close();
		System.out.println("Giusto!");
	}

}
