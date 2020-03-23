import java.util.Scanner;
import java.util.Random;


public class talspelet {
	
	public static void main(String[] args) {
		playersName("name");
		//Anger vilket method jag vill se b�rja med
	}
	
	
	
	public static void playersName(String namn) {
		System.out.println("Hej och v�lkommen till mitt talspel! Idag ska vi se om du har vad som kr�vs f�r att gissa tal, men innan vi b�rjar, vad heter du?");
		Scanner input = new Scanner(System.in);
	    namn = input.nextLine();
		System.out.println("Hej " + namn + "! och jag hoppas att du kommer ha det kul");
		
		minMaxNumbers(namn,0,0,0);
		//Jag anger den n�sta methoden som programet ska till, dessutom sparar jag v�rden i methoden som jag kan sen anv�nda igen
		

	}
	
	public static void minMaxNumbers(String namn, int minNumber, int maxNumber, int slumpTal) {
		System.out.println("Innan jag ber�ttar reglerna f�r dig vill jag att ni anger max och min tal f�r spelet");
		System.out.println("Det �r mellan de tv� tal som talet kommer slumpas");
		
		System.out.println("B�rja med att ange mintalet");
		Scanner input = new Scanner(System.in);
		minNumber = input.nextInt();
		
		System.out.println("Ange nu maxtalet");
	    maxNumber = input.nextInt();
	    
	    Random random = new Random();
	    slumpTal = random.nextInt(maxNumber - minNumber +1) + minNumber;
	    //Slumpar talet, orsak f�r minnumber och +1 �r d� f�r att s�kerst�lla att det �r mellan dom tv� intervaler och into 0-10 eller n�got.
	    
	    limitOnTries(0,namn,slumpTal);
	    
	  
	
		
	}
	
	public static void limitOnTries(int numberOfTries, String namn, int slumpTal) {
		String svar1 = "Ja";
		String svar2 = "Nej";
		//Jag f�rbereder dom tv� svaren jag vill ha
		
		
		System.out.println("Vill du ha begr�nsningar p� f�rs�k? (Ja/Nej)");
		Scanner input = new Scanner(System.in);
		String limit = input.nextLine();
		
		if (limit.equals(svar1)) {
	    System.out.println("Ok! Hur m�nga f�rs�k vill du ha p� dig?");
	    numberOfTries = input.nextInt();
		mainGame1(0,namn,numberOfTries,slumpTal,0,0,0,0);
	   
		}
		
		if (limit.equals(svar2)) {
			System.out.println("Ok " + namn + ", d� g�r vi vidare!");
		mainGame2(0,namn,slumpTal,0,0);
		
		}
		
		// Jag f�rbereder tv� olika methoder f�r dom tv� olika val spelaren har, maingame1 vilket �r d� om spelaren vill ha en begr�nsning p� f�rs�k och maingame2 vilket �r d� om spelaren inte vill ha det.
		//Anv�nder limit.equals f�r att j�mf�ra svaren. 
		
		else {
			System.out.println("Jag vill att du svarar Ja eller Nej");
			limitOnTries(0,namn,slumpTal);
		}
		//Om spelaren svarar n�got som inte �r Ja eller Nej ville jag att spelet skulle startas om, vilket �r vad som h�nder h�r
		


		
	}
	
	
	public static void mainGame2(int gissning, String namn, int slumptal, int substration, int tries) {
		System.out.println("Ok Innan vi b�rjar ska jag ber�tta f�r dig exakt hur spelet fungerar");
		System.out.println("Jag kommer att slumpa ett tal mellan ditt minnumber och maxnumber");
		System.out.println("Ditt jobb �r att gissa mellan dom tv� intervaller och beroende p� vilket tal du gissar kommer jag antigen s�ga mer eller mindre");
		System.out.println("N�r spelet �r slut kommer jag ge dig all statistik om spelet som du beh�ver");
		System.out.println("Med det sagt, kan vi k�ra ig�ng!");
		System.out.println("Gissa p� ett tal mellan dina tv� intervaler");

		Scanner input = new Scanner(System.in); 
		
		while (gissning != slumptal) { //Loop f�r att det ska upprepas tills talet hittas
			gissning = input.nextInt();
			substration = gissning - slumptal; // Enkel ekvation, om substrationen blir under 0 d� betyder det att talet �r f�r stor och om det blir �ver 0 d� betyder det att den �r f�r liten, vilket �r varf�r jag gjorde en s�n system 
			
			if (substration>0) {
				System.out.println("mindre");
			}
			
			if (substration<0) {
				System.out.println("Mer");
			}
			tries++;
			
			if (substration == 0) {
				afterGame2(namn, tries, slumptal); //N�r talet har d� hittas ska aftergame methoden anges
			}
			
		}
	}
	
	
    public static void mainGame1(int gissning, String namn, int numberOfTries, int slumptal, int substration, int tries, int triesThatTook, int triesleft) {
    	System.out.println("Ok Innan vi b�rjar ska jag ber�tta f�r dig exakt hur spelet fungerar");
		System.out.println("Jag kommer att slumpa ett tal mellan ditt minnumber och maxnumber");
		System.out.println("Ditt jobb �r att gissa mellan dom tv� intervaller och beroende p� vilket tal du gissar kommer jag antigen s�ga mer eller mindre");
		System.out.println("Dessutom kommer jag ochs� meddela dig hur m�nga f�rs�k du har kvar");
		System.out.println("N�r spelet �r slut kommer jag ge dig all statistik om spelet som du beh�ver");
		System.out.println("Med det sagt, kan vi k�ra ig�ng!");
		System.out.println("Gissa p� ett tal mellan dina tv� intervaler");
		
		Scanner input = new Scanner(System.in); 
		triesThatTook = numberOfTries;
	
		
		while (gissning != slumptal || tries != numberOfTries) {
			gissning = input.nextInt();
			substration = gissning - slumptal;
			
			if (substration>0) {
				System.out.println("Mindre");
			}
			
			if (substration<0) {
				System.out.println("Mer");
			}
			
			
			
			tries++;
			triesleft = numberOfTries-tries; //En r�knare f�r att se hur m�nga f�rs�k spelaren har kvar 
			System.out.println("Du har " + triesleft + " F�rs�k kvar"); //informerar hur m�nga f�rs�k spelaren har kvar
			if (substration == 0 || tries == numberOfTries) {
				afterGame(namn, triesleft, tries, slumptal, numberOfTries);
			}
		}
		
		
		
	}
    
    public static void afterGame(String namn, int triesleft, int tries, int slumptal, int numberOfTries) {
    	System.out.println("Nu �r spelet slut!, talet var " + slumptal);
    	System.out.println("Det tog dig " + tries + " f�rs�k av m�jliga " + numberOfTries + " f�rs�k. Du hade " + triesleft + " kvar");
    	System.out.println("Nu " + namn + " Skulle du vilja k�ra spelet igen? (Ja/Nej)"); 
    	//all statistik om spelet
    	
    	Scanner input = new Scanner(System.in); 
    	String svar1 = "Ja";
    	String svar2 = "Nej"; 
    	String svar = input.nextLine();
    	
    	//Dom tv� svar som jag vill ha fr�n spelaren
    	
    	if(svar.equals(svar1)) {
    		playersName(namn);
    	}
    	//Spelet ska b�rja om fr�n f�rst b�rjan om spelaren svarar ja p� fr�gan
    	
    	if(svar.equals(svar2)) {
    	   System.out.println("Ok! Ha det s� bra!");
    	   System.exit(0);

    	}
    	//Om spelaren svarar nej ska spelet avslutas, vilket �r varf�r jag har system exit som terminatar programet.
    	
    	else {
    		System.out.println("Jag vill ha antigen en Ja eller Nej!");
    	}
    	
    }
    
    public static void afterGame2(String namn, int tries, int slumptal) {
    	System.out.println("Nu �r spelet slut!, talet var " + slumptal);
    	System.out.println("Det tog dig " + tries + " F�rs�k");
    	System.out.println("Nu " + namn + " Skulle du vilja k�ra spelet igen? (Ja/Nej)");
    	Scanner input = new Scanner(System.in); 
    	String svar1 = "Ja";
    	String svar2 = "Nej";
    	String svar = input.nextLine();
    	
    	if(svar.equals(svar1)) {
    		playersName(namn);
    	}
    	
    	if(svar.equals(svar2)) {
    	   System.out.println("Ok! Ha det s� bra!");
    	   System.exit(0);
    	  
    	}
    	
    	else {
    		System.out.println("Jag vill ha antigen en Ja eller Nej!");
    	}
    }
    
    

    
	

}
