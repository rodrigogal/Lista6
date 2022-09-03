package Lista6;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vet = new double[5];
		double soma = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		double menor = vet[0], maior = vet[1];
		
		for(int i = 0; i < 5; i++) {
			System.out.print(vet[i] + " ");
			if(vet[i] > maior) {
				maior = vet[i];
			}else if(vet[i] < menor) {
				menor = vet[i];
			}	
		}
		System.out.println();
		System.out.println("Menor número: " + menor);
		System.out.println("Maior número: " + maior);
		System.out.print("Media dos números: " + (soma / 5));
		
		sc.close();
	}

}
