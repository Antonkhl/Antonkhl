package a;

public class Methoder {
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50)); // Anropar värdet för fahrenheit
		System.out.println(kelvinToCelsius(0)); // Anropar värdet för kelvin
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		double FatoCe = (fahrenheit-32)*5/9; // Använder formlen för att omvandla värden
		return FatoCe; //Returnar värdet
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double KetoCe = kelvin - 273.15; // Använder formlen för att omvandla värden
		return KetoCe; //Returnar värdet
	}
	

}
