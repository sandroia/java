import java.util.Scanner;
public class Sandra10{
public static void main(String[] args){
int basemaior;
int basemenor;
float altura;
float A;
Scanner s = new Scanner(System.in);
System.out.println("Digite os valores");
int basemaior = s.nextInt();
int basemenor = s.nextInt();
float altura = s.nextFloat();
System.out.println("Calcule a area do trapesio");
float A = ((basemaior + basemenor) * altura) ;
System.out.println("A area do trapesio e=" +A);
}
}