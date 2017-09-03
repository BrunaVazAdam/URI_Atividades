import java.util.Scanner;
public class Ativ3{
public static void main (String[]args){
	Scanner t = new Scanner(System.in);
		int HOUR,NUMBER;
		double SALARY;
		NUMBER=t.nextInt();
		HOUR=t.nextInt();
		SALARY=t.nextDouble();
		System.out.println("NUMBER = "+NUMBER);
		System.out.printf("SALARY = U$ %.2f%n",(SALARY*HOUR));;
		
		}
}