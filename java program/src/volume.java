import java.util.Scanner;
public class volume {
	Scanner Input = new Scanner(System.in);

public static void main(String[] args) {
	volume(20.0);             
}
public static double volume(double radius) {
	
	double Fullradius = radius*radius*radius; //Jag får ut den fullständiga radien så att jag kan senare använda den för min ekvation.
	double volume1 = 4*3.14*Fullradius; //Jag räknar ut 
	double Final = volume1/3; // Sen dividerar jag på 3 för att få min slut volym
	
	System.out.println(Final);
	
	return 3;
	}
}
