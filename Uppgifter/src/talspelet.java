import java.util.Scanner;
import java.util.Random;


public class talspelet {
	
	public static void main(String[] args) {
		playersName("name");
		//Anger vilket method jag vill se börja med
	}
	
	
	
	public static void playersName(String namn) {
		System.out.println("Hej och välkommen till mitt talspel! Idag ska vi se om du har vad som krävs för att gissa tal, men innan vi börjar, vad heter du?");
		Scanner input = new Scanner(System.in);
	    namn = input.nextLine();
		System.out.println("Hej " + namn + "! och jag hoppas att du kommer ha det kul");
		
		minMaxNumbers(namn,0,0,0);
		//Jag anger den nästa methoden som programet ska till, dessutom sparar jag värden i methoden som jag kan sen använda igen
		

	}
	
	public static void minMaxNumbers(String namn, int minNumber, int maxNumber, int slumpTal) {
		System.out.println("Innan jag berättar reglerna för dig vill jag att ni anger max och min tal för spelet");
		System.out.println("Det är mellan de två tal som talet kommer slumpas");
		
		System.out.println("Börja med att ange mintalet");
		Scanner input = new Scanner(System.in);
		minNumber = input.nextInt();
		
		System.out.println("Ange nu maxtalet");
	    maxNumber = input.nextInt();
	    
	    Random random = new Random();
	    slumpTal = random.nextInt(maxNumber - minNumber +1) + minNumber;
	    //Slumpar talet, orsak för minnumber och +1 är då för att säkerställa att det är mellan dom två intervaler och into 0-10 eller något.
	    
	    limitOnTries(0,namn,slumpTal);
	    
	  
	
		
	}
	
	public static void limitOnTries(int numberOfTries, String namn, int slumpTal) {
		String svar1 = "Ja";
		String svar2 = "Nej";
		//Jag förbereder dom två svaren jag vill ha
		
		
		System.out.println("Vill du ha begränsningar på försök? (Ja/Nej)");
		Scanner input = new Scanner(System.in);
		String limit = input.nextLine();
		
		if (limit.equals(svar1)) {
	    System.out.println("Ok! Hur många försök vill du ha på dig?");
	    numberOfTries = input.nextInt();
		mainGame1(0,namn,numberOfTries,slumpTal,0,0,0,0);
	   
		}
		
		if (limit.equals(svar2)) {
			System.out.println("Ok " + namn + ", då går vi vidare!");
		mainGame2(0,namn,slumpTal,0,0);
		
		}
		
		// Jag förbereder två olika methoder för dom två olika val spelaren har, maingame1 vilket är då om spelaren vill ha en begränsning på försök och maingame2 vilket är då om spelaren inte vill ha det.
		//Använder limit.equals för att jämföra svaren. 
		
		else {
			System.out.println("Jag vill att du svarar Ja eller Nej");
			limitOnTries(0,namn,slumpTal);
		}
		//Om spelaren svarar något som inte är Ja eller Nej ville jag att spelet skulle startas om, vilket är vad som händer här
		


		
	}
	
	
	public static void mainGame2(int gissning, String namn, int slumptal, int substration, int tries) {
		System.out.println("Ok Innan vi börjar ska jag berätta för dig exakt hur spelet fungerar");
		System.out.println("Jag kommer att slumpa ett tal mellan ditt minnumber och maxnumber");
		System.out.println("Ditt jobb är att gissa mellan dom två intervaller och beroende på vilket tal du gissar kommer jag antigen säga mer eller mindre");
		System.out.println("När spelet är slut kommer jag ge dig all statistik om spelet som du behöver");
		System.out.println("Med det sagt, kan vi köra igång!");
		System.out.println("Gissa på ett tal mellan dina två intervaler");

		Scanner input = new Scanner(System.in); 
		
		while (gissning != slumptal) { //Loop för att det ska upprepas tills talet hittas
			gissning = input.nextInt();
			substration = gissning - slumptal; // Enkel ekvation, om substrationen blir under 0 då betyder det att talet är för stor och om det blir över 0 då betyder det att den är för liten, vilket är varför jag gjorde en sån system 
			
			if (substration>0) {
				System.out.println("mindre");
			}
			
			if (substration<0) {
				System.out.println("Mer");
			}
			tries++;
			
			if (substration == 0) {
				afterGame2(namn, tries, slumptal); //När talet har då hittas ska aftergame methoden anges
			}
			
		}
	}
	
	
    public static void mainGame1(int gissning, String namn, int numberOfTries, int slumptal, int substration, int tries, int triesThatTook, int triesleft) {
    	System.out.println("Ok Innan vi börjar ska jag berätta för dig exakt hur spelet fungerar");
		System.out.println("Jag kommer att slumpa ett tal mellan ditt minnumber och maxnumber");
		System.out.println("Ditt jobb är att gissa mellan dom två intervaller och beroende på vilket tal du gissar kommer jag antigen säga mer eller mindre");
		System.out.println("Dessutom kommer jag ochså meddela dig hur många försök du har kvar");
		System.out.println("När spelet är slut kommer jag ge dig all statistik om spelet som du behöver");
		System.out.println("Med det sagt, kan vi köra igång!");
		System.out.println("Gissa på ett tal mellan dina två intervaler");
		
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
			triesleft = numberOfTries-tries; //En räknare för att se hur många försök spelaren har kvar 
			System.out.println("Du har " + triesleft + " Försök kvar"); //informerar hur många försök spelaren har kvar
			if (substration == 0 || tries == numberOfTries) {
				afterGame(namn, triesleft, tries, slumptal, numberOfTries);
			}
		}
		
		
		
	}
    
    public static void afterGame(String namn, int triesleft, int tries, int slumptal, int numberOfTries) {
    	System.out.println("Nu är spelet slut!, talet var " + slumptal);
    	System.out.println("Det tog dig " + tries + " försök av möjliga " + numberOfTries + " försök. Du hade " + triesleft + " kvar");
    	System.out.println("Nu " + namn + " Skulle du vilja köra spelet igen? (Ja/Nej)"); 
    	//all statistik om spelet
    	
    	Scanner input = new Scanner(System.in); 
    	String svar1 = "Ja";
    	String svar2 = "Nej"; 
    	String svar = input.nextLine();
    	
    	//Dom två svar som jag vill ha från spelaren
    	
    	if(svar.equals(svar1)) {
    		playersName(namn);
    	}
    	//Spelet ska börja om från först början om spelaren svarar ja på frågan
    	
    	if(svar.equals(svar2)) {
    	   System.out.println("Ok! Ha det så bra!");
    	   System.exit(0);

    	}
    	//Om spelaren svarar nej ska spelet avslutas, vilket är varför jag har system exit som terminatar programet.
    	
    	else {
    		System.out.println("Jag vill ha antigen en Ja eller Nej!");
    	}
    	
    }
    
    public static void afterGame2(String namn, int tries, int slumptal) {
    	System.out.println("Nu är spelet slut!, talet var " + slumptal);
    	System.out.println("Det tog dig " + tries + " Försök");
    	System.out.println("Nu " + namn + " Skulle du vilja köra spelet igen? (Ja/Nej)");
    	Scanner input = new Scanner(System.in); 
    	String svar1 = "Ja";
    	String svar2 = "Nej";
    	String svar = input.nextLine();
    	
    	if(svar.equals(svar1)) {
    		playersName(namn);
    	}
    	
    	if(svar.equals(svar2)) {
    	   System.out.println("Ok! Ha det så bra!");
    	   System.exit(0);
    	  
    	}
    	
    	else {
    		System.out.println("Jag vill ha antigen en Ja eller Nej!");
    	}
    }
    
    

    
	

}
