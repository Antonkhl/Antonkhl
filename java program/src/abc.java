import java.util.Scanner;

public class abc {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Username?");
String Username = input.nextLine();

System.out.println("�lder?");
String �lder = input.nextLine();

System.out.println("Adress?");
String Adress = input.nextLine();

System.out.println("postnummer?");
String Postnummer = input.nextLine();

System.out.println("Stad?");
String Stad = input.nextLine();

System.out.println("Telefonnummer?");
String Telefonnummer = input.nextLine();

System.out.println("Vad heter du ? " + Username); 
System.out.println("Hur gammal �r du? " + �lder); 
System.out.println("Vad �r din adress? " + Adress); 
System.out.println("Vad �r din postnummer? " + Postnummer); 
System.out.println("Vilken stad bor du in? " + Stad); 
System.out.println("Vad �r din telefonnummer? " + Telefonnummer); 

System.out.println("Information: ");
System.out.println("Namn:     " + Username);
System.out.println("�lder:    " + �lder + "�r"); 
System.out.println("Adress:   " + Adress ); 
System.out.println(Postnummer + Stad); 
System.out.println("Telefon:  " + Telefonnummer ); 



}
}
