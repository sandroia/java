import java.util.Scanner;
public class Sandra13{
public static void main(String[] args){
int AnoDeNasc;
int AnoActual;
int idd;
int idade;
Scanner a = new Scanner(System.in);
System.out.println("Digite o ano de nascimento e a idade actual");
int AnoDeNasc = a.nextInt();
int AnoActual = a.nextInt();
System.out.println("Calcule a idade da pessoa");
int idd = AnoActual - AnoDeNasc;
System.out.println("A idade dessa pessoa e=" +idd);
System.out.println("Quantos ano ela tera em 2050?");
int idade = idd + (2050 - AnoActual);
System.out.println("A sua idade sera =" +idade);
}
}