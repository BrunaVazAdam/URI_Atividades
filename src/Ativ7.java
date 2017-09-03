import java.util.Scanner;
public class Ativ7{
public static void main (String[]args){
	Scanner t=new Scanner(System.in);
		double A,B,C,TRIANGULO,CIRCULO,PI=3.14159,TRAPEZIO,QUADRADO,RETANGULO;
		A=t.nextDouble();
		B=t.nextDouble();
		C=t.nextDouble();
		TRIANGULO=(A*C)/2;
		CIRCULO=PI*Math.pow(C,2);
		TRAPEZIO=((A+B)/2)*C;
		QUADRADO=Math.pow(B,2);
		RETANGULO=A*B;
		System.out.printf("TRIANGULO: %.3f%n",TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n",CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n",TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n",QUADRADO);
		System.out.printf("RETANGULO: %.3f%n",RETANGULO);
		}
}
