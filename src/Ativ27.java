import java.text.DecimalFormat;
import java.util.Scanner;
public class Ativ27 {
public static void main(String[]args){
	Scanner t = new Scanner(System.in);
	double X,Y;
	X=t.nextDouble();
	Y=t.nextDouble();
	if(X>0 && Y>0){
		System.out.println("Q1");
	}else if(X<0 && Y>0){
		System.out.println("Q2");
	}else if(X<0 && Y<0){
		System.out.println("Q3");
	}else if(X>0 && Y<0){
		System.out.println("Q4");
	}else if(X==0 && Y==0){
		System.out.println("Origem");
	}else if(X==0 && Y!=0){
		System.out.println("Eixo Y");
	}else if(X!=0 && Y==0){
		System.out.println("Eixo X");
	}
}
}
