//Esercizio 20: Sistema di Prenotazione Alberghiera: Definisci una classe Camera con attributi come numero della camera e stato (libera/occupata). Il programma dovrebbe creare un array di Camera e permettere all’utente di “prenotare” o “liberare” una camera, aggiornando lo stato di conseguenza.

package EserciziOggetti;

import java.util.Scanner;

public class Esercizio20 {

	public static void main(String[] args) {
		
		Scanner interceptor = new Scanner(System.in);		

		Camera[] elenco = new Camera[3];
		
		elenco[0]= new Camera();
		elenco[0].setNumero(321);
		elenco[0].setStato("libera");
		elenco[0].stampaDati();
		
		elenco[1]= new Camera();
		elenco[1].setNumero(654);
		elenco[1].setStato("libera");
		elenco[1].stampaDati();
		
		elenco[2]= new Camera();
		elenco[2].setNumero(431);
		elenco[2].setStato("occupata");
		elenco[2].stampaDati();
		

		System.out.println("inserisci numero della camera");
		int num= interceptor.nextInt();
		interceptor.nextLine();
		
		
		boolean esiste=false;
		for(int i=0; i<elenco.length; i++) {
			if(num==elenco[i].getNumero()) {
				esiste=true;
				String stato=elenco[i].getStato();
				if(stato=="libera") {
					System.out.println("La camera è libera. Se desidera prenotarla digiti Y");
					String prenota=interceptor.nextLine();
					if(prenota.equalsIgnoreCase("y")) {
						elenco[i].setStato("occupata");
						System.out.println("Camera prenotata");
					}
				}
				else {
					System.out.println("La camera è occupata. Se desidera liberarla digiti Y");
					String prenota=interceptor.nextLine();
					if(prenota.equalsIgnoreCase("y")) {
						elenco[i].setStato("libera");
						System.out.println("Camera liberata");
					}
				}
			}
		}
		interceptor.close();

		if(!esiste) {
			System.out.println("Camera non trovata");
		}

	}

}
