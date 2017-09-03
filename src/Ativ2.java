import java.util.Scanner;
public class Ativ2 {
	public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    double A=2,B=3,C=5,MEDIA;
	A=t.nextDouble();
	B=t.nextDouble();
	C=t.nextDouble();
	MEDIA=((A*2)+(B*3)+(C*5))/10;
	System.out.printf("MEDIA = %.1f%n",MEDIA);
		}
}