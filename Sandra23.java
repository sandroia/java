import java.util.Scanner;
public class Sandra23{
public static void main (String[] args){
float engor;
float emagr;
float pesoeng;
float pesoemagr;
Scanner b = new Scanner(System.in);
System.out.println("Digite o peso dessa pessoa");
float engor = b.nextFloat();
float emagr = b.nextFloat();
System.out.println("Calcule o peso se a pessoa emgordar");
float pesoeng = (engor + 15%);
System.out.println("Calcule o peso se a pessoa emagrecer");
float pesoemagr = (emagr - 20%); 
System.out.println(" Se a pessoa engordar o seu peso sera =" +pesoeng);
System.out.println(" Se a pessoa emagrecer o seu peso sera = +pesoemagr");
}
}