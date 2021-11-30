import java.util.Scanner;
public class Sandra19{
public static void main (String[] args){
float salfun;
float percau;
float valoraum;
float novosal;
Scanner n = new Scanner(System.in);
System.out.println("Digite o salario do funcionario e o percentual aumento");
float salfun = n.nextFloat();
float percau = n.nextFloat ();
System.out.println("Calcule o valor do aumento");
float valoraum = salfun + percau;
System.out.println("Calcule o novo salario");
float novosal = novosal * valoraum;
System.out.println("O valor do aumento e="+valoraum);
System.out.println("O novo salario e =" +novosal);
}
}