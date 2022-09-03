package Lista6;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vet = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + ": ");
			vet[i] = sc.nextDouble();
		}
		System.out.println("Valores que se repetem: ");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(vet[i] == vet[j] && i != j) {
					System.out.println(vet[i]);
				}
			}
		}
		
		sc.close();
	}

}