import java.util.Scanner;
public class Sandra7{
public static void main(String[] args){
int diagonalmaior;
int diagonalmenor;
int A;
Scanner a = new Scanner(System.in);
System.out.println("Digite os valores");
int diagonalmaior = a.nextInt();
int diagonalmenor = a.nextInt();
System.out.println("Calcule a area do losango");
int A = (diagonalmaior * diagonalmenor)/2;
System.out.println("A area do losango e=" +A);
}
}