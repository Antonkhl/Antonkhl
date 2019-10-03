import java.util.Scanner;

public class spavanac {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
 int tid = 1440;
 
 System.out.println("Vilken timma vaknar du upp?");
 int tim = input.nextInt();
 System.out.println("vilka minuter?");
 int min = input.nextInt();
 
 int min2 = tim*60;
 int min3 = min2 + min;
 int min4 = min3-45;
 int min5 = min4/60;
 
 if (min>0) { 
 double min7 = min4%60.0;
 double min8 = 60*min7;
 System.out.println("Du borde vakna " + min5  + " timmar " + min7 + " minuter ");
 }
 
if (min<=0) {
	 System.out.println("Du borde vakna " + min5  + " timmar " + " 15 minuter");
 }
 }
 
	}

