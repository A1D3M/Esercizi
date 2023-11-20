//Esercizio 13: Inversione di un Array: Scrivere un programma che inverte l’ordine degli elementi in un array. Per esempio, se l’array iniziale è [1, 2, 3, 4, 5], l’array invertito sarà [5, 4, 3, 2, 1].
package EserciziArray;

public class Esercizio13 {

	public static void main(String[] args) {

		int length = 5;
		int a[]= new int [length];
		for (int i=0; i<length; i++) {
			a[i] = i+1;	
			System.out.println(a[i]);
		}
		
		int b[] = new int [length];
		int x = length-1;
		for(int i=0; i<length; i++) {
			b[i] = a[x];
			x--;
			System.out.println(b[i]);
		}
	}

}
