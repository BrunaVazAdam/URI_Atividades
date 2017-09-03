import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;
public class Ativ23{
    public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		double A, B, C, R1, R2;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if ((A == 0) | (B*B - 4*A*C < 0)) {
			System.out.println("Impossivel calcular");
		}
		else {
			R1 = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
			R2 = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
			System.out.println("R1 = " + df.format(R1));
			System.out.println("R2 = " + df.format(R2));
		}
    }
}
