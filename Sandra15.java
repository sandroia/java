import java.util.Scanner;
public class Sandra15{
public static void main (String[] args){
int n;
int n1;
int e;
Scanner s = new Scanner(System.in);
System.out.println("Digite os numeros");
//Os numeros devem ser maiores que 0;
int n = s.nextInt();
int n1 = s.nextInt();
System.out.println("Calcule os numeros");
int e = n ^ n1;
System.out.println("O resultado e="+e);
}
}