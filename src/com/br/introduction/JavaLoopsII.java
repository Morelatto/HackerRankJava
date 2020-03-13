package com.br.introduction;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // number of queries
        int[][] results = new int[q][];
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            results[i] = series(a, b, n);
        }

        for (int[] result : results) {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static int[] series(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = a;
            for (int j = 0; j <= i; j++) {
                res[i] += Math.pow(2, j) * b;
            }
        }
        return res;
    }

}
