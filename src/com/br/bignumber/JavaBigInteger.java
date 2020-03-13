package com.br.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger aBigInteger = new BigInteger(a);
        BigInteger bBigInteger = new BigInteger(b);

        System.out.println(aBigInteger.add(bBigInteger));
        System.out.println(aBigInteger.multiply(bBigInteger));

        scanner.close();
    }

}
