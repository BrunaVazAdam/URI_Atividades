import java.text.DecimalFormat;
import java.util.Scanner;
public class Ativ26 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		double n1,n2,n3,n4,n5,MEDIA,MF;
		DecimalFormat df = new DecimalFormat("0.0");
		n1=t.nextDouble();
		n2=t.nextDouble();
		n3=t.nextDouble();
		n4=t.nextDouble();
		MEDIA=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		System.out.println("Media: "+df.format(MEDIA));
		if(MEDIA>=7){
			System.out.println("Aluno aprovado.");
		}else if(MEDIA<5){
			System.out.println("Aluno reprovado.");
		}else if(MEDIA>=5 && MEDIA<=6.9){
			System.out.println("Aluno em exame.");
			n5=t.nextDouble();
			System.out.println("Nota do exame: "+df.format(n5));
			MF=(MEDIA+n5)/2;
			if(MF>=5){
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: "+df.format(MF));
			}else if(MF<=4.9){
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: "+df.format(MF));
			}
		}

	}

}
