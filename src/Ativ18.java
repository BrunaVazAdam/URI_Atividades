import java.util.Scanner;
public class Ativ18 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int valor=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0,soma=0;
		valor=t.nextInt();
		do{
			if(valor>0){
			if((valor-soma)>=100){
				n100++;
				soma=soma+100;
			}else if((valor-soma)>=50){
				n50++;
				soma=soma+50;
			}else if((valor-soma)>=20){
				n20++;
				soma=soma+20;
			}else if((valor-soma)>=10){
				n10++;
				soma=soma+10;
			}else if((valor-soma)>=5){
				n5++;
				soma=soma+5;
			}else if((valor-soma)>=2){
				n2++;
				soma=soma+2;
			}else if((valor-soma)>=1){
				n1++;
				soma=soma+1;
			}
			}else{
				if((valor-soma)<=-100){
					n100--;
					soma=soma-100;
				}else if((valor-soma)<=-50){
					n50--;
					soma=soma-50;
				}else if((valor-soma)<=-20){
					n20--;
					soma=soma-20;
				}else if((valor-soma)<=-10){
					n10--;
					soma=soma-10;
				}else if((valor-soma)<=-5){
					n5--;
					soma=soma-5;
				}else if((valor-soma)<=-2){
					n2--;
					soma = soma-2;
				}else if((valor-soma)<=-1){
					n1--;
					soma=soma-1;
				}
			}
		}while(soma!=valor);
		System.out.println(valor);
		System.out.println(n100+" nota(s) de R$ 100,00");
		System.out.println(n50+" nota(s) de R$ 50,00");
		System.out.println(n20+" nota(s) de R$ 20,00");
		System.out.println(n10+" nota(s) de R$ 10,00");
		System.out.println(n5+" nota(s) de R$ 5,00");
		System.out.println(n2+" nota(s) de R$ 2,00");
		System.out.println(n1+" nota(s) de R$ 1,00");
	}
}
