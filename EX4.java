package Lista6;

import java.util.Arrays;
import java.util.Scanner;

public class EX4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[20];
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Número " + (i+1) + ": "); 
			vet[i] = sc.nextInt();
		}
		
		
		int[] vetSemRepeticao = removeRepetidos(vet);
		
		System.out.println(Arrays.toString(vetSemRepeticao));
		
		sc.close();

	}
	
	private static int[] removeRepetidos(int[] vet) {
		int n = vet.length;
		int[] vetSemRepeticao = Arrays.copyOf(vet, n);
		
		for(int i = 0; i < n; i++) {
			int k = i + 1;
			int nRemovidos = 0;
			for(int j = i + 1; j < n; j++) {
				if(vetSemRepeticao[j] == vetSemRepeticao[i]) {
					nRemovidos++;
				}else {
					vetSemRepeticao[k++] = vetSemRepeticao[j];
				}
			}
			n -= nRemovidos;
			
		}
		
		vetSemRepeticao = Arrays.copyOf(vetSemRepeticao, n);
		
		return vetSemRepeticao;
	}
		
		
}