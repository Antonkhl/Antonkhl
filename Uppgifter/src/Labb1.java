import java.util.Scanner;

public class Labb1 {

	public static Double outputDouble() { // Vi vill ha en double inte en Int
		Scanner input = new Scanner(System.in); // Gl�mde ";"
		return input.nextDouble();
	}

	public static void kostnadCounter(int product) {
		for (int i = 1; i <= 10; i++) { //Gl�mde att �ka i med 1
			System.out.println(i*product + ", ");
	}
	} // St�nga sj�lva methoden

	public static void summaCounter(int a, int b) {
		int sum = a + b; // Man m�ste g�ra sum till en int, eller kan man direkt importera det fr�n () i methoden. B�de fungerar
		System.out.println(sum); // Methoden �r void, vilket betyder den kan inte �terv�nda n�gon v�rde med return.
	}

	public static String compareLetters(String str, char c, int i) { // B�sta att g�ra den till en String, f�r att det �r en string som vi huvudsakligen j�mf�r 2 bokstaver till.
		char c2 = str.charAt(i); // Den �r ingen idea att g�ra det till en string f�r att det �r bara en bokstav vi ska j�mf�ra med varandra.
		if(c2 == c) {
			return "true";
		}else {
			return "false";
		}
	}

	public static void listLength(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) { // Gl�mde en "="
			 System.out.println(i); // Methoden �r en void, man kan inte returna i en void method
			}
		}
	}
	

}