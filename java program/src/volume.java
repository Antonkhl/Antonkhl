import java.util.Scanner;
public class volume {
	Scanner Input = new Scanner(System.in);


public static void main(String[] args) {
	
	volume(20.0);
}

public static double volume(double radius) {
	
	double radius1 = radius*radius*radius;
	double radius2 = 4*3.14*radius1;
	double volome1 = radius2/3;
	
	System.out.println(volome1);
	
	return 1;
	}
}
