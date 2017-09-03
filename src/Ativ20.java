import java.util.Scanner;

public class Ativ20 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int tempo,anos,meses,dias;
		tempo=t.nextInt();
		anos = tempo/365;
		meses = (tempo%365)/30;
		dias = (tempo%365)%30;
		System.out.println(anos+" ano(s)");
		System.out.println(meses+" mes(es)");
		System.out.println(dias+" dia(s)");
	}

}
