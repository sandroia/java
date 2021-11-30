import java.util.Scanner;
public class Sandra21{
public static void main (String[] args){
float salbf;
float salrec;
Scanner b = new Scanner(System.in);
System.out.println("Digite o salario base do funcionario");
float salbf = b.nextFloat();
System.out.println("Calcule o salario a receber");
float salrec = (salbf + 5%) + (salbf - 7%); 
System.out.println("O salario que o funcionario recebe e="+salrec);
}
}