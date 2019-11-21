package a;

public class Methoder {
	
	static double G = 9.82;
	static double p_0 = 1000;
	static double c = 299792458;
	
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelcius(50)); 
		System.out.println(kelvinToCelsius(0)); 
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1,10));
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));

		
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
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = volume*fluid.density; // Omvandlar formeln p = m/v till m = v*p.
		return mass; // Returnar värdet
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		double mass = volume*gas.density; // Använder samma formel som i förra uppgiften, men med gas
		return mass; // Returnar värdet
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		double mass = volume*solid.density; //Använder formeln P = M/V, jag formerar om den tills den blir till m = V*P, sen löser uppgiften
		return mass; // Returnar värdet
	}

	public static double svtVelocity(double distance, double time) {
		double Velocity = distance/time; //Använder formeln V = S/T
		return Velocity; // returnar värdet
	}
	
	public static double svtDistance(double velocity, double time) {
		double Distance = velocity*time; //Jag omvandlar formeln V = S/T till S = V*T
		return Distance; // returnar värdet
	}
	
	public static double svtTime(double distance, double velocity) {
		double Time = distance/velocity; // Omvandlar formeln V = S/T till  T = S/V
		return Time; // returnar värdet 
	}
	
	public static double work(double force, double distance) {
		double work = force*distance; // Använder formeln = W = Fs * s
		return work; // returnar värdet 
	}
	
	public static double power(double work, double time) {
		double power = work/time; // Använder formeln F = W * T
		return power; // returnar värdet 
		
	}
	


	

}
