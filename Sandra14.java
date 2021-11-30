import java.util.Scanner;
public class Sandra14{
public static void main(String[] args){
int AnoDeNasc;
int AnoActual;
int iddano;
int iddmes;
int iddias;
int iddsem;
Scanner c = new Scanner(System.in);
System.out.println("Digite o ano de nascimento e a idade actual");
int AnoDeNasc = c.nextInt();
int AnoActual = c.nextInt();
System.out.println("Calcule a idade em ano");
int iddano = AnoActual - AnoDeNasc;
System.out.println("Calcule a idade em meses");
int iddmes = iddano * 12;
System.out.println("Calcule a idade em dias");
int iddias = iddano * 365;
System.out.println("Calcule a idade em semanas");
int iddsem = iddano * 48; 
System.out.println("A sua idade em ano e =" +iddano);
System.out.println("A sua idade em meses e =" +iddmes);
System.out.println("A sua idade em dias e =" +iddias);
System.out.println("A sua idade em meses e =" +iddsem);
}
}