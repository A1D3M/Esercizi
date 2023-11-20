//Esercizio 15: Calcolo della Media: Scrivere un programma che calcola la media dei valori presenti in un array di numeri. Ad esempio, per l’array [1, 2, 3, 4, 5], la media è 3.
package EserciziArray;

public class Esercizio15 {

	public static void main(String[] args) {

		int a [] = {1,2,3,4,5};
		int somma=0;
		
		for(int i=0; i<a.length; i++) {
			somma=somma+a[i];
		}
		int risultato = somma/a.length;
		System.out.println(risultato);
	}

}
