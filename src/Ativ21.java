import java.util.Scanner;
public class Ativ21 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n100,n50,n20,n10,n5,n2,m1,m50,m25,m10,m5,m01,soma;
		double valor,difm;
		valor=t.nextDouble();
		soma=(int) valor;
		n100=soma/100;
		soma%=100;
		n50=soma/50;
		soma%=50;
		n20=soma/20;
		soma%=20;
		n10=soma/10;
		soma%=10;
		n5=soma/5;
		soma%=5;
		n2=soma/2;
		soma%=2;
		m1=soma;
		difm = valor-(int)valor;
		m50=(int)(difm/0.5);
		difm%=0.5;
		m25=(int)(difm/0.25);
		difm%=0.25;
		m10=(int)(difm/0.1);
		difm%=0.1;
		m5=(int)(difm/0.05);
		difm%=0.05;
		m01=(int)(difm/0.01);
		System.out.println("NOTAS:");
		System.out.println(n100+" nota(s) de R$ 100.00");
		System.out.println(n50+" nota(s) de R$ 50.00");
		System.out.println(n20+" nota(s) de R$ 20.00");
		System.out.println(n10+" nota(s) de R$ 10.00");
		System.out.println(n5+" nota(s) de R$ 5.00");
		System.out.println(n2+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(m1+" moeda(s) de R$ 1.00");
		System.out.println(m50+" moeda(s) de R$ 0.50");
		System.out.println(m25+" moeda(s) de R$ 0.25");
		System.out.println(m10+" moeda(s) de R$ 0.10");
		System.out.println(m5+" moeda(s) de R$ 0.05");
		System.out.println(m01+" moeda(s) de R$ 0.01");
	}

}
