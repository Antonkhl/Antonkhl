import java.util.Scanner;

public class fizzbuzz {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("Första talet?");
	int n1 = input.nextInt();
	
	System.out.println("Andra talet?");
	int n2 = input.nextInt();
	
	System.out.println("Tredje talet?");
	int n3 = input.nextInt();
		
	 for (int tal= 1; tal <=n3 ; tal++) {

		 if (tal%n1 == 0 && tal%n2==0) {
				System.out.println("Fizzbuzz");
		 }
				
				else if (tal%n1 == 0) {
					System.out.println("fizz");
				}
				
				else if (tal%n2 == 0) {
					System.out.println("buzz");
				}
				else {
					System.out.println(tal);
		 
		 }
	}
	}

			
			
			
			
			
			
			
			
}
