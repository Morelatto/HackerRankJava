package com.br.datastructures;

import java.util.Scanner;

public class JavaSubarray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int negativeSums = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) negativeSums++;
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum < 0) negativeSums++;
            }
        }
        System.out.println(negativeSums);
    }

}
