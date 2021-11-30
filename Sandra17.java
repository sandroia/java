import java.util.Scanner;
public class Sandra17{
public static void main (String[] args){
float salf;
float novosal;
Scanner s = new Scanner(System.in);
System.out.println("Digite o salario do funcionario");
float salf = s.nextFloat();
System.out.println("Calcule o novo salario");
float novosal = salf + 25%;
System.out.println("O novo salario do funcionario e="+novosal);
}
}