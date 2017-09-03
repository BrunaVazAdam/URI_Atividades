import java.util.Scanner;
public class Ativ8{
public static void main (String[]args){
	Scanner t=new Scanner(System.in);
		int A,B,C,MaiorAB;
		A=t.nextInt();
		B=t.nextInt();
		C=t.nextInt();
		MaiorAB=(A+B+ Math.abs(A-B))/2;
		MaiorAB=(MaiorAB+C+Math.abs(MaiorAB-C))/2;
		System.out.println(MaiorAB+" eh o maior");
		}
}
