import java.util.Scanner;

public class talspelet {

	public static void main(String[] args) {
		System.out.println(playersName());
		System.out.println(minMaxNumbers());
		System.out.println(limitOnTries());
		

	}
	
	
	
	public static String playersName() {
		System.out.println("Hej och välkommen till mitt talspel! Idag ska vi få se om du har vad som krävs för att gissa tal, men innan vi börjar, vad heter du?");
		Scanner input = new Scanner(System.in);
		String namn = input.nextLine();
		System.out.println("Hej" + namn + "och jag hoppas att du har det roligt!");
		return namn;
	}
	
	public static int minMaxNumbers() {
		
	}
	
	public static int limitOnTries() {
		
	}
	
	
    public static void mainGame() {
		
	}
    
    public static void afterGame() {
    	
    }
    
	

}
