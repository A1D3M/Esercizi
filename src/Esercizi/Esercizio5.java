//Verifica Numero Primo: Scrivere un programma che legge un numero intero e verifica se è primo o no.
//Un numero primo è un numero maggiore di 1 che ha solo due divisori: 1 e se stesso.
package Esercizi;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		
		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci numero");
		int input = interceptor.nextInt();
		interceptor.close();
		
		boolean primo= false;
		
		if(input<=1) {
			primo=false;
		}
		else {
			for (int i=2; i<=input/2; i++) {
				if((input%i)==0) {
					primo=false;
				}
				else {
					primo=true;
				}
			}
		}
		
		if(primo) {
			System.out.println(input + " è primo");
		} 
		else {
			System.out.println(input + " non è primo");
		}
		
		
		
	}

}
	
