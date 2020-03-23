import java.util.Scanner;
import java.util.Random;

public class talspelet {
	
	
	public static void playersName(String namn) {
		System.out.println("Hej och v�lkommen till mitt talspel! Idag ska vi f� se om du har vad som kr�vs f�r att gissa tal, men innan vi b�rjar, vad heter du?");
		Scanner input = new Scanner(System.in);
	    namn = input.nextLine();
		System.out.println("Hej" + namn + "och jag hoppas att du har det roligt!");
		
		minMaxNumbers(namn,0,0,0);
		

	}
	
	public static void minMaxNumbers(String namn, int minNumber, int maxNumber, int slumpTal) {
		System.out.println("Innan jag ber�ttar regler f�r spelet vill jag att ni anger max och min tal f�r spelet. Det �r mellan dessa tv� tal som talet kommer slumpas mellan");
		
		System.out.println("B�rja med att ange mintalet");
		Scanner input = new Scanner(System.in);
		minNumber = input.nextInt();
		
		System.out.println("Ange nu maxtalet");
	    maxNumber = input.nextInt();
	    
	    Random random = new Random();
	    slumpTal = random.nextInt(maxNumber - minNumber +1) + minNumber;
	    
	    limitOnTries(0,namn,slumpTal);
	    
	  
	
		
	}
	
	public static void limitOnTries(int numberOfTries, String namn, int slumpTal) {
		String svar1 = "Ja";
		String svar2 = "Nej";

		
		System.out.println("Vill du ha begr�nsningar p� f�rs�k? (Ja/Nej)");
		Scanner input = new Scanner(System.in);
		String limit = input.nextLine();
		
		if (limit.equals(svar1)) {
	    System.out.println("Ok! Hur m�nga f�rs�k vill du ha p� dig?");
	    numberOfTries = input.nextInt();
	   
		}
		
		if (limit.equals(svar2)) {
			System.out.println("Ok " + namn + ", d� g�r vi vidare!");
			numberOfTries = 3251;
		}
		
		else {
			System.out.println("Jag vill att du svarar Ja eller Nej");
		}
		
		mainGame(0,namn,numberOfTries,slumpTal,0,0,0,0);
		
		
	}
	
	
    public static void mainGame(int gissning, String namn, int numberOfTries, int slumptal, int substration, int tries, int triesThatTook, int triesleft) {
		System.out.println("Ok Innan vi b�rjar ska jag ber�tta f�r dig exakt hur spelet fungerar, "
				+ "Jag kommer att slumpa ett tal mellan ditt minnumber och maxnumber, "
				+ "Du ska gissa ett tal mellan dom tv� intervaler och beroende p� det talet du gissar kommer jag antigen s�ga mindre eller mer"
				+ "Om du har begr�nsning p� f�rs�k kommer jag ochs� meddela hur m�nga f�rs�k du har kvar"
				+ "N�r spelet �r slut kommer jag ger dig all statistik som du beh�ver"
				+ "Med det sagt, kan vi k�ra ig�ng!");
		Scanner input = new Scanner(System.in); 
		triesThatTook = numberOfTries;
	
		
		while (gissning != slumptal || tries != numberOfTries) {
			gissning = input.nextInt();
			substration = gissning - slumptal;
			
			if (substration>0) {
				System.out.println("mindre");
			}
			
			if (substration<0) {
				System.out.println("Mer");
			}
			
			tries++;
			triesThatTook--;
			triesleft = numberOfTries-triesThatTook;
			System.out.println("Du har " + triesleft + "F�rs�k kvar");
		}
		
		afterGame(namn, triesleft, tries, slumptal, numberOfTries);
		
		
		
    	
	}
    
    public static void afterGame(String namn, int triesleft, int tries, int slumptal, int numberOfTries) {
    	System.out.println("Nu �r spelet slut!, talet var" + slumptal);
    	System.out.println("Det tog dig " + tries + "f�rs�k av m�jliga " + numberOfTries + "f�rs�k. Du hade" + triesleft + "kvar");
    	System.out.println("Nu" + namn + "Skulle du vilja k�ra spelet igen? (Ja/Nej)");
    	Scanner input = new Scanner(System.in); 
    	String svar1 = "Ja";
    	String svar2 = "Nej";
    	String svar = input.nextLine();
    	
    	if(svar.equals(svar1)) {
    		minMaxNumbers(namn,0,0,0);
    	}
    	
    	if(svar.equals(svar2)) {
    	   return;
    	}
    	
    	else {
    		System.out.println("Jag vill ha antigen en Ja eller Nej!");
    	}
    	
    }
    
	

}
