import java.util.Scanner;
public class Sandra12{
public static void main(String[] args){
float base;
float altura;
float Area;
Scanner c = new Scanner(System.in);
System.out.println("Digite o valor os valores");
float base = c.nextFloat();
float altura = c.nextFloat();
System.out.println("Calcule a area do triangulo");
float Area = (base * altura)/2 ;
System.out.println("A area do triangulo e=" +Area);
}
}