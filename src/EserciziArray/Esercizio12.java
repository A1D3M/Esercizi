//Esercizio 12: Ricerca del Massimo e del Minimo: Scrivi un programma che inizializza un array di numeri interi e trova il valore massimo e minimo nell’array. Ad esempio, per l’array [1, 2, 3, 4, 5], il programma dovrebbe stampare il massimo: 5 e il minimo: 1.
package EserciziArray;

public class Esercizio12 {

	public static void main(String[] args) {

		int length = 5;
		int a[]= new int[length];
		for (int i=0; i<a.length; i++) {
			a[i] = i+1;
			
		}
		
		int max=a[0];
		int min=a[0];
		
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Il numero massimo è " + max + ", Il numero minimo è " + min);
	}

}
