import java.util.Scanner;

public class abc2 {
	
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Först nummret?");
int ett = input.nextInt();

System.out.println("Andra nummret?");
int tva = input.nextInt();

System.out.println("tredje nummret?");
int tre = input.nextInt();

System.out.println("fjärde nummret?");
int fyra = input.nextInt();

System.out.println("femte nummret?");
int fem = input.nextInt();

System.out.println("sexte nummret?");
int sex = input.nextInt();

System.out.println("sjette nummret?");
int sju = input.nextInt();

System.out.println("åttonde nummret?");
int atta = input.nextInt();

System.out.println("nioended nummret?");
int nio = input.nextInt();

System.out.println("tioende nummret?");
int tio = input.nextInt();

if (ett>tva && ett>tre && ett>fyra && ett>fem && ett>sex && ett>sju && ett>atta && ett>nio && ett>tio) {
	System.out.println("Största talet är " + ett);
}	
if (tva>ett && tva>tre && tva>fyra && tva>fem && tva>sex && tva>sju && tva>atta && tva>nio && tva>tio) {
	System.out.println("Största talet är " + tva);
}
if (tre>ett && tre>tva && tre>fyra && tre>fem && tre>sex && tre>sju && tre>atta && tre>nio && tre>tio) {
	System.out.println("Största talet är " + tre);
}
if (fyra>ett && fyra>tva && fyra>tre && fyra>fem && fyra>sex && fyra>sju && fyra>atta && fyra>nio && fyra>tio) {
	System.out.println("Största talet är " + fyra);
}
if (fem>ett && fem>tva && fem>tre && fem>fyra && fem>sex && fem>sju && fem>atta && fem>nio && fem>tio) {
	System.out.println("Största talet är " + fem);
}
if (sex>ett && sex>tva && sex>tre && sex>fyra && sex>fem && sex>sju && sex>atta && sex>nio && sex>tio) {
	System.out.println("Största talet är " + sex);
}
if (sju>ett && sju>tva && sju>tre && sju>fyra && sju>fem && sju>sex && sju>atta && sju>nio && sju>tio) {
	System.out.println("Största talet är " + sju);
}
if (atta>ett && atta>tva && atta>tre && atta>fyra && atta>fem && atta>sex && atta>sju && atta>nio && atta>tio) {
	System.out.println("Största talet är " + atta);
}
if (nio>ett && nio>tva && nio>tre && nio>fyra && nio>fem && nio>sex && nio>sju && nio>atta && nio>tio) {
	System.out.println("Största talet är " + nio);
}
if (tio>ett && tio>tva && tio>tre && tio>fyra && tio>fem && tio>sex && tio>sju && tio>atta && tio>nio) {
	System.out.println("Största talet är " + tio);
}

}
}

