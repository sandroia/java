import java.util.Scanner;
public class Sandra25{
public static void main (String[] args){
float valdep;
float valtj;
float valrend;
float valtt;
Scanner b = new Scanner(System.in);
System.out.println("Digite o valor do deposito");
float valdep = b.nextFloat();
System.out.println("Digite o valor da taxa em juros");
float valtj = b.nextFloat();
System.out.println("Calcule o valor do rendimento");
float valrend = valdep + valtj; 
System.out.println("O valor do rendimento e=" +valrend);
System.out.println("Calcule o valor total do rendimento");
float valtt = valtt + valrend; 
System.out.println("O valor total do rendimento e=" +valtt);
}
}