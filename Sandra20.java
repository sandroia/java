import java.util.Scanner;
public class Sandra20{
public static void main (String[] args){
float custt;
float precc;
float quantc;
Scanner n = new Scanner(System.in);
System.out.println("Digite o custo de um espetaculo teatral");
 custt = n.nextFloat();
System.out.println("Digite o preco do convite");
 precc = n.nextFloat();
System.out.println("Calcule a quantidade de convites");
 quantc = custt /precc; 
System.out.println("A quantidade de covite que devem ser vendidos e="+quantc);
}
}
