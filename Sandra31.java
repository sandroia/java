import java.util.Scanner;
public class Sandra31{
public static void main (String[] args){
float valsalm;
float quantqw;
float valqw;
float valp;
float vald;
Scanner b = new Scanner(System.in);
System.out.println("Digite o valor do salario minimo");
float valsalm = b.nextFloat();
System.out.println("Digite a quantidade de quilowatts consumido por uma residencia");
float quantqw = b.nextFloat();
System.out.println("Calcule o valor de cada quilowatt");
float valqw = (valsalm - 1/5);
System.out.println("Calcule o valor a ser pago");
float valp = valqw * quantqw;
System.out.println("Calcule o valor a ser pago com desconto");
float vald = (valp - 15%);
System.out.println(" O valor do quilowatt e  =" +valqw );
System.out.println(" O valor a ser pago e = +valp");
System.out.println(" O valor a ser descontado e =" +vald);
}
}