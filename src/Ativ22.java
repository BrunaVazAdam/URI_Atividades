import java.util.Scanner;
public class Ativ22 {
public static void main (String[]args){
	Scanner t=new Scanner(System.in);
	int A,B,C,D,SOMA1,SOMA2;
	A=t.nextInt();
	B=t.nextInt();
	C=t.nextInt();
	D=t.nextInt();
	SOMA1=C+D;
	SOMA2=A+B;
	if(B>C && D>A && SOMA1>SOMA2 && A>0 && D>0 && A%2==0 ){
		System.out.println("Valores aceitos");
	}else{
		System.out.println("Valores nao aceitos");
	}
  }
}
