import java.util.Scanner;

public class timeloop {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Vad är ditt tal?");
    int N = input.nextInt();
    
    
    for (int tal= 1; tal <=N ; tal++) {
    	System.out.println(tal + " Abracadabra");

    }
}
}
