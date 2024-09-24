import java.util.Scanner;

public class SistemaUrna {

	public static void main(String[] args) {
		double candA, candB, candC, nul, bran, res, res2, res3, res4, res5, res6, perC;
		perC = 100;
		Scanner sc =  new Scanner(System.in);

		//processamento
		System.out.println("A quantidade total de votos válidos para o candidato A foi: ");
		candA = sc.nextInt();
		System.out.println("A quantidade total de votos válidos para o candidato B foi: ");
		candB = sc.nextInt();
		System.out.println("A quantidade de votos válidos para o candidato C foi: ");
		candC =  sc.nextInt();
		System.out.println("A quantidade de votos nulos foi: ");
		nul =  sc.nextInt();
		System.out.println("A quantidade de votos em branco foi: ");
		bran = sc.nextInt();

		res = candA + candB + candC + nul + bran;
		System.out.println("A quantidade total de eleitores foi: " + res);


		res2 = candA/ res *perC;
		System.out.println("O percentual de votos válidos para o candidato A foi: " + res2);

		res3 = candB/res *perC;
		System.out.println("O percentual de votos válidos para o candidato B foi: " + res3);

		res4 = candC/res *perC;
		System.out.println("O percentual de votos válidos para o candidato C foi: " + res4);
		res5 = nul/res *perC;
		System.out.println("O percentual de votos nulos foi: " + res5);

		res6 =  bran/ res*perC;
		System.out.println("O percentual de votos em branco foi: " + res6);

		


	}

}
