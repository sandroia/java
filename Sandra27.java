import java.util.Scanner;
public class Sandra27{
public static void main (String[] args){
float precfv;
float perld;
float perclimp;
float lucd;
float valimp;
float precfv;
Scanner b = new Scanner(System.in);
System.out.println("Digite o preco da fabrica do veiculo");
float precfv = b.nextFloat();
System.out.println("Digite o percentual de lucro do distribuidor");
float perld = b.nextFloat();
System.out.println("Digite o percentual do imposto");
float percimp = b.nextFloat();
System.out.println("Calcule o lucro do distribuidor");
float lucd = precfv / perld;
System.out.println("Calcule o valor do imposto");
float valimp = (precfv + percimp);
System.out.println("Calcule o preco final do veiculo");
float precfv = precfv + lucd + valimp;
System.out.println(" O lucro do distribuidor e  =" +lucd);
System.out.println(" O valor do imposto e = +valimp");
System.out.println(" O preco final do veiculo e =" +precfv);
}