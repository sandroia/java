import java.util.Scanner;
public class Sandra18{
public static void main (String[] args){
float precp;
float novoprec;
Scanner n = new Scanner(System.in);
System.out.println("Digite o preço do produto");
 precp = n.nextFloat();
System.out.println("Calcule o novo preço");
 novoprec = precp - (precp*0.10);
System.out.println("O novo preço e="+novoprec);
}
}
