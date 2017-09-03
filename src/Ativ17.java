import java.text.DecimalFormat;
import java.util.Scanner;

public class Ativ17 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int horas, velocidade;
		float combustivel,km;
		DecimalFormat df = new DecimalFormat("0.000");
		
		horas =t.nextInt();
		velocidade = t.nextInt();
		
		km = velocidade*horas;
		combustivel = km/12;
		System.out.println(df.format(combustivel));
	}

}
