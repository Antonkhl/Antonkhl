import java.util.Scanner;
public class volume {
	Scanner Input = new Scanner(System.in);


public static void main(String[] args) {
	
	volome(40);
}

public static void volome(double radius) {
	
	double radien = radius*radius*radius;
	double volym1 = radien*3.14*4;
	double volym2 = volym1 % 3;
	
	System.out.println("volymen är " + volym2);
	
	}
}
