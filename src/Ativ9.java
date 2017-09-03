import java.text.DecimalFormat;
import java.util.Scanner;
public class Ativ9 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int X;
		double Y,CONSUMO;
		X=t.nextInt();
		Y=t.nextDouble();
		CONSUMO=X/Y;
		System.out.println(df.format(CONSUMO)+" km/l");
	}
}