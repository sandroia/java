import java.util.Scanner;
public class Sandra28{
public static void main (String[] args){
float nuh;
float valsalm;
float ht;
float salbr;
float imp;
float salrec;
Scanner b = new Scanner(System.in);
System.out.println("Digite o numero de horas trabalhadas");
float nuh = b.nextFloat();
System.out.println("Digite o valor do salario minimo");
float valsalm = b.nextFloat();
System.out.println("Calcule a hora de trabalho");
float ht = valsalm / 2;
System.out.println("Calcule o salario bruto");
float salbr = nuh * ht;
System.out.println("Calcule o valor do imposto");
float imp = (salbr - 3%);
System.out.println("Calcule o salario a receber");
float salrec = salbr - imp;
System.out.println(" A hora de trabalho e  =" +ht );
System.out.println(" O salario bruto e = +salbr");
System.out.println(" O valor do imposto e =" +imp);
System.out.println(" O salario a receber e =" +salrec);
}
}