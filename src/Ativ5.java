import java.util.Scanner;
public class Ativ5{
public static void main (String[]args){
	Scanner t=new Scanner(System.in);
		int PECA1,PECA2,COD1,COD2;
		double VALOR1,VALOR2;
		PECA1=t.nextInt();
		COD1=t.nextInt();
		VALOR1=t.nextDouble();
		PECA2=t.nextInt();
		COD2=t.nextInt();
		VALOR2=t.nextDouble();
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",VALOR1*COD1+VALOR2*COD2);
		}
}