package Lista6;

import java.util.Scanner;

public class EX1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double soma = 0;
		int numeroNegativo = 0;
		int i = 0;
		double[] vetor = new double[10];

		System.out.println("Informe 10 números reais abaixo!");
		System.out.println("");
		
		for(i = 0; i < 10; i++) {
			System.out.println("Número " + (i+1) + ":");
			vetor[i] = sc.nextDouble();
			if(vetor[i] < 0) {
				numeroNegativo += 1;
			}else {
				soma += vetor[i];
			}

		}
		System.out.println("Quantidade de números negativos: " + numeroNegativo);
		System.out.println("Soma dos positivos: " + soma);

		sc.close();
	}
}
