package com.epam.JF_08;

public class JF_08 {

    static int sumOfNumbers(int[] A, int K) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }
        return sum;
    }

    static int[] arrayInitialization(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + i + " " + array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter 2 int parameters: the array length and K.");
        } else if (args.length < 2) {
            System.out.println("ERROR. Number of parameters is less than 2.");
        } else {
            if (args.length > 2) {
                System.out.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
            }
            try {
                int N = Integer.parseInt(args[0]);
                int K = Integer.parseInt(args[1]);

                int[] A = new int[N];
                arrayInitialization(A);
                //printArray(A);

                System.out.println(sumOfNumbers(A, K));
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to integer.");
            }
        }
    }
}