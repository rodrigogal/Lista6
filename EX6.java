package Lista6;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		System.out.print("Informe um número inteiro: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			vet[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			if(vet[i] % x == 0) {
				System.out.print(vet[i] + " ");
			}
		}

		sc.close();
	}

}