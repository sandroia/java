import java.util.Scanner;
public class Sandra11{
public static void main(String[] args){
float salmi;
float salfun;
float quantsalmi;
Scanner a = new Scanner(System.in);
System.out.println("Digite o valor do salario minimo");
 salmi = a.nextFloat();
System.out.println("Digite o valor do salario do funcionario");
 salfun = a.nextFloat();
System.out.println("Calcule a quantidade de salario minimo");
 quantsalmi = salfun / salmi;
System.out.println("A quantidade de salario minimo e=" +quantsalmi);
}
}
