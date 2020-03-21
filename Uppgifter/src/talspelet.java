import java.util.Scanner;

public class talspelet {

	public static void main(String[] args) {
		System.out.println(playersName("name"));
		System.out.println(minMaxNumbers(3, 4));
		

	}
	
	
	
	public static String playersName(String namn) {
		System.out.println("Hej och välkommen till mitt talspel! Idag ska vi få se om du har vad som krävs för att gissa tal, men innan vi börjar, vad heter du?");
		Scanner input = new Scanner(System.in);
	    namn = input.nextLine();
		System.out.println("Hej" + namn + "och jag hoppas att du har det roligt!");
		return namn;
	}
	
	public static int minMaxNumbers(int minNumber, int maxNumber) {
		System.out.println("Innan jag berättar regler för spelet vill jag att ni anger max och min tal för spelet. Det är mellan dessa två tal som talet kommer slumpas mellan");
		
		System.out.println("Börja med att ange mintalet");
		Scanner input = new Scanner(System.in);
		minNumber = input.nextInt();
		
		System.out.println("Ange nu maxtalet");
	    maxNumber = input.nextInt();
	    
	    return minNumber;
		
	}
	
	public static void limitOnTries(int numberOfTries) {
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
			System.out.println("Ok, då går vi vidare!");
		}
		
		else {
			System.out.println("Jag vill att du svarar Ja eller Nej");
		}
		
		
	}
	
	
    public static void mainGame() {
		
	}
    
    public static void afterGame() {
    	
    }
    
	

}
