import java.util.Scanner;

public class talspelet {

	public static void main(String[] args) {
		System.out.println(playersName("name"));
		System.out.println(minMaxNumbers(3, 4));
		System.out.println(limitOnTries("limit"));
		

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
	
	public static String limitOnTries(String limit) {
		String svar1 = "Nej";
		String svar2 = "Ja";
		
		System.out.println("Vill du ha begränsningar på försök? (Ja/Nej)");
		Scanner input = new Scanner(System.in);
		limit = input.nextLine();
		
		if (limit = svar1) {
			
		}
	}
	
	
    public static void mainGame() {
		
	}
    
    public static void afterGame() {
    	
    }
    
	

}
