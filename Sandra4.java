import java.util.Scanner;
public class Sandra4{
public static void main(String[] args){
int x1;
int x2;
int div;
Scanner v = new Scanner(System.in);
System.out.println("Digite os numeros");
int x1 = v.nextInt();
int x2 = v.nextInt();
System.out.println("Calcule a divisao");
int div = x1 / x2;
System.out.println("A divisao é=" +div);
}
}