package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] vector_A = new int[n];
        int[] vector_B = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vector_A.length; i++){
            vector_A[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vector_B.length; i++){
            vector_B[i] = scanner.nextInt();
        }

        int[] vectorSum = new int[n];
        for (int i = 0; i < vectorSum.length; i++) {
            vectorSum[i] = vector_A[i] + vector_B[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int j : vectorSum) {
            System.out.println(j);
        }
        scanner.close();
    }
}
