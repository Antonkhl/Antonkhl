package a;

public class Methoder {
	
	static double G = 9.82;
	static double p_0 = 1000;
	static double c = 299792458;
	
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50)); // Anropar värdet för fahrenheit
		System.out.println(kelvinToCelsius(0)); // Anropar värdet för kelvin
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1,10));

		
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		double FatoCe = (fahrenheit-32)*5/9; // Använder formlen för att omvandla värden
		return FatoCe; //Returner värdet
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double KetoCe = kelvin - 273.15; // Använder formlen för att omvandla värden
		return KetoCe; //Returnar värdet
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double FluPre = G*fluid.density*deep; //Använder formeln, och jag importerar densiteten från mina enums för att använda för min method
		return FluPre; //Returnar värdet
		
	}
	
	public static double pressureUnderWater(double deep) {
		double PreWat = 997*G*deep; //Här använder jag densiteten för vatten, orsak den frågar om vatten
		return PreWat; //Returnar värdet
	}
		
	
	public static double kineticEnergy(double mass, double velocity) {
		double KiEn = (mass*(velocity*velocity))/2; // Använder formeln, använder velocity*veolicty för det är samma som velocity^2
		return KiEn; // Returnar värdet
		
	}
	
	public static double potentialEnergy(double mass, double height) {
		double PoEn = mass*G*height; // Använder formlen, 
		return PoEn; // Returnar värdet
		
	}
	
	public static double fallSpeed(double height) {
		double FaSpe = Math.sqrt(2*G*height); // Använder formlen v^2 = 2as, jag omvandlar formeln då till v = rotenur 2as
		return FaSpe; // Returnar värdet
	}
	
	public static double delta(double first, double last) {
		double Result = first-last; //Gör ekvationen
		return Result; // Returnar värdet
	}
	
	public static double 
	
	
	

	

}
