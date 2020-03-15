package com.br.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if ("Insert".equals(query)) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                arr.add(x, y);
            }

            if ("Delete".equals(query)) {
                int x = scanner.nextInt();
                arr.remove(x);
            }
        }

        for (Integer e : arr) {
            System.out.print(e + " ");
        }
    }

}
