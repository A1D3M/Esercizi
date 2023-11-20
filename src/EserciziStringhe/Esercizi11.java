//Esercizio 11: Ricerca di Sottostringhe: Scrivere un programma che cerchi una sottostringa all’interno di una stringa data e stampi la posizione di inizio di quella sottostringa. Se la sottostringa non è presente, il programma dovrebbe stampare un messaggio appropriato.
package EserciziStringhe;

import java.util.Scanner;

public class Esercizi11 {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		
		System.out.println("inserisci la stringa");
		String input1 = interceptor.nextLine();
		
		System.out.println("inserisci la sottostringa da cercare");
		String input2 = interceptor.nextLine();
		interceptor.close();
		
		boolean check= false;
		for(int i=0; i<input1.length(); i++) {
			if(input1.charAt(i)==input2.charAt(0) && i+input2.length()<=input1.length()) {
				for(int x=0; x<input2.length(); x++) {
					if(input1.charAt(i+x)==input2.charAt(x)) {
						check=true;
					}
					else {
						check=false;
					}
				}
				if (check) {
					System.out.println("la sottostringa è presente e inizia alla posizione " + i);
				}
			
			}
		}
		
		if (!check) {
			System.out.println("Sottostringa non trovata");
		}
	}

}
