package a;

public class Methoder {
	
	static double G = 9.82;
	static double p_0 = 1000;
	static double c = 299792458;
	
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50)); // Anropar v�rdet f�r fahrenheit
		System.out.println(kelvinToCelsius(0)); // Anropar v�rdet f�r kelvin
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1,10));

		
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		double FatoCe = (fahrenheit-32)*5/9; // Anv�nder formlen f�r att omvandla v�rden
		return FatoCe; //Returner v�rdet
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double KetoCe = kelvin - 273.15; // Anv�nder formlen f�r att omvandla v�rden
		return KetoCe; //Returnar v�rdet
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double FluPre = G*fluid.density*deep; //Anv�nder formeln, och jag importerar densiteten fr�n mina enums f�r att anv�nda f�r min method
		return FluPre; //Returnar v�rdet
		
	}
	
	public static double pressureUnderWater(double deep) {
		double PreWat = 997*G*deep; //H�r anv�nder jag densiteten f�r vatten, orsak den fr�gar om vatten
		return PreWat; //Returnar v�rdet
	}
		
	
	public static double kineticEnergy(double mass, double velocity) {
		double KiEn = (mass*(velocity*velocity))/2; // Anv�nder formeln, anv�nder velocity*veolicty f�r det �r samma som velocity^2
		return KiEn; // Returnar v�rdet
		
	}
	
	public static double potentialEnergy(double mass, double height) {
		double PoEn = mass*G*height; // Anv�nder formlen, 
		return PoEn; // Returnar v�rdet
		
	}
	
	public static double fallSpeed(double height) {
		double FaSpe = Math.sqrt(2*G*height); // Anv�nder formlen v^2 = 2as, jag omvandlar formeln d� till v = rotenur 2as
		return FaSpe; // Returnar v�rdet
	}
	
	public static double delta(double first, double last) {
		double Result = first-last; //G�r ekvationen
		return Result; // Returnar v�rdet
	}
	
	public static double 
	
	
	

	

}
