import java.util.Scanner;

public class R2 {
public static void main(String[] args) {
Scanner Input = new Scanner(System.in);

System.out.println("Vad är första talet?");
int R1 = Input.nextInt();

System.out.println("Vad är medelvärdet?");
int S = Input.nextInt();

int S1 = S*2;
int R2 = S1 - R1;


System.out.println("Den andra talet är" +  R2);




}
}