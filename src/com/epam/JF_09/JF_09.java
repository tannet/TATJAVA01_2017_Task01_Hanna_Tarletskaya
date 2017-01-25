package com.epam.JF_09;

public class JF_09 {

    // what arrays contain?(int)
    // how should we initialize the arrays? (random)

    static int[] mergeArrays(int[] A, int[] B, int k) {
        int[] newArray = new int[A.length + B.length];
        System.arraycopy(A, 0, newArray, 0, k);
        System.arraycopy(B, 0, newArray, k, B.length);
        System.arraycopy(A, k, newArray, k + B.length, A.length - k);
        return newArray;
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
            System.out.println("Enter 3 integer parameters: the array lengths and number where merging starts.");
        } else if (args.length < 3) {
            System.out.println("ERROR. Number of parameters is less than 3.");
        } else {
            if (args.length > 3) {
                System.out.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
            }
            try {
                int aSize = Integer.parseInt(args[0]);
                int bSize = Integer.parseInt(args[1]);
                int k = Integer.parseInt(args[2]);

                if ((aSize > 0) && (bSize > 0)) {
                    int[] aArray = new int[aSize];
                    int[] bArray = new int[bSize];
                    arrayInitialization(aArray);
                    arrayInitialization(bArray);

                    //printArray(aArray);
                    //printArray(bArray);

                    if (k >= 0 && k < aArray.length) {
                        int[] mergeArray = mergeArrays(aArray, bArray, k);
                        printArray(mergeArray);
                    } else {
                        System.out.println("ERROR. Value of k must be in range of A-array indexes. Merge is not possible.");
                    }
                } else {
                    System.out.println("ERROR. Size of the array must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to integer.");
            }
        }
    }
}