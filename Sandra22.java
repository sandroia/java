import java.util.Scanner;
public class Sandra22{
public static void main (String[] args){
float salff;
float valorv;
float comm;
float salfinal;
Scanner s = new Scanner(System.in);
System.out.println("Digite o salario fixo do funcionario");
float salff = s.nextFloat();
System.out.println("Digite o valor de suas vendas");
float valorv = s.nextFloat();
System.out.println("Calcule a comissao");
float comm = (salff + 4%);
System.out.println("A comissao do funcionario e=" +comm);
System.out.println("Calcule o seu salario final");
float salfinal = comm + valorv;
System.out.println("O seu salario e=" +salfinal);
}
}