package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int menor = 0, position = 0;
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			if (i == 0) {
				menor = X[i];
				position = i;
			} else if (X[i] < menor) {
				menor = X[i];
				position = i;
			}
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + position);
		sc.close();
	}
}
