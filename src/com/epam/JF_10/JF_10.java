package com.epam.JF_10;

public class JF_10 {

    static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                printEvenString(n);
            } else {
                printOddString(n);
            }
        }
    }

    static void printOddString(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    static void printEvenString(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter integer parameter: the number n of matrix.");
        } else {
            if (args.length > 1) {
                System.out.println("WARNING! There are more than 1 parameters. Only the first one will be used.");
            }
            try {
                int n = Integer.parseInt(args[0]);
                if (n % 2 == 0) {
                    printMatrix(n);
                } else {
                    System.out.println("ERROR. n must be the even number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. The parameter can not be converted to integer.");
            }
        }
    }
}