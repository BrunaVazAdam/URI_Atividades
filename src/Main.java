import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		double x1 , y1, x2, y2, distance;
		x1 = t.nextDouble();
		y1 = t.nextDouble();
		x2 = t.nextDouble();
		y2 = t.nextDouble();
		
		distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println(df.format(distance));
	}
}
