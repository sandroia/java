import java.util.Scanner;
public class Sandra9{
public static void main(String[] args){
int pq;
int pg;
Scanner a = new Scanner(System.in);
System.out.println("Digite o peso em quilos");
int pq = a.nextInt();
System.out.println("Calcule o peso em gramas");
int pg = pq * 1000;
System.out.println("O seu peso em gramas e=" +pg);
}
}