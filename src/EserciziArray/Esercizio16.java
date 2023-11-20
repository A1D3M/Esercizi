//Esercizio 16: Fusione di Due Array: Scrivere un programma che unisce due array di numeri interi in un unico array. Ad esempio, dati gli array [1, 2, 3] e [4, 5, 6], l’array risultante dovrebbe essere [1, 2, 3, 4, 5, 6].
package EserciziArray;

public class Esercizio16 {

	public static void main(String[] args) {

		int a [] = {1,2,3};
		int b [] = {4,5,6};
		
		int c [] = new int [a.length+b.length];
		
		for(int i=0; i<c.length; i++) {
			if (i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[i-a.length];
			}
			System.out.println(c[i]);
		}
	}

}
