import java.util.Scanner;
public class Sandra1{
public static void main (String[] args){
int n1;
int n2;
int n3;
int n4;
int soma;
Scanner a = new Scanner(System.in);
System.out.println("Digite os numeros");
int n1 = a.nextInt();
int n2 = a.nextInt();
int n3 = a.nextInt();
int n4 = a.nextInt();
int soma = n1 + n2 + n3 + n4;
System.out.println("A soma desses numeros e="+soma);
}
}