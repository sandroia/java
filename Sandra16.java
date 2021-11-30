import java.util.Scanner;
public class Sandra16{
public static void main (String[] args){
int a = 12;
int b = 3;
int c = 1,760;
int poleg;
int pe;
int jard;
float milhaa;
Scanner b = new Scanner(System.in);
System.out.println("Digite os valores em pes");
int pe = b.nextInt();
System.out.println("Converta polegadas");
int poleg = pe * a;
System.out.println("Converta jardas");
int jard = poleg * b;
System.out.println("Converta milha"); 
float milhaa = jard * c;
System.out.println(" Em polegadas e="+poleg);
System.out.println(" Em jardas e="+jard);
System.out.println(" Em milha e="+milhaa);
}
}