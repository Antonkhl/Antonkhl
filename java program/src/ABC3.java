import java.util.Scanner;

public class ABC3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

	
System.out.println("Värdet på x?");
int x = input.nextInt();

System.out.println("Värdet på y?");
int y = input.nextInt();
int a = 0;

if (x>a && y>a) { 
	System.out.println("Talen ska vara i kvadrant 1");
}
if (x<a && y>a) { 
	System.out.println("Talen ska vara i kvadrant 2");
}
if (x<a && y<a) { 
	System.out.println("Talen ska vara i kvadrant 3");
}
if (x>a && y<a) { 
	System.out.println("Talen ska vara i kvadrant 4");
}
}
}