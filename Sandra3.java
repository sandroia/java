import java.util.Scanner;
public class Sandra3{
public static void main(String[] args){
int n1;
int n2;
int n3;
int mult;
Scanner a = new Scanner(System.in);
System.out.println("Digite os numeros");
int n1 = a.nextInt();
int n2 = a.nextInt();
int n3 = a.nextInt();
System.out.println("Calcule os 3 numeros");
int mult = n1 * n2 * n3;
System.out.println("A multiplicaçao é=" +mult);
}
}