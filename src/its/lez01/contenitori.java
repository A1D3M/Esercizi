package its.lez01;

public class contenitori {

	public static void main(String[] args) {
		
		int[] elenco = new int[5];
		
		elenco[0]=5;
		elenco[1]=45;
		elenco[2]=53;
		elenco[3]=32;
		elenco[4]=8;
		
		for(int i=0; i<elenco.length; i++){
			System.out.println(elenco[i]);
		}
		
		String[] invitati = {"Giovanni", "Mario", "Valeria"};
		
		for(int i =0; i<invitati.length; i++) {
			System.out.println(invitati[i]);
		}
		

	}

}
