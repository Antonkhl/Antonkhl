import java.util.Scanner;

public class talspelet {

	public static void main(String[] args) {
		System.out.println(playersName("name"));
		System.out.println(minMaxNumbers(3, 4));
		System.out.println(limitOnTries("limit"));
		

	}
	
	
	
	public static String playersName(String namn) {
		System.out.println("Hej och v�lkommen till mitt talspel! Idag ska vi f� se om du har vad som kr�vs f�r att gissa tal, men innan vi b�rjar, vad heter du?");
		Scanner input = new Scanner(System.in);
	    namn = input.nextLine();
		System.out.println("Hej" + namn + "och jag hoppas att du har det roligt!");
		return namn;
	}
	
	public static int minMaxNumbers(int minNumber, int maxNumber) {
		System.out.println("Innan jag ber�ttar regler f�r spelet vill jag att ni anger max och min tal f�r spelet. Det �r mellan dessa tv� tal som talet kommer slumpas mellan");
		
		System.out.println("B�rja med att ange mintalet");
		Scanner input = new Scanner(System.in);
		minNumber = input.nextInt();
		
		System.out.println("Ange nu maxtalet");
	    maxNumber = input.nextInt();
	    
	    return minNumber;
		
	}
	
	public static String limitOnTries(String limit) {
		String svar1 = "Nej";
		String svar2 = "Ja";
		
		System.out.println("Vill du ha begr�nsningar p� f�rs�k? (Ja/Nej)");
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
