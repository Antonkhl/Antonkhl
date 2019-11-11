package a;

public class Methoder {
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50));
		
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		double FatoCe = (fahrenheit-32)*5/9; // Använder formlen för att omvandla värden
		return FatoCe; //Returnar värdet
	}

}
