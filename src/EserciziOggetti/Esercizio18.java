//Esercizio 18 Registro delle Automobili: Definisci una classe Automobile con attributi come marca, modello e anno. Il tuo programma dovrebbe creare un array di oggetti Automobile e permettere all’utente di inserire dati per ciascuna automobile, stampando poi tutti i dettagli (usa lo Scanner se puoi).
package EserciziOggetti;

import java.util.Scanner;

public class Esercizio18 {

	public static void main(String[] args) {
		
		Scanner interceptor = new Scanner(System.in);
		System.out.println("inserisci marca");
		Automobile.marca = interceptor.nextLine();
		System.out.println("inserisci modello");
		Automobile.modello = interceptor.nextLine();
		System.out.println("inserisci anno");
		Automobile.anno = interceptor.nextInt();
		interceptor.close();
		
		System.out.println("Marca: " + Automobile.marca);
		System.out.println("Modello: " + Automobile.modello);
		System.out.println("Anno: " + Automobile.anno);
		
	}

}
