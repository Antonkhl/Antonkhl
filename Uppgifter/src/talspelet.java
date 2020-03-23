import java.util.Scanner;
import java.util.Random;

public class talspelet {
	
	
	public static void playersName(String namn) {
		System.out.println("Hej och välkommen till mitt talspel! Idag ska vi få se om du har vad som krävs för att gissa tal, men innan vi börjar, vad heter du?");
		Scanner input = new Scanner(System.in);
	    namn = input.nextLine();
		System.out.println("Hej" + namn + "och jag hoppas att du har det roligt!");
		
		minMaxNumbers(namn,0,0,0);
		

	}
	
	public static void minMaxNumbers(String namn, int minNumber, int maxNumber, int slumpTal) {
		System.out.println("Innan jag berättar regler för spelet vill jag att ni anger max och min tal för spelet. Det är mellan dessa två tal som talet kommer slumpas mellan");
		
		System.out.println("Börja med att ange mintalet");
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

		
		System.out.println("Vill du ha begränsningar på försök? (Ja/Nej)");
		Scanner input = new Scanner(System.in);
		String limit = input.nextLine();
		
		if (limit.equals(svar1)) {
	    System.out.println("Ok! Hur många försök vill du ha på dig?");
	    numberOfTries = input.nextInt();
	   
		}
		
		if (limit.equals(svar2)) {
			System.out.println("Ok " + namn + ", då går vi vidare!");
			numberOfTries = 3251;
		}
		
		else {
			System.out.println("Jag vill att du svarar Ja eller Nej");
		}
		
		mainGame(0,namn,numberOfTries,slumpTal,0,0,0,0);
		
		
	}
	
	
    public static void mainGame(int gissning, String namn, int numberOfTries, int slumptal, int substration, int tries, int triesThatTook, int triesleft) {
		System.out.println("Ok Innan vi börjar ska jag berätta för dig exakt hur spelet fungerar, "
				+ "Jag kommer att slumpa ett tal mellan ditt minnumber och maxnumber, "
				+ "Du ska gissa ett tal mellan dom två intervaler och beroende på det talet du gissar kommer jag antigen säga mindre eller mer"
				+ "Om du har begränsning på försök kommer jag ochså meddela hur många försök du har kvar"
				+ "När spelet är slut kommer jag ger dig all statistik som du behöver"
				+ "Med det sagt, kan vi köra igång!");
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
			System.out.println("Du har " + triesleft + "Försök kvar");
		}
		
		afterGame(namn, triesleft, tries, slumptal, numberOfTries);
		
		
		
    	
	}
    
    public static void afterGame(String namn, int triesleft, int tries, int slumptal, int numberOfTries) {
    	System.out.println("Nu är spelet slut!, talet var" + slumptal);
    	System.out.println("Det tog dig " + tries + "försök av möjliga " + numberOfTries + "försök. Du hade" + triesleft + "kvar");
    	System.out.println("Nu" + namn + "Skulle du vilja köra spelet igen? (Ja/Nej)");
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
