import java.util.Scanner;
public class Ativ6{
public static void main (String[]args){
	Scanner t=new Scanner(System.in);
		int R;
		double VOLUME,PI=3.14159;
		R=t.nextInt();
		VOLUME= (4.0/3)*PI*Math.pow(R,3);
		System.out.printf("VOLUME = %.3f%n",VOLUME);
		}
}
