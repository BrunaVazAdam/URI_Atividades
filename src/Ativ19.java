import java.util.Scanner;

public class Ativ19 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int tempo,horas,minutos,segundos;
		tempo = t.nextInt();
		
		horas = tempo/3600;
		minutos = (tempo/60)-(horas*60);
		segundos = tempo -(minutos*60)-(horas*3600);
		System.out.println(horas+":"+minutos+":"+segundos);
	}

}
