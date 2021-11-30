import java.util.Scanner;
public class Sandra5{
public static void main (String[] args){
int n1;
int n2;
int n3;
float med;
Scanner b = new Scanner(System.in);
System.out.println("Digite os 3 numeros");
int n1 = b.nextInt();
int n2 = b.nextInt();
int n3 = b.nextInt();
System.out.println("Calcule a media");
float med = (n1 + n2 + n3)/3;
System.out.println("A sua media e="+med);
}
}