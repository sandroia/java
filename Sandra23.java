import java.util.Scanner;
public class Sandra23{
public static void main (String[] args){
float engor;
float emagr;
float pesoeng;
float pesoemagr;
Scanner b = new Scanner(System.in);
System.out.println("Digite o peso dessa pessoa");
 engor = b.nextFloat();
System.out.println("Calcule o peso se a pessoa emgordar");
 pesoeng = (engor + (0.15*engor));
System.out.println("Calcule o peso se a pessoa emagrecer");
 pesoemagr =(engor - (0.20*engor));
System.out.println(" Se a pessoa engordar o seu peso sera =" +pesoeng);
System.out.println(" Se a pessoa emagrecer o seu peso sera =" +pesoemagr);
}
}
