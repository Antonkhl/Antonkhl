package a;

public class Methoder {
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50));
		
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		double FatoCe = (fahrenheit-32)*5/9; // Anv�nder formlen f�r att omvandla v�rden
		return FatoCe; //Returnar v�rdet
	}

}
