import java.util.Scanner;
public class Sandra6{
public static void main (String[] args){
int nt1;
int nt2;
int nt3;
float peso1;
float peso2;
float peso3;
float medpon;
Scanner s = new Scanner(System.in);
System.out.println("Digite os valores");
int nt1 = s.nextInt();
int nt2 = s.nextInt();
int nt3 = s.nextInt();
float peso1 = s.nextFloat();
float peso2 = s.nextFloat();
float peso3 = s.nextFloat();
System.out.println("Calcule a media ponderada");
float medpon = ((nt1 * peso1) + (nt2 * peso2) + (nt3 * peso3)) / (peso1 + peso2 + peso3) ;
System.out.println("A sua media ponderada e="+medpon);
}
}