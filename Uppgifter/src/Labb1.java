import java.util.Scanner;

public class Labb1 {

	public static Double outputDouble() { // Vi vill ha en double inte en Int
		Scanner input = new Scanner(System.in); // Glömde ";"
		return input.nextDouble();
	}

	public static void kostnadCounter(int product) {
		for (int i = 1; i <= 10; i++) { //Glömde att öka i med 1
			System.out.println(i*product + ", ");
	}
	} // Stänga själva methoden

	public static void summaCounter(int a, int b) {
		int sum = a + b; // Man måste göra sum till en int, eller kan man direkt importera det från () i methoden. Både fungerar
		System.out.println(sum); // Methoden är void, vilket betyder den kan inte återvända någon värde med return.
	}

	public static String compareLetters(String str, char c, int i) { // Bästa att göra den till en String, för att det är en string som vi huvudsakligen jämför 2 bokstaver till.
		char c2 = str.charAt(i); // Den är ingen idea att göra det till en string för att det är bara en bokstav vi ska jämföra med varandra.
		if(c2 == c) {
			return "true";
		}else {
			return "false";
		}
	}

	public static void listLength(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) { // Glömde en "="
			 System.out.println(i); // Methoden är en void, man kan inte returna i en void method
			}
		}
	}
	

}