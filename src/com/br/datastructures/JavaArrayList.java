package com.br.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<ArrayList<Integer>> container = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            String[] line = scanner.nextLine().split(" ");
            for (String item : line) {
                arrayList.add(Integer.parseInt(item));
            }
            container.add(arrayList);
        }

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] results = new String[q];
        for (int i = 0; i < q; i++) {
            String[] line = scanner.nextLine().split(" ");
            int x = Integer.parseInt(line[0]) - 1;
            int y = Integer.parseInt(line[1]);
            if (x < container.size()) {
                ArrayList<Integer> row = container.get(x);
                if (y < row.size()) {
                    results[i] = String.valueOf(row.get(y));
                    continue;
                }
            }
            results[i] = "ERROR!";
        }

        scanner.close();

        for (String result : results) {
            System.out.println(result);
        }
    }

}
