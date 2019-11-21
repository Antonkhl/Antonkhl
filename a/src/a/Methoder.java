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
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = volume*fluid.density; // Omvandlar formeln p = m/v till m = v*p.
		return mass; // Returnar v�rdet
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		double mass = volume*gas.density; // Anv�nder samma formel som i f�rra uppgiften, men med gas
		return mass; // Returnar v�rdet
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		double mass = volume*solid.density; //Anv�nder formeln P = M/V, jag formerar om den tills den blir till m = V*P, sen l�ser uppgiften
		return mass; // Returnar v�rdet
	}

	public static double svtVelocity(double distance, double time) {
		double Velocity = distance/time; //Anv�nder formeln V = S/T
		return Velocity; // returnar v�rdet
	}
	
	public static double svtDistance(double velocity, double time) {
		double Distance = velocity*time; //Jag omvandlar formeln V = S/T till S = V*T
		return Distance; // returnar v�rdet
	}
	
	public static double svtTime(double distance, double velocity) {
		double Time = distance/velocity; // Omvandlar formeln V = S/T till  T = S/V
		return Time; // returnar v�rdet 
	}
	
	public static double work(double force, double distance) {
		double work = force*distance; // Anv�nder formeln = W = Fs * s
		return work; // returnar v�rdet 
	}
	
	public static double power(double work, double time) {
		double power = work/time; // Anv�nder formeln F = W * T
		return power; // returnar v�rdet 
		
	}
	


	

}
