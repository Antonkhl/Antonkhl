package a;

public class Methoder {
	
	static double G = 9.82;
	static double p_0 = 1000;
	static double c = 299792458;
	
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50)); // Anropar v�rdet f�r fahrenheit
		System.out.println(kelvinToCelsius(0)); // Anropar v�rdet f�r kelvin
		System.out.println(fluidPressure(FluidTable.WATER, 10));
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		double FatoCe = (fahrenheit-32)*5/9; // Anv�nder formlen f�r att omvandla v�rden
		return FatoCe; //Returnar v�rdet
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double KetoCe = kelvin - 273.15; // Anv�nder formlen f�r att omvandla v�rden
		return KetoCe; //Returnar v�rdet
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double FluPre = G*fluid.density*deep;
		return FluPre;
		
	}
	

}
