package a;

public class Methoder {
	
	static double G = 9.82;
	static double p_0 = 1000;
	static double c = 299792458;
	
	
	public static void main(String[] args) {
		//Method 1
		System.out.println(fahrenheitToCelcius(50));
		
		//Method 2
		System.out.println(kelvinToCelsius(0)); 
		
		//Method 3
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		
		//Method 4
		System.out.println(pressureUnderWater(10));
		
		System.out.println("Trycket �r");
		System.out.println(pressureUnderWater(75)); // Anv�nder 75 meter
		System.out.println("N/M^2"); // Si enheten f�r tryck
		
		//Method 5
		System.out.println(kineticEnergy(2,2));
		
		//Method 6
		System.out.println(potentialEnergy(2,5));
		
		//Method 7
		System.out.println(fallSpeed(2.5));
		
		//Method 8
		System.out.println(delta(1,10));
		
		//Method 9
		System.out.println(volumeToMass(FluidTable.WATER,1));
		
		//Method 10
		System.out.println(volumeToMass(GasTable.AIR,1));
		
		//Method 11
		System.out.println(volumeToMass(SolidTable.IRON,1));
		
		System.out.println("J�rnet v�ger");
		System.out.println(volumeToMass(SolidTable.IRON,0.06)); //Jag omvandlar 60 DM^3 till 0.06 M^3 f�r att det ska passa SI-enheterna
		
		//Method 12
		System.out.println(svtVelocity(10,5));
		
		//Method 13
		System.out.println(svtDistance(10,5));
		
		System.out.println("Den kommer upp till");
		System.out.println(svtDistance(16.6,10.8)); // Omvandlar 60 km/h till m/s genom att g�ra 60/3.6. Sedan f�r jag ut tiden genom att r�kna ut formeln: T = S/V.
		System.out.println("Meter");
		
		System.out.println("Tomas hinner ");
		System.out.println(svtDistance(2.7,3000)); // Omvandlar 50 minuter till sekunder f�r att det ska passa SI-enheterna
		System.out.println("Meter ");

		//Method 14
		System.out.println(svtTime(10,2));
		
		//Method 15
		System.out.println(work(50,10));
		
		//Method 16
		System.out.println(power(1000,2));
		
		System.out.println("Det tar");
		System.out.println(power(721770,4.8)); // Anv�nder f�rst formeln W = MGH och r�knar ut att det blir 721,770. Sedan deviderar det med 4.8.
		System.out.println("Watt");
		
		//Method 17
		System.out.println(heat(SolidTable.IRON,1,2));
		
		//Method 18
		System.out.println(heat(FluidTable.WATER,1,10));
		
		System.out.println("Det kr�vs");
		System.out.println(heat(FluidTable.WATER,4,70)); //4 liter vatten v�ger ungef�r 4 kg, och skillnaden mellan 22 grader och kokpunkten (100) �r 78.
		System.out.println("joule");

		//Method 19
		System.out.println(heat(GasTable.AIR,1,1));
		
		//Method 20
		System.out.println(velocityToHeight(9.82));
		
		//Fr�ga 7
		System.out.println("den studsar");
		System.out.println(energyToHeight(1,12));
		System.out.println("g�nger");

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
	
	public static double heat(SolidTable solid, double mass, double DeltaT) {
		double heat = solid.heatCapacity*mass*DeltaT; // Anv�nder formeln E = c * m * DeltaT, d�r c �r v�rmecapiciteten
		return heat; // returnar v�rdet 
	}
	
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double heat =  fluid.heatCapacity*mass*deltaT; // Anv�nder formeln E = c * m * DeltaT, d�r c �r v�rmecapiciteten
		return heat; // returnar v�rdet 
	}
	
	public static double heat(GasTable gas, double mass, double deltaT) {
		double heat = gas.heatCapacity*mass*deltaT; // Anv�nder formeln E = c * m * DeltaT, d�r c �r v�rmecapiciteten
		return heat; // returnar v�rdet 
		
	}
	
	public static double velocityToHeight(double velocity) {
		double VetoHe = (velocity*velocity)/(2*G); //Jag anv�nder formeln MGH = mv^2, jag tar ut M vilket blir GH = v^2/2, Flyttar om G och formeln blir H = v^2/2*G
		return VetoHe; // returnar v�rdet 
	}
	
	public static int energyToHeight(double mass, double height) {
		double energy = mass*G*height; // R�knar ut f�rst energin f�r den i start positionen
		int counter = 0; // skapar en counter f�r att h�lla koll hur m�nga g�nger den d� studsar 
		
		while (energy>4.91) { // Medans den �r st�rre �n 4.91, vilket �r E = 1*9.82*0.5, vilket �r energin p� den h�jden den ska bli. ska den upprepa koden
			energy=energy*0.99; // Den tar ut 1% fr�n energin
			counter++; // l�gger till 1 i countern
		}
		// N�r den �r d� klar och while loopen inte uppfylls l�nger ska den hoppa till n�sta 
		
		return counter; // h�r
		
		
	}


	

}
