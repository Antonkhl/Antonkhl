import java.util.Scanner;
public class volume {
	Scanner Input = new Scanner(System.in);

public static void main(String[] args) {
	volume(20.0);             
}
public static double volume(double radius) {
	
	double Fullradius = radius*radius*radius; //Jag f�r ut den fullst�ndiga radien s� att jag kan senare anv�nda den f�r min ekvation.
	double volume1 = 4*3.14*Fullradius; //Jag r�knar ut 
	double Final = volume1/3; // Sen dividerar jag p� 3 f�r att f� min slut volym
	
	System.out.println(Final);
	
	return 3;
	}
}
