import java.util.Scanner;
public class Sandra24{
public static void main (String[] args){
float salbfun;
float salr;
Scanner c = new Scanner(System.in);
System.out.println("Digite o salario base do funcionario");
float salbfun = c.nextFloat();
System.out.println("Calcule o salario a receber");
float salr = (salbfun + 50) + (salbfun - 10%); 
System.out.println("O salario que o funcionario recebe e="+salr);
}
}