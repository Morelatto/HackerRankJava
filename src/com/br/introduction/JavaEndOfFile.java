package com.br.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int i = 1;
        while (scanner.hasNext()) {
            builder.append(i);
            builder.append(" ");
            builder.append(scanner.nextLine());
            builder.append("\n");
            i++;
        }
        scanner.close();
        System.out.println(builder.toString());
    }
}
