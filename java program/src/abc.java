import java.util.Scanner;

public class abc {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Username?");
String Username = input.nextLine();

System.out.println("Ålder?");
String Ålder = input.nextLine();

System.out.println("Adress?");
String Adress = input.nextLine();

System.out.println("postnummer?");
String Postnummer = input.nextLine();

System.out.println("Stad?");
String Stad = input.nextLine();

System.out.println("Telefonnummer?");
String Telefonnummer = input.nextLine();

System.out.println("Vad heter du ? " + Username); 
System.out.println("Hur gammal är du? " + Ålder); 
System.out.println("Vad är din adress? " + Adress); 
System.out.println("Vad är din postnummer? " + Postnummer); 
System.out.println("Vilken stad bor du in? " + Stad); 
System.out.println("Vad är din telefonnummer? " + Telefonnummer); 

System.out.println("Information: ");
System.out.println("Namn:     " + Username);
System.out.println("Ålder:    " + Ålder + "År"); 
System.out.println("Adress:   " + Adress ); 
System.out.println(Postnummer + Stad); 
System.out.println("Telefon:  " + Telefonnummer ); 



}
}
